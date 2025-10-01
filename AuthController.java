package com.app.controller;

import com.app.entity.User;
import com.app.payload.JWTTokenDto;
import com.app.payload.LoginDto;
import com.app.repository.UserRepository;
import com.app.service.JWTService;
import com.app.service.OTPService;
import com.app.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final UserRepository userRepository;
    private final UserService userService;
    private final OTPService otpService;
    private final JWTService jwtService;

    public AuthController(UserRepository userRepository,
                          UserService userService,
                          OTPService otpService,
                          JWTService jwtService) {
        this.userRepository = userRepository;
        this.userService = userService;
        this.otpService = otpService;
        this.jwtService = jwtService;
    }

    // ---------------- Normal signup ----------------
    @PostMapping("/signup")
    public ResponseEntity<?> createUser(@RequestBody User user) {
        if (userRepository.findByUsername(user.getUsername()).isPresent()) {
            return new ResponseEntity<>("username exists", HttpStatus.CONFLICT);
        }
        if (userRepository.findByEmailId(user.getEmailId()).isPresent()) {
            return new ResponseEntity<>("email exists", HttpStatus.CONFLICT);
        }

        String hashpw = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(10));
        user.setPassword(hashpw);
        user.setRole("ROLE_USER");
        userRepository.save(user);
        return new ResponseEntity<>("user created", HttpStatus.CREATED);
    }

    // ---------------- Normal login ----------------
    @PostMapping("/usersign")
    public ResponseEntity<?> userSignIn(@RequestBody LoginDto dto) {
        String jwtToken = userService.verifyLogin(dto);
        if (jwtToken != null) {
            JWTTokenDto tokenDto = new JWTTokenDto();
            tokenDto.setToken(jwtToken);
            tokenDto.setTokenType("JWT");
            return new ResponseEntity<>(tokenDto, HttpStatus.CREATED);
        }
        return new ResponseEntity<>("Invalid credentials", HttpStatus.UNAUTHORIZED);
    }

    // ---------------- OTP login ----------------
    @PostMapping("/login-otp")
    public ResponseEntity<?> generateOtp(@RequestParam String mobile) {
        Optional<User> opUser = userRepository.findByMobile(mobile);
        if (opUser.isEmpty()) {
            return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
        }

        String otp = otpService.generateOTP(mobile);
        // In production you would send OTP via SMS/Email. Here we just return it.
        return ResponseEntity.ok("OTP generated for " + mobile + " : " + otp);
    }

    @PostMapping("/validate-otp")
    public ResponseEntity<?> validateOtp(@RequestParam String mobile,
                                         @RequestParam String otp) {
        boolean status = otpService.validateOTP(mobile, otp);
        if (!status) {
            return new ResponseEntity<>("Invalid or expired OTP", HttpStatus.UNAUTHORIZED);
        }

        Optional<User> opUser = userRepository.findByMobile(mobile);
        if (opUser.isEmpty()) {
            return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
        }


        String jwtToken = jwtService.generateToken(opUser.get().getUsername());
        JWTTokenDto tokenDto = new JWTTokenDto();
        tokenDto.setToken(jwtToken);
        tokenDto.setTokenType("JWT");

        return ResponseEntity.ok(tokenDto);
    }
}

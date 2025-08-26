package com.exampleapi.controller;

import com.exampleapi.entity.Registration;
import com.exampleapi.payload.RegistrationDto;
import com.exampleapi.service.RegistrationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/registration")
public class RegistrationController {

    private RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }
    //http://localhost:8080/api/v1/registration

    @PostMapping
    public  ResponseEntity<RegistrationDto> addRegistration(
           @RequestBody RegistrationDto registrationDto
    ){
        RegistrationDto  r = registrationService.saveRegistration(registrationDto);
        return new ResponseEntity<>(r, HttpStatus.CREATED);
    }

   //  http://localhost:8080/api/v1/registration/record/{id}
    @DeleteMapping("/record/{id}")
    public String deleteRegistration(
            @PathVariable long id
    ){
        registrationService.deleteRegistration(id);
        return "delete";
    }

    @PutMapping("{id}")
    public String updateRegistration(
            @PathVariable long id,
            @RequestBody Registration registration
    ){
        registrationService.updateRegistration(id, registration);
        return "done";
    }

    // http://localhost:8080/api/v1/registration
    @GetMapping
    public List<Registration> getAllregistrations(){
        List<Registration> registrations = registrationService.getAllregistrations();
        return registrations;
    }

    // http://localhost:8080/api/v1/registration
   @GetMapping("/id/{id}")
    public Registration getRegistrationById(
            @PathVariable long id
   ){
        Registration registration = registrationService.getRegistrationById(id);
        return registration;
   }
}

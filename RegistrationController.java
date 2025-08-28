package com.exampleapi.controller;

import com.exampleapi.entity.Registration;
import com.exampleapi.payload.RegistrationDto;
import com.exampleapi.service.RegistrationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
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

    // http://localhost:8080/api/v1/registration?pageNo=0&pageSize=5
    @GetMapping
    public List<Registration> getAllregistrations() {
       @RequestParam(defaultValue = "0",required = false) int pageNo,
       @RequestParam(defaultValue = "5",required = false) int pageSize
    }

        List<Registration> registrations = registrationService.getAllregistrations(pageNo, pageSize);
        return registrations;
    }

    // http://localhost:8080/api/v1/registration
   @GetMapping("/id/{id}")
    public ResponseEntity<Registration> getRegistrationById(
            @PathVariable long id
   ) throws FileNotFoundException {
       FileReader fr = new FileReader("C://test.txt");
        Registration registration = registrationService.getRegistrationById(id);
        return new ResponseEntity<>(registration, HttpStatus.OK);
   }
}

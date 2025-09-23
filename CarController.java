package com.app.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1/car")
public class CarController {

    @GetMapping
    public ResponseEntity<String> getMessage(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> myIpAddress = restTemplate.getForEntity("https://api.ipify.org?format=json",String.class);
        return myIpAddress;
    }
}

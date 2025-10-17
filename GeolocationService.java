package com.app.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GeolocationService {

    private static final String API_KEY = "e3138b02eb31b4d443d117c4d493ea70"; // your ipstack API key
    private static final String URL = "http://api.ipstack.com/";

    public String getLocation(String ipAddress) {
        RestTemplate restTemplate = new RestTemplate();
        String url = URL + ipAddress + "?access_key=" + API_KEY;
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        return response.getBody();
    }
}

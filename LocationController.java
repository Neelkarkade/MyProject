package com.app.controller;

import com.app.service.GeolocationService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {

    @Autowired
    private GeolocationService geolocationService;

    @GetMapping("/get-location")
    public String getLocation(HttpServletRequest request) {
        String clientIp = getClientIp(request);  // Get real client IP
        String locationInfo = geolocationService.getLocation("117.204.19.247");
        return locationInfo;
    }

    private String getClientIp(HttpServletRequest request) {
        String remoteAddr = request.getRemoteAddr();
        String xForwardedFor = request.getHeader("X-Forwarded-For");
        if (xForwardedFor != null && !xForwardedFor.isEmpty()) {
            remoteAddr = xForwardedFor.split(",")[0];
        }
        return remoteAddr;
    }
}

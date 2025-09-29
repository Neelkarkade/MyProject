package com.app.controller;

import com.app.service.SmsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/sms")
public class SmsController {

    private final SmsService smsService;

    public SmsController(SmsService smsService) {
        this.smsService = smsService;
    }

    @PostMapping("/send")
    public String sendSms(@RequestParam String to,
                          @RequestParam String message) {
        return smsService.sendSms(to, message);
    }
}

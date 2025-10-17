package com.app.service;

import com.app.config.TwilioConfig;
import com.twilio.rest.api.v2010.account.Message;  // ✅ Correct import
import com.twilio.type.PhoneNumber;
import org.springframework.stereotype.Service;

@Service
public class SmsService {

    private final TwilioConfig twilioConfig;

    public SmsService(TwilioConfig twilioConfig) {
        this.twilioConfig = twilioConfig;
    }

    public String sendSms(String to, String body) {
        try {
            Message message = Message.creator(
                    new PhoneNumber(to),                                 // Receiver
                    new PhoneNumber(twilioConfig.getTwilioPhoneNumber()), // Sender (Twilio number)
                    body                                                 // SMS text
            ).create();

            return message.getSid(); // return Twilio message ID for tracking
        } catch (Exception e) {
            e.printStackTrace();
            return "Failed to send SMS: " + e.getMessage();
        }
    }
}

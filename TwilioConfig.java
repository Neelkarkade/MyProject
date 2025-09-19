package com.app.config;

import com.twilio.Twilio;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TwilioConfig {

    @Value("${twilio.account.sid}")
    private String accountSid;

    @Value("${twilio.auth.token}")
    private String authToken;

    @Value("${twilio.phone.number}")
    private String twilioPhoneNumber;

    // This will run automatically after the bean is created
    @PostConstruct
    public void init() {
        Twilio.init(accountSid, authToken);
    }

    public String getTwilioPhoneNumber() {
        return twilioPhoneNumber;
    }

    public String getAccountSid() {
        return accountSid;
    }

    public String getAuthToken() {
        return authToken;
    }
}

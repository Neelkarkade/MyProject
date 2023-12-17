package com.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.entity.Registration;
import com.webapp.repository.RegistrationRepository;

@Service
public class RegistrationService {
@Autowired
private RegistrationRepository registrationRepository;

public void saveRegistration(Registration registration) {
	registrationRepository.save(registration);
}
}

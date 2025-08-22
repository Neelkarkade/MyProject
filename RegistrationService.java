package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Registration;
import com.demo.repository.RegistrationRepository;

@Service
public class RegistrationService {

	@Autowired
	private RegistrationRepository registrationRepository;
	
  public void saveRegistration(Registration registration) {
	  registrationRepository.save(registration);
	  
	  
  }

}

package com.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webapp.entity.Registration;
import com.webapp.service.RegistrationService;

@Controller
public class RegistrationController {
@Autowired
	private RegistrationService registrationService;
	
	
	//http://localhost:8080/view-registration-page
	//Handler Method
	@RequestMapping("/view-registration-page")
	public String viewsRegistrationPage() {
	
		return "new_registration";
	}
	@RequestMapping("/saveReg")
	public String saveRegistration(Registration registration) {
		//System.out.println(registration.getFirstName());
		//System.out.println(registration.getLastName());
	//	System.out.println(registration.getEmail());
	//	System.out.println(registration.getMobile());
		registrationService.saveRegistration(registration);
		return"new_registration";
	}
	
	
	
}

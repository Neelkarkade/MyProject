package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.dto.RegistrationDto;
import com.demo.entity.Registration;
import com.demo.service.RegistrationService;

@Controller
public class RegistrationController {
	
@Autowired
	private RegistrationService rs;
	
	// http://localhost:8080/viewReg
	
	@RequestMapping("/viewReg")
	public String viewRegistrationPage() {
		return "registration";
	}
//	@RequestMapping("/saveReg")
//	public String saveRegistration(
//			@ModelAttribute Registration registration,
//			ModelMap model
//			) {
//		        rs.saveRegistration(registration);
//		        model.addAttribute("msg","Record is created");
//			    return "registration";
//}
//	@RequestMapping("/saveReg")
//	public String saveRegistration(
//			@RequestParam String name,
//			@RequestParam String emailId,
//			@RequestParam String mobile,
//			ModelMap model
//			) {
//		Registration registration = new Registration();
//		registration.setName(name);
//		registration.setEmailId(emailId);
//		registration.setMobile(mobile);
//		        rs.saveRegistration(registration);
//		        model.addAttribute("msg","Record is created");
//			    return "registration";
//}
	
	@RequestMapping("/saveReg")
	public String saveRegistration(
			RegistrationDto dto,
			ModelMap model
			) {
		Registration registration = new Registration();
		registration.setName(dto.getName());
		registration.setEmailId(dto.getEmailId());
		registration.setMobile(dto.getMobile());
		        rs.saveRegistration(registration);
		        model.addAttribute("msg","Record is created");
			    return "registration";
  }
}
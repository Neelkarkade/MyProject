package com.demoee;

import java.util.Optional;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.demoee.entity.Registration;
import com.demoee.repository.RegistrationRepository;



@SpringBootTest
class DemoeeApplicationTests {

  @Autowired
  private RegistrationRepository registrationRepository;
  
  @Test
  void saveRegistration() {
	  Registration r = new Registration();
	  r.setName("adam");
	  r.setEmail("adam@gmail.com");
	  r.setMobile("9454565655");
	  registrationRepository.save(r);
  }
  
  @Test
  void deleteRegistration() {
	  registrationRepository.deleteById(2L);
  }
  
  @Test
  void getRegistration() {
	  Optional<Registration> val = registrationRepository.findById(10L);
	  if(val.isPresent()) {
		  Registration registration = val.get();
		  System.out.println(registration.getId());
		  System.out.println(registration.getName());
		  System.out.println(registration.getEmail());
		  System.out.println(registration.getMobile());
	  }else {
		  System.out.println("No record found");
	  }
  }

  @Test
  void getAllRegistrations() {
	  Iterable<Registration> allreg = registrationRepository.findAll();
	  for(Registration r:allreg) {
		  System.out.println(r.getId());
		  System.out.println(r.getName());
		  System.out.println(r.getEmail());
		  System.out.println(r.getMobile());
	  }
  }
  
  @Test
  void getRegistrationByEmail() {
	  Optional<Registration> val = registrationRepository.findByEmail("adam@gmail.com");
	  if(val.isPresent()) {
		  Registration registration = val.get();
		  System.out.println(registration.getId());
		  System.out.println(registration.getName());
		  System.out.println(registration.getEmail());
		  System.out.println(registration.getMobile());
	  }else {
		  System.out.println("No record found");
	  }
  }
  
  @Test
  void getRegistrationByMobile() {
	  Optional<Registration> val = registrationRepository.findByMobile("9454565655");
	  if(val.isPresent()) {
		  Registration registration = val.get();
		  System.out.println(registration.getId());
		  System.out.println(registration.getName());
		  System.out.println(registration.getEmail());
		  System.out.println(registration.getMobile());
	  }else {
		  System.out.println("No record found");
	  }
  }
  
  @Test
  void getAllRegistrationsByEmailOrMobile() {
	  Iterable<Registration> allreg = registrationRepository.findByEmailOrMobile("mike@gmail.com","5454565654");
	  for(Registration r:allreg) {
		  System.out.println(r.getId());
		  System.out.println(r.getName());
		  System.out.println(r.getEmail());
		  System.out.println(r.getMobile());
	  }
  }
  @Test
  void getAllRegistrationsByEmailAndMobile() {
	  Optional<Registration> val = registrationRepository.findByEmailAndMobile("mike@gmail.com","5554565855");
	  if(val.isPresent()) {
		  Registration registration = val.get();
		  System.out.println(registration.getId());
		  System.out.println(registration.getName());
		  System.out.println(registration.getEmail());
		  System.out.println(registration.getMobile());
	  }else {
		  System.out.println("No record found");
	  }
  }
}

package com.exampleapi.service;

import com.exampleapi.entity.Registration;

import com.exampleapi.payload.RegistrationDto;
import com.exampleapi.repository.RegistrationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistrationService {
    private RegistrationRepository registrationRepository;

    public RegistrationService(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }

    public RegistrationDto saveRegistration(RegistrationDto registrationDto) {
        //Convert to Entity From Dto
        Registration registration = new Registration();
        registration.setName(registrationDto.getName());
        registration.setEmailId(registrationDto.getEmail());
        registration.setMobile(registrationDto.getMobile());
        Registration savedReg = registrationRepository.save(registration);
        //Convert entity to dto
        RegistrationDto savedRegDto = new RegistrationDto();
        savedRegDto.setName(savedRegDto.getName());
        savedRegDto.setEmail(savedRegDto.getMobile());
        savedRegDto.setMobile(savedRegDto.getMobile());
        return savedRegDto;
    }

    public void deleteRegistration(long id) {
        registrationRepository.deleteById(id);
    }

    public void updateRegistration(long id, Registration registration) {
        //Actual Record fetched from database
        Optional<Registration> opReg = registrationRepository.findById(id);
        Registration reg = opReg.get();
        reg.setName(registration.getName());
        reg.setEmailId(registration.getEmailId());
        reg.setMobile(registration.getMobile());
        registrationRepository.save(reg);
    }

    public List<Registration> getAllregistrations() {
        List<Registration> registrations = registrationRepository.findAll();
        return registrations;
    }

    public Registration getRegistrationById(long id) {
        Optional<Registration> opReg = registrationRepository.findById(id);
        Registration reg = opReg.get();
        return reg;
    }
}

package com.exampleapi.service;

import com.exampleapi.entity.Registration;

import com.exampleapi.payload.RegistrationDto;
import com.exampleapi.repository.RegistrationRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistrationService {
    private RegistrationRepository registrationRepository;
    private ModelMapper modelMapper;
    public RegistrationService(RegistrationRepository registrationRepository, ModelMapper modelMapper) {
        this.registrationRepository = registrationRepository;
        this.modelMapper = modelMapper;
    }

    public RegistrationDto saveRegistration(RegistrationDto registrationDto) {
        //Convert to Entity From Dto
      Registration registration = convertDtoToEntity(registrationDto);
        registration.setId(1L);
        Registration savedReg = registrationRepository.save(registration);
        //Convert entity to dto
        RegistrationDto savedRegDto = convertEntityToDto(savedReg);
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

    Registration convertDtoToEntity(
            RegistrationDto registrationDto
    ){
        Registration registration = modelMapper.map(registrationDto, Registration.class);
        return registration;
    }
    RegistrationDto convertEntityToDto(
            Registration registration
    ){
        RegistrationDto registrationDto = modelMapper.map(registration, RegistrationDto.class);
                return registrationDto;
    }
}

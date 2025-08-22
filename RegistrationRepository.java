package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {

}

package com.demoee.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.demoee.entity.Registration;

public interface RegistrationRepository extends CrudRepository<Registration, Long>{

	
	
	
	Optional<Registration> findByEmail(String email);
	
	Optional<Registration> findByMobile(String mobile);
	
    Iterable<Registration> findByEmailOrMobile(String email,String mobile);

    Optional<Registration> findByEmailAndMobile(String email,String mobile);

}

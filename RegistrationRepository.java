package com.demoee.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.demoee.entity.Registration;

public interface RegistrationRepository extends CrudRepository<Registration, Long>{

	//Finder Method Should be abstract
	//Should start with findByVariablename
	@Query("Select r from Registration r where r.email=:x")
	Registration findByEmployeeEmail(@Param("x")String email);	
	
	Optional<Registration> findByMobile(String mobile);
	
	@Query("Select r from Registration r where r.email=:x or r.mobile=:y")
    List<Registration> findByEmailOrMobile(
    		@Param("x") String email,
    		@Param("y") String mobile
    				);
    @Query("Select r from Registration r where r.email=:x and r.mobile=:y")
    Registration findByEmailAndMobile(
    		@Param("x")String email,
    		@Param("y")String mobile
    		);

}

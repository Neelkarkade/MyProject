package com.demo.repository;



import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.demo.entity.Student;
//CURD Operation on Entity Class
public interface StudentRepository extends CrudRepository<Student, Integer> {


Optional<Student>findByEmail(String email);
Optional<Student> findByMobile(long mobile);
boolean existsByEmail(String email);
Iterable<Student> findBycity(String city);
}
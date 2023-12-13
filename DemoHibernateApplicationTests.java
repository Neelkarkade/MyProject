package com.demo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entity.Student;
import com.demo.repository.StudentRepository;

@SpringBootTest
class DemoHibernateApplicationTests {
@Autowired
	private StudentRepository studentRepo;
	
	@Test
	void savestudent() {
		Student s = new Student();
		s.setName("stallin");
		s.setCity("chennai");
		s.setCourse("dev");
		s.setEmail("stallin@gmail.com");
		s.setMobile(545652445);
		s.setFee(10000); 
		
		studentRepo.save(s);
}
	@Test
void deleteStudent() {
	studentRepo.deleteById(3);
}
	@Test
	void findStudentById() {
		Optional<Student> student = studentRepo.findById(1);
		if(student.isPresent()) {
			Student s = student.get();
	
			System.out.println(s.getName());
			System.out.println(s.getCity());
			System.out.println(s.getCourse());
			System.out.println(s.getFee());
			
		}else {
		System.out.println("Record not found");
	}
}
@Test
void checkStudentExist(){
	boolean val = studentRepo.existsById(1);
	System.out.println(val);
}
@Test
void getAllstudents() {
	Iterable<Student> students = studentRepo.findAll();
	for (Student s : students) {
		System.out.println(s.getName());
		System.out.println(s.getCity());
		System.out.println(s.getCourse());
		System.out.println(s.getFee());
		
	}
}
    @Test
    void updateStudent() {
	Optional<Student> optionalObj = studentRepo.findById(1);
	Student student = optionalObj.get();
	student.setCourse("Dev");
	studentRepo.save(student);
}
    @Test
    void findStudentByEmail() {
    	Optional<Student> findByEmail = studentRepo.findByEmail("mike@gmail.com");
    	if(findByEmail.isPresent()) {
			Student s = findByEmail.get();
    	System.out.println(s.getName());
		System.out.println(s.getCity());
		System.out.println(s.getCourse());
		System.out.println(s.getFee());
		
		}else {
		System.out.println("Record not found");
    }
    }
    @Test
    void findByMobile() {
    	Optional<Student> findByMobile = studentRepo.findByMobile(54565255);
    	if (findByMobile.isPresent()) {
    		Student s = findByMobile.get();
    		System.out.println(s.getName());
    		System.out.println(s.getCity());
    		System.out.println(s.getCourse());
    		System.out.println(s.getFee());
		} else {
            System.out.println("not present");
		}
    }
    @Test
    void findBycity() {
    	Iterable<Student> findBycity = studentRepo.findBycity("chennai");
    	for (Student student : findBycity) {
    		System.out.println(student.getName());
    		System.out.println(student.getCity());
    		System.out.println(student.getCourse());
    		System.out.println(student.getFee());
		}
    }
    @Test
    void checkStudentByEmail() {
    	boolean val = studentRepo.existsByEmail("mike@gmail.com");
    	System.out.println(val);
    }
}

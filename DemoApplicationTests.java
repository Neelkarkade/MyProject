package com.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void test1() {
		
		System.out.println("From Test1");
	}

	@Test
	void test2() {
		
		System.out.println("From Test2");
	}
	@BeforeEach
	void beforeTest(){
		System.out.println("Before Test");
	}
	@AfterEach
	void afterTest(){
		System.out.println("@After Test");
	}
	@BeforeAll
	static void beforeAll(){
		System.out.println("Before All");
	}
	@AfterAll
	static void afterAll(){
		System.out.println("@After All");
	}
}

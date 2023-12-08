package com.demo.entity;

import jakarta.persistence.*;

@Entity //  Will map  his class with  database table Student
public class Student {
	@Id //Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY )// Auto increment value
    private int id;
	private String name;  
	private String city;
	private String course;
	private int fee;
	private String email;
	private long mobile;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public int getFee() {
	return fee;
}
public void setFee(int fee) {
	this.fee = fee;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}

}

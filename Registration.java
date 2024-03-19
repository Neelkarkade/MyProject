package com.webapp.entity;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Entity
@Table(name="registrations")
public class Registration {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private long id;
	@NotEmpty
	@Size(min = 2,message = "minmumm 2 charcter")
@Column(name ="first_name",length = 45)
private String firstName;//first_name
	
@Column(name ="lastName",length = 45)
private String lastName;

@Email
@Column(name ="email",unique = true,  length = 128)
private String email;

@Size(min = 10, max = 10, message = "Should be 10 digits")
@Column(name = "mobile")
private String mobile;

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public @Digits(integer = 10, fraction = 0, message = "Mobile number must be exactly 10 digits") String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}


}

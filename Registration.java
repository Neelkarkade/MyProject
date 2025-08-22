package com.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "registrations")
public class Registration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long  id;
	
	@Column(name="name", nullable = false, length = 45)
	private String name;
	
	@Column(name="email_id", nullable = false, length = 128, unique = true)
	private String emailId;
	
	@Column(name="mobile", nullable = false, length = 10, unique = true)
	private String mobile;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	

	
}

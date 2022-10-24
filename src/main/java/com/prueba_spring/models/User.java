package com.prueba_spring.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users_restAPI")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //El ID se genera secuencialmente
	@Column(name = "user_id")
	private Long userId;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String phone;
	
	//Getters and setters del modelo Users
	public Long getuserId() {
		return userId;
	}
	public void setuserId(Long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}

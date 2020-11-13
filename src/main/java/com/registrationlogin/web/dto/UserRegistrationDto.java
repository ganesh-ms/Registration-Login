package com.registrationlogin.web.dto;

import com.registrationlogin.constraint.FieldMatch;


@FieldMatch(first = "password", second = "confirmPassword", message = "The password fields must match")
public class UserRegistrationDto {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String confirmPassword;
	
	public UserRegistrationDto() {
	}
	
	
	public UserRegistrationDto(String firstName, String lastName, String email, String password,
			String confirmPassword) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	public String getConfirmPassword() {
		return confirmPassword;
	}


	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	

}

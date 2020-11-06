package com.registrationlogin.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.registrationlogin.model.User;
import com.registrationlogin.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}

package com.practice.loginregapi.service;

import org.springframework.security.core.userdetails.UserDetails;

import com.practice.loginregapi.model.User;
import com.practice.loginregapi.web.dto.UserRegisterationDto;

public interface UserService extends UserDetails 
{
	User save(UserRegisterationDto registrationDto);
	
}
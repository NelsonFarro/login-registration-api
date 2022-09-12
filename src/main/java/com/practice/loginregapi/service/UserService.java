package com.practice.loginregapi.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.practice.loginregapi.model.User;
import com.practice.loginregapi.web.dto.UserRegisterationDto;

public interface UserService extends UserDetailsService
{
	User save(UserRegisterationDto registrationDto);
}
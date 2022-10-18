package com.practice.loginregapi.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.practice.loginregapi.model.User;
import com.practice.loginregapi.web.dto.UserRegisterationDto;

//@Service
public interface UserService extends UserDetailsService
{
	User save(UserRegisterationDto registrationDto);
}
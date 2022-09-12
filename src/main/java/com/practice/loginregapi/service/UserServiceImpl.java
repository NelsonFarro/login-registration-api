package com.practice.loginregapi.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.practice.loginregapi.model.Role;
import com.practice.loginregapi.model.User;
import com.practice.loginregapi.repository.UserRepository;
import com.practice.loginregapi.web.dto.UserRegisterationDto;

@Service
public class UserServiceImpl implements UserService
{
	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}


	@Override
	public User save(UserRegisterationDto registrationDto) 
	{
		User user = new User(registrationDto.getFirstName(),
				registrationDto.getLastName(),
				registrationDto.getEmail(),
				registrationDto.getPassword(),
				Arrays.asList(new Role("ROLE_USER")));
		
		return userRepository.save(user);
	}
	
}

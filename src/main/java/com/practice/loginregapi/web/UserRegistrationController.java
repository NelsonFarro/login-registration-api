package com.practice.loginregapi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.loginregapi.service.UserService;
import com.practice.loginregapi.web.dto.UserRegisterationDto;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController 
{
	@Autowired
	private UserService userService;

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@ModelAttribute("user")
	public UserRegisterationDto userRegistrationDto()
	{
		return new UserRegisterationDto();
	}
	
	@GetMapping
	public String showRegistrationForm()
	{
		return "registration";
	}
	
	@PostMapping
	public String RegisterUserAccount(@ModelAttribute("user") UserRegisterationDto registrationDto)
	{
		userService.save(registrationDto);
		return "redirect:/registration?success";
	}
}

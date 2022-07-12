package com.vadlapalli.onlinepickles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vadlapalli.onlinepickles.entity.User;
import com.vadlapalli.onlinepickles.response.UserRequestDTO;
import com.vadlapalli.onlinepickles.service.UserService;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/save")
	public User saveUser(@RequestBody UserRequestDTO userRequest){
		return userService.saveUser(userRequest);
	}
}


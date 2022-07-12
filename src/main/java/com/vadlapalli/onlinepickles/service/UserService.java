package com.vadlapalli.onlinepickles.service;

import org.springframework.stereotype.Service;

import com.vadlapalli.onlinepickles.entity.User;
import com.vadlapalli.onlinepickles.response.UserRequestDTO;

public interface UserService {
	
	User saveUser(UserRequestDTO userRequestDTO);
}

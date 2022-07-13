package com.vadlapalli.onlinepickles.service;

import javax.xml.bind.ValidationException;

import com.vadlapalli.onlinepickles.entity.User;
import com.vadlapalli.onlinepickles.response.UserRequestDTO;

public interface UserService {
	
	User saveUser(UserRequestDTO userRequestDTO)throws ValidationException;
}

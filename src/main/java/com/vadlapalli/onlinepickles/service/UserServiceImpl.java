package com.vadlapalli.onlinepickles.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.vadlapalli.onlinepickles.entity.User;
import com.vadlapalli.onlinepickles.repository.UserRepository;
import com.vadlapalli.onlinepickles.response.UserRequestDTO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public User saveUser(UserRequestDTO userRequestDTO) {
		User user = new User();
		user.setUserName(userRequestDTO.getUserName());
		user.setEmail(userRequestDTO.getEmail());
		user.setPassword(passwordEncoder.encode(userRequestDTO.getPassword()));
		User userSaved = userRepository.save(user);
		return userSaved;
	}

}

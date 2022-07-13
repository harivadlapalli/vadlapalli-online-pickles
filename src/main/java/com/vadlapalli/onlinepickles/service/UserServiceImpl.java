package com.vadlapalli.onlinepickles.service;

import java.util.Objects;

import javax.xml.bind.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.vadlapalli.onlinepickles.entity.User;
import com.vadlapalli.onlinepickles.repository.UserRepository;
import com.vadlapalli.onlinepickles.response.UserRequestDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public User saveUser(UserRequestDTO userRequestDTO) throws ValidationException {
		try {
			doValidateUser(userRequestDTO);
			User user = new User();
			user.setUserName(userRequestDTO.getUserName());
			user.setEmail(userRequestDTO.getEmail());
			user.setPassword(passwordEncoder.encode(userRequestDTO.getPassword()));
			User userSaved = userRepository.save(user);
			return userSaved;
		} catch (final ValidationException e) {
            log.error(e.getMessage(), e);
            throw e;
		}catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new ValidationException("unable to add a user");
		}
	}
	private void doValidateUser(UserRequestDTO userRequestDTO) throws ValidationException  {

		if (Objects.nonNull(userRepository.findByUserName(userRequestDTO.getUserName()))) {
			log.error("Invalid user:{}", userRequestDTO.getUserName());
			throw new ValidationException("User already exist");
		}

		if (userRequestDTO.getPassword().length() < 8 || userRequestDTO.getPassword().length() >= 20) {
			throw new ValidationException("password must be greater than 8 characters");
		}

		if (Objects.nonNull(userRepository.findByUserName(userRequestDTO.getEmail()))) {
			log.error("Invalid email:{}", userRequestDTO.getEmail());
			throw new ValidationException("Email already exist");
		}

	}
}

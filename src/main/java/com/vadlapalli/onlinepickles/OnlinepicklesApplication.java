package com.vadlapalli.onlinepickles;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vadlapalli.onlinepickles.entity.User;
import com.vadlapalli.onlinepickles.repository.UserRepository;

@SpringBootApplication
public class OnlinepicklesApplication {

	@Autowired
    private UserRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(OnlinepicklesApplication.class, args);
	}
	
//    @PostConstruct
//    public void initUsers() {
//        List<User> users = Stream.of(
//                new User("javatechie", "password", "javatechie@gmail.com"),
//                new User("user1", "pwd1", "user1@gmail.com"),
//                new User("user2", "pwd2", "user2@gmail.com"),
//                new User("user3", "pwd3", "user3@gmail.com")
//        ).collect(Collectors.toList());
//        repository.saveAll(users);
//    }

}

package com.online.BagsStore.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.BagsStore.model.User;
import com.online.BagsStore.service.UserService;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins="http://localhost:4200")
public class userController {
	@Autowired
    private UserService userService;
	
	@PostMapping("/register")
	public User registerUser(@RequestBody User user) {
		return userService.registerUser(user);
	}
	
	public Optional<User> loginUser(@RequestBody User user){
		return userService.authenticateUser(user.getEmail(), user.getPassword());
	}

}

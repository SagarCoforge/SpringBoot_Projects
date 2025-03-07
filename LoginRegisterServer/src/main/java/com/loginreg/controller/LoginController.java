package com.loginreg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loginreg.entity.User;
import com.loginreg.loginrequest.LoginRequest;
import com.loginreg.service.LoginService;

@RestController

public class LoginController {
@Autowired
	private LoginService loginService;

@PostMapping("/addUser")
@CrossOrigin(origins="http://localhost:3000")
public User addUser(@RequestBody User user) {
	return loginService.addUser(user);

}
@PostMapping("/loginUser")
@CrossOrigin(origins = "http://localhost:3000")
public Boolean loginUser(@RequestBody LoginRequest loginRequest) {
	return loginService.loginUser(loginRequest);
	
}
}

package com.loginreg.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loginreg.entity.User;
import com.loginreg.loginrequest.LoginRequest;
import com.loginreg.repository.LoginRepo;

@Service
public class LoginService {
	@Autowired
private LoginRepo loginRepo;

	public User addUser(User user) {
		return loginRepo.save(user);
	}
	
public Boolean loginUser(LoginRequest loginRequest) {
		
		Optional<User> user = loginRepo.findById(loginRequest.getUserId());
		User user1 = user.get();
		
		if(user1 == null) {
			return false;
		}
		
		
		
		if(!user1.getPassword().equals(loginRequest.getPassword())) {
			return false;
		}
		
		return true;
		
		
		
	}
}

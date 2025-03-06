package com.online.BagsStore.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.BagsStore.model.User;
import com.online.BagsStore.repository.UserRepository;

@Service
public class UserService {
@Autowired
	private UserRepository userRepository;
	public User registerUser(User user) {
		return userRepository.save(user);
	}
	
	public Optional<User> authenticateUser(String email, String password){
		return userRepository.findByEmail(email).filter(user->user.getPassword().equals(password));
	}
}

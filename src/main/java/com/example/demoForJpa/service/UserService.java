package com.example.demoForJpa.service;

import java.util.List;

import com.example.demoForJpa.entity.User;

public interface UserService {

	public User saveUser(User user);
	public User getUser(long id);
	public List<User> getAllUsers();
	
	
}

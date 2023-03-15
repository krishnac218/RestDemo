package com.example.demoForJpa.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoForJpa.entity.User;
import com.example.demoForJpa.repository.UserRepository;
import com.example.demoForJpa.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		User user1 =userRepository.save(user);
		return user1;
	}

	@Override
	public User getUser(long id) {
		User user =userRepository.findById(id).get();
		return user;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users=	userRepository.findAll();
		return users;
	}

}

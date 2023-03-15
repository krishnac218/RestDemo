package com.example.demoForJpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoForJpa.entity.User;
import com.example.demoForJpa.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;

	@PostMapping("/save")
	public  ResponseEntity<User> saveUser(@RequestBody User user) {
		User user1 =userService.saveUser(user);
		 return new ResponseEntity<>(user1,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") long id ){
		return new ResponseEntity<User>(userService.getUser(id), HttpStatus.OK);
	}
	
	@GetMapping("/allusers")
	public ResponseEntity<List<User>> getAllUsers(){
		return new ResponseEntity<List<User>>(userService.getAllUsers(), HttpStatus.OK);
	}
}

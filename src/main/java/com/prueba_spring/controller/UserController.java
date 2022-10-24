package com.prueba_spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba_spring.models.User;
import com.prueba_spring.repositories.UserRepository;


@RestController
@RequestMapping("users")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/addUser")
	public void addUser(@RequestBody User user) {
		userRepository.save(user);
	}
	
	@GetMapping("/getAllUsers")
	public List<User> getAllUsers(){
		return userRepository.findAll();		
	}
	
	@GetMapping("/getUser/{userId}")
	public User getUserById(@PathVariable("userId") Long userId) {
		User obj = userRepository.findByUserId(userId);
		return obj;
	}
	
	@DeleteMapping("/deleteUser/{userId}")
	public void deleteUser(@PathVariable("userId") Long userId) {
		userRepository.deleteById(userId);
	}
	
	@PutMapping("/updateUser")
	public void updateUser(@RequestBody User user) {
		userRepository.save(user);
	}
	

}

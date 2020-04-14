package com.spf.user.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spf.user.model.User;
import com.spf.user.service.UserDaoService;

@RestController
public class UserController {
	
	@Autowired
	private UserDaoService userDaoService;
	
	@GetMapping("/users")
	public List<User> getAllUsers()
	{
		return userDaoService.getAllUsers();
	}
	@PostMapping("/users")
	public User addUser(@RequestBody User user)
	{
		return userDaoService.addUser(user);
	}
	@GetMapping("/users/{id}")
	public User getAUser(@PathVariable int id)
	{
		return userDaoService.getAUser(id);
	} 

}

package com.example.demo.controller;

import entity.user;

import com.examole.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping 
	public List<user> getAllUsers(){
		return userService.getAllUsers();
	}

	@GetMapping("/{id}")
	public user getUserById(@PathVariable Long id) {
		return userService.getUserById(id);
	}

	@PostMapping
	public user createUser(@RequestBody user user) {
		return userService.saveUser(user);
	}
	
	@PutMapping("{/id}")
	public user updateUser( @PathVariable Long id , @RequestBody user user) {
		user.setId(id);
		return userService.saveUser(user);
	}
	@DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
	}

package com.examole.demo.service;

import entity.user;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
	
@Autowired
private UserRepository userRepository;

public List<user> getAllUsers(){
	return userRepository.findAll();
	
}

public user getUserById(Long id) {
	return userRepository.findById(id).orElse(null);
}

public user saveUser(user user) {
	return userRepository.save(user);
}

public void deleteUser(Long id) {
	userRepository.deleteById(id);
}
}

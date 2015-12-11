package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.User;
import com.repository.UserRepository;

@RestController
public class HelloRestController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/")
	public String index() {
		return "helloworld!";
	}
	
	@RequestMapping("/save")
	public User add() {
		User user = new User();
		user.setName("Minu");
		user.setAge(20);
		
		User helloData = userRepository.save(user);
		return helloData;
	}

	@RequestMapping("/list")
	public List<User> list(Model model) {
		List<User> helloList = userRepository.findAll();
		return helloList;
	}
}
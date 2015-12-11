package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.UserVO;
import com.repository.UserRepository;

@RestController
public class UserRestController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/save")
	public UserVO add(UserVO user) {
		UserVO helloData = userRepository.save(user);
		return helloData;
	}

	@RequestMapping("/list")
	public List<UserVO> list(Model model) {
		List<UserVO> helloList = userRepository.findAll();
		return helloList;
	}

	@RequestMapping("/")
	public String index() {
		return "helloworld!";
	}
}
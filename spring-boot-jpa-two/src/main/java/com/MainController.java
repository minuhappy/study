package com;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.domain.User;
import com.repository.UserRepository;

@SpringBootApplication
//@ComponentScan({"com.*"})
public class MainController implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping
	public @ResponseBody String index() {
		return "Hello Woniper Spring Boot~";
	}

	@RequestMapping("/users")
	public @ResponseBody List<User> getUserList() {
		return (List<User>) userRepository.findAll();
	}
	
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = SpringApplication.run(MainController.class, args);
		String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		userRepository.findAll();
	}
}
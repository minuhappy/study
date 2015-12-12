package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootH2FileApplication {

	@RequestMapping("/**/*")
	public String index() {
		return "helloworld!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootH2FileApplication.class, args);
	}
}

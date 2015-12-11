package com;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootJpaApplication implements CommandLineRunner {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringBootJpaApplication.class, args);
		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}
	}

	@Override
	public void run(String... arg0) throws Exception {
//		System.out.println("run");
	}
}

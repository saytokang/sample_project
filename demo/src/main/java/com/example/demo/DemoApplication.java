package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.dao.UserDao;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		System.out.println("\n\nHell World!!\n\n");
		
		UserDao userDao = ctx.getBean(UserDao.class);
		userDao.getUserList().stream().forEach(System.out::println);
	}
}

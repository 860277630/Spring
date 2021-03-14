package com.example.demo.staticproxy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("staticproxy/spring.xml");
		UserService userService = (UserService)context.getBean("userServiceStaticProxy");
		userService.findAll("zhangsan");
	}
}

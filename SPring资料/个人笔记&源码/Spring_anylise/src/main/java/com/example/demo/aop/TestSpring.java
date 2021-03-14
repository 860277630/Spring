package com.example.demo.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop/spring.xml");
		EmpService empService = (EmpService) context.getBean("empServiceImpl");
		System.out.println(empService.getClass());
		empService.find("小陈");
	}
}

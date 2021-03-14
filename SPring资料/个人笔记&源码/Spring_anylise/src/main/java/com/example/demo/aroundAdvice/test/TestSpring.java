package com.example.demo.aroundAdvice.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.aroundAdvice.service.DeptService;

public class TestSpring {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aroundAdvice/spring.xml");
	
	DeptService deptService = (DeptService)context.getBean("deptServiceImpl");
	
	System.out.println(deptService.getClass());
	
	deptService.find("哇哈哈");
}
}

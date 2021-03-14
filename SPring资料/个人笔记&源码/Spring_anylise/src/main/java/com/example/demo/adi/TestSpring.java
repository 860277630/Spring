package com.example.demo.adi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("adi/adi.xml");
		StudentService  studentService = (StudentService)context.getBean("studentServiceImpl");
		studentService.save("233");
	}
}

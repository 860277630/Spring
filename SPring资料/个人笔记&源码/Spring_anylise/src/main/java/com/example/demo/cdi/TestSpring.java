package com.example.demo.cdi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
public static void main(String[] args) {
	//启动工厂
	ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("cdi/cdi.xml");

	EmpDAO empDAO  = (EmpDAO)Context.getBean("empDAO");
	
	empDAO.save("小明");
}
}

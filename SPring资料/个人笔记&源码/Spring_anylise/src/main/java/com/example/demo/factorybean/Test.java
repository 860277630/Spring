package com.example.demo.factorybean;

import java.util.Calendar;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("factorybean/spring.xml");
		Calendar calendar = (Calendar)context.getBean("calendarFactoryBean");

        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) context.getBean("sqlSessionFactory");
        SqlSession sqlSession = sqlSessionFactory.openSession();
        System.out.println(sqlSession);
		System.out.println(calendar);
	
	}
}

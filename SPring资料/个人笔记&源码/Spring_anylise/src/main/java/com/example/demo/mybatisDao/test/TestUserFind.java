package com.example.demo.mybatisDao.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.mybatisDao.dao.UserDAO;
import com.example.demo.mybatisDao.entity.user;

public class TestUserFind {
	public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("mybatisDao/spring.xml");
        UserDAO userDAO = (UserDAO) context.getBean("UserDAO");

        
        //ID记得每次要填的不一样
        user u = new user(12,"可乐","cocacola","百事可乐");
        userDAO.save(u);
        

        userDAO.findAll().forEach(user -> System.out.println("user = " + user));
	}
}

package com.example.demo.mybatisDao.service;

import java.util.List;

import com.example.demo.mybatisDao.entity.user;

public interface UserService {
	List<user> findAll();
	
	
	void save(user u);
	
	
	void updateUser(user u);
	
	
	void delete(int id);
}

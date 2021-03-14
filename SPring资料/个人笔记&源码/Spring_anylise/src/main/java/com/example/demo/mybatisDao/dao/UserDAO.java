package com.example.demo.mybatisDao.dao;

import java.util.List;

import com.example.demo.mybatisDao.entity.user;

public interface UserDAO {
	List<user> findAll();
	
	void save(user u);
	

	void updateUser(user u);
	
	
	void deleteUser(int id);
}

package com.example.demo.mybatisDao.service;

import java.util.List;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.example.demo.mybatisDao.dao.UserDAO;
import com.example.demo.mybatisDao.entity.user;

public class UserServiceImpl implements UserService {

	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	// 生成事务管理器
	private PlatformTransactionManager platformTransactionManager;

	public void setPlatformTransactionManager(PlatformTransactionManager platformTransactionManager) {
		this.platformTransactionManager = platformTransactionManager;
	}

	@Override
	public List<user> findAll() {
		// TODO Auto-generated method stub
		return userDAO.findAll();
	}

	@Override
	public void save(user u) {
		// TODO Auto-generated method stub
		// 创建事务配置对象
		TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
//      //获取事务状态
		TransactionStatus status = platformTransactionManager.getTransaction(transactionDefinition);
		try {
			userDAO.save(u);
			platformTransactionManager.commit(status);
			System.out.println("=============已提交================");
		} catch (TransactionException e) {
			// TODO Auto-generated catch block
			platformTransactionManager.rollback(status);
			System.out.println("=============已回滚================");			
			e.printStackTrace();
		}
	}

	@Override
	public void updateUser(user u) {
		userDAO.updateUser(u);
		
	}

	@Override
	public void delete(int id) {
		userDAO.deleteUser(id);
	}

}

package com.baizhi.service;

import com.baizhi.dao.UserDAO;
import com.baizhi.entity.User;

import java.util.List;
import java.util.UUID;

public class UserServiceImpl implements UserService {

    private UserDAO userDAO;
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void save(User user) {
        //处理业务逻辑
        user.setId(UUID.randomUUID().toString());
        userDAO.save(user);
        int i= 1/0;
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }
}

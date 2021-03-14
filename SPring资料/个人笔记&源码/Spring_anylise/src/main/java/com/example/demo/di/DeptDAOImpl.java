package com.example.demo.di;

public class DeptDAOImpl implements DeptDAO {
    @Override
    public void save(String name) {
        System.out.println("DAO  name: " + name);
    }
}

package com.example.demo.aroundAdvice.dao;

public interface DeptDAO {

    void save(String name);

    void update(String name);

    void delete(Integer id);

    String find(String name);
}

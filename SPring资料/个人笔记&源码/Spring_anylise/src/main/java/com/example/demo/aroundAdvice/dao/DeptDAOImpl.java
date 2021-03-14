package com.example.demo.aroundAdvice.dao;

public class DeptDAOImpl  implements DeptDAO{

	@Override
	public void save(String name) {
		// TODO Auto-generated method stub
		System.out.println("save DAO:"+name);
	}

	@Override
	public void update(String name) {
		// TODO Auto-generated method stub
		System.out.println("update DAO:" + name);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("delete DAO :"+ id);
	}

	@Override
	public String find(String name) {
		// TODO Auto-generated method stub
		System.out.println("find DAO :"+ name);
		return name;
	}

}

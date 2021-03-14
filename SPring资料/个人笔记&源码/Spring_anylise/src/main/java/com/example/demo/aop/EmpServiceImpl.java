package com.example.demo.aop;

public class EmpServiceImpl implements  EmpService{

	@Override
	public void save(String name) {
		// TODO Auto-generated method stub
		System.out.println("处理业务逻辑调用save  DAO"+ name);
	}

	@Override
	public String find(String name) {
		// TODO Auto-generated method stub
		System.out.println("处理业务调用 find  DAO--"+name);
		return name;
	}

}

package com.example.demo.scope;

public class TagDAOImpl implements TagDAO{

	
	@Override
	public void save(String name) {
		// TODO Auto-generated method stub
		System.out.println("DAO Name:"+name);
	}
	
	//init
	public void init2001() {
		System.out.println("组建对象初始化");
	}
	
	//destory
	public void destory() {
		System.out.println("组建对象销毁！");
	}

}

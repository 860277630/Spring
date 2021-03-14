package com.example.demo.setdi;

public class ClazzDAOImpl implements ClazzDAO{

	@Override
	public void save(String name) {
		System.out.println("DAO name = "+name);
		
	}

}

package com.example.demo.cdi;

import java.util.Date;
import java.util.List;

public class EmpDAOImpl implements EmpDAO{
//构造注入语法
	private String name;
	private Integer age;
	private Date bir;
	private String[] qqs;
	
	private List<String> habbys;
	
	
	public EmpDAOImpl() {
		super();
	}


	public EmpDAOImpl(String name) {
		super();
		this.name = name;
	}


	public EmpDAOImpl(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}


	public EmpDAOImpl(Integer age) {
		super();
		this.age = age;
	}


	public EmpDAOImpl(String name, Integer age, String[] qqs) {
		super();
		this.name = name;
		this.age = age;
		this.qqs = qqs;
	}


	public EmpDAOImpl(Date bir) {
		super();
		this.bir = bir;
	}


	public EmpDAOImpl(String name, Date bir) {
		super();
		this.name = name;
		this.bir = bir;
	}


	public EmpDAOImpl(String name, Integer age, Date bir, String[] qqs, List<String> habbys) {
		super();
		this.name = name;
		this.age = age;
		this.bir = bir;
		this.qqs = qqs;
		this.habbys = habbys;
	}


	@Override
	public void save(String name) {
		System.out.println("name = "+ name);
		System.out.println("this.name = "+ this.name);
		System.out.println("this.age = "+ this.age);
		System.out.println("this.bir = "+ this.bir);
		System.out.println("遍历数组===================");
		for(String x :qqs) {
			System.out.println(x);
		}
		System.out.println("遍历list集合================");
		habbys.forEach(x -> System.out.println("habby = "+x));
		
	}

}

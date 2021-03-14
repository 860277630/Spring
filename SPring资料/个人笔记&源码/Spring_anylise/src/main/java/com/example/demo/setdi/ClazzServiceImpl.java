package com.example.demo.setdi;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class ClazzServiceImpl implements ClazzService{
	private ClazzDAO clazzDAO;
	
	//Set注入语法
	private String name;
	
	private Integer age;
	
	private Boolean sex;
	
	private Double price;
	
	private Float counts;
	
	private Date bir;
	//数组类型
	private String[] qqs;
	private ClazzDAO[] clazzDAOs;
	//集合类型  list
	private List<String> habbys;
	private List<ClazzDAO> clazzDAOList;
	//map类型  map
	private Map<String,String> maps;
	
	
	//properties
	private Properties properties;
	
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}
	public void setClazzDAOList(List<ClazzDAO> clazzDAOList) {
		this.clazzDAOList = clazzDAOList;
	}
	public void setHabbys(List<String> habbys) {
		this.habbys = habbys;
	}
	public void setClazzDAOs(ClazzDAO[] clazzDAOs) {
		this.clazzDAOs = clazzDAOs;
	}
	public void setQqs(String[] qqs) {
		this.qqs = qqs;
	}
	public void setBir(Date bir) {
		this.bir = bir;
	}
	public void setSex(Boolean sex) {
		this.sex = sex;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void setCounts(Float counts) {
		this.counts = counts;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	
    //提供set方法  set方式注入
    public void setClazzDAO(ClazzDAO clazzDAO) {
        this.clazzDAO = clazzDAO;
    }
	
	@Override
	public void save(String name) {
		// TODO Auto-generated method stub
		System.out.println("Service name = " + name);
		clazzDAO.save(name);
		System.out.println("Name = "+this.name);
		System.out.println("age = "+this.age);
		System.out.println("sex = "+this.sex);
		System.out.println("price = "+this.price);
		System.out.println("counts = "+this.counts);
		System.out.println("bir = "+this.bir);
		for(String x : qqs) {
			System.out.println("数组qqs = "+x);
		}
		for(ClazzDAO x : clazzDAOs) {
			System.out.println("数组clazzDAOs = "+x);
		}
		for(String x : habbys) {
			System.out.println("列表habbys = "+x);
		}
		for(ClazzDAO x : clazzDAOList) {
			System.out.println("列表clazzDAOList = "+x);
		}
		maps.forEach((key,value)->System.out.println(key+"====maps==="+value));
		properties.forEach((key,value)->System.out.println(key+"====properties==="+value));
	}

}

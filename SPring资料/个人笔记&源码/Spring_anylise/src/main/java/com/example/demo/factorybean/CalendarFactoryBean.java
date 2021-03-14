package com.example.demo.factorybean;

import java.util.Calendar;

import org.springframework.beans.factory.FactoryBean;

//用来工厂中创建复杂对象
public class CalendarFactoryBean implements  FactoryBean<Calendar>{

	//用来书写复杂对象的创建方式
	@Override
	public Calendar getObject() throws Exception {
		// TODO Auto-generated method stub
		return Calendar.getInstance();
	}

	//指定创建的复杂对象的类型
	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Calendar.class;
	}

	//用来指定创建对象的模式  true  单例  false  多例
	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}

}

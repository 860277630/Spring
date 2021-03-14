package com.example.demo.setdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring {
	public static void main(String[] args) {
		// 启动工厂
		ApplicationContext context = new ClassPathXmlApplicationContext("setdi/setdi.xml");
		// 获取工厂中创建好的对象 参数:获取工厂中指定对应的唯一标识
		//IOC :inversion of controll 控制反转 控制权力的反转
		//就是将手动通过new关键字创建对象的权力，交给spring，由工厂创建spring对象
		//DI： dependency injection   依赖注入  spring不仅要创建对象 还要在创建对象的同时维护组件与组件之间的依赖关系
		//定义：给组件中成员变量进行赋值过程
		//语法：1.组件中需要谁就将谁声明为成员变量并提供公开SET方法
		//2.在spring配置文件中对应的组件内部使用property标签来完成赋值操作
		ClazzDAOImpl clazzDAOImpl = (ClazzDAOImpl) context.getBean("clazzDAOImpl");
		clazzDAOImpl.save("王二狗");
		ClazzServiceImpl clazzServiceImpl = (ClazzServiceImpl) context.getBean("clazzServiceImpl");
		clazzServiceImpl.save("王三狗");
	}
}

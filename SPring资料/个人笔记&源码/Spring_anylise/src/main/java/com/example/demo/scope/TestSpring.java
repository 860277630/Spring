package com.example.demo.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// 启动工厂
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("scope/spring.xml");
		
		TagDAOImpl tagDAOImpl_1 = (TagDAOImpl) context.getBean("tagDAOImpl");
		TagDAOImpl tagDAOImpl_2 = (TagDAOImpl) context.getBean("tagDAOImpl");
		System.out.println(tagDAOImpl_1 == tagDAOImpl_2);

		// 工厂原理
		TagDAO tt = (TagDAO) Class.forName("com.example.demo.scope.TagDAOImpl").newInstance();
		System.out.println(tt);


		context.close();
	}
}

package com.example.demo.staticproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestDynamicProxy {
	public static void main(String[] args) {
		//使用动态代理对象：指的是在成勋运行过程中动态通过代码的方式为指定的类生成动态代理对象
		
		
		UserService userService = new UserServiceImpl();

		
		//参数1：classLoader  类加载器  可以利用线程来获得
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		
		//参数2：Class[]  目标对象的接口的类型的数组  （单继承多实现特性）
		Class[] classes = {UserService.class};
		
		//参数3：InvocationHandler 接口类型   invoke方法  用来书写额外功能 附加操作

		//mybatis用的也是动态代理
		//dao  Userdao  userdao = sqlSession.getMapper(userdao.class);  userdao.save() =
		//mapper的xml文件  底层封装的也是下段代码     
		//传入接口，生成代理对象，将mapper.xml解析到invoke中进行执行操作。
		//所以mybatis中不能出现方法重载，因为要根据代理对象执行的方法名，到mapper中找到对应的ID来获得invoke里面的内容

		//proxy生成动态对象的类	
		//返回值：创建好的动态代理对象		
		UserService proxy = (UserService)Proxy.newProxyInstance(classLoader, classes, new InvocationHandler() {
			
			//通过动态代理对象调用自己里面代理方法时会优先指定invokcationHandler类中invoke
			//参数1：当前创建好的代理对象
			//参数2：当前代理对象执行的方法对象
			//参数3：当前代理对象执行的方法参数
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// TODO Auto-generated method stub
				System.out.println("当前执行的方法："+method.getName());
				System.out.println("当前执行方法的参数："+args[0]);
				try {
					System.out.println("开启事务");
					//调用目标类中业务方法通过反射机制，调用目标类中当前方法
					Object invoke = method.invoke(new UserServiceImpl(), args);
					System.out.println("提交事务");
					return invoke;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("回滚事务！");
				}
				return null;
			}
		});

        System.out.println(proxy.getClass());
        String result = proxy.findAll("小陈");//通过动态代理对象调用代理中方法
        System.out.println(result);
		
	}
}

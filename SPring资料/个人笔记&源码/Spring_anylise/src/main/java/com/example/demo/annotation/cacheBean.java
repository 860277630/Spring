package com.example.demo.annotation;

public class cacheBean {
	private user[] users = { new user(1, "张三", "23", "123"), new user(2, "李四", "24", "234"),
			new user(3, "王五", "25", "345"), new user(4, "赵六", "26", "456"), new user(5, "田七", "27", "567"),
			new user(6, "王八", "28", "678"), new user(7, "老九", "29", "789") };

    @Cache(key = "user")
	public user getUser(Integer id) {
		System.out.println("获取用户方法被调用，id为：" + id);
		return users[id];
	}

}

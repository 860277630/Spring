package com.example.demo.factorybean;

import java.sql.SQLException;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

public class TestDruid {
	public static void main(String[] args) throws SQLException {

		DruidDataSource druidDataSource = new DruidDataSource();
		druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		druidDataSource.setUrl("jdbc:mysql://localhost:3306/2001");
		druidDataSource.setUsername("root");
		druidDataSource.setPassword("root");
		
		DruidPooledConnection connection = druidDataSource.getConnection();
		
		System.out.println(connection);
	}
}

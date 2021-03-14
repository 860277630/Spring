package com.example.demo.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //启动工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("di/di.xml");

        //获取service组件
        DeptService deptService = (DeptService) context.getBean("DeptService");
        deptService.save("百知教育");
    }
}

package com.example.demo.annotation;

import java.util.Objects;

import org.junit.Test;


public class AnnotationTest {

	
	
	@Test
	public void test() {
		Class<user> userClass =   user.class;
		myAnnotation annotation = userClass.getAnnotation(myAnnotation.class);
		if(Objects.nonNull(annotation)) {
			System.out.println(annotation.value()+"===="+annotation.num());
		}
	}
	
	
	@Test
	public void testCache() throws InterruptedException {
		cacheBean cacheBean = new cacheBean();
        Object user1 = CacheUtils.invokeMethod(cacheBean, "getUser", 0);
        
        //Thread.sleep(2000);
        Object user2 = CacheUtils.invokeMethod(cacheBean, "getUser", 0);
        System.out.println(user1);
        System.out.println(user2);
	}
}

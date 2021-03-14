package com.example.demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Cache {
	//缓存key
	String  key();	
	//缓存时间
	long cacheTime() default 1;
	//缓存时间单位
	TimeUnit timeUnit() default TimeUnit.SECONDS;
}

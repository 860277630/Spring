package com.example.demo.aroundAdvice.advices;

import java.util.Date;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MethodInvokeTimeAdvice implements MethodInterceptor{

	//参数1：invocation获取当前执行方法  获取当前执行方法参数  获取目标对象
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("===============进入环绕通知==============");
		// TODO Auto-generated method stub
		System.out.println("当前执行方法："+invocation.getMethod().getName());
		System.out.println("方法参数："+invocation.getArguments()[0]);
		System.out.println("获取当前目标对象:"+invocation.getThis());
		try {
			long start = new Date().getTime();
			//放行目标方法
			Object proceed = invocation.proceed();
			long end = new Date().getTime();
			System.out.println("方法："+invocation.getMethod().getName()+"本次执行了"+(end-start));
			return proceed;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("出现异常时业务处理！");
		}
		return null;
	}

}

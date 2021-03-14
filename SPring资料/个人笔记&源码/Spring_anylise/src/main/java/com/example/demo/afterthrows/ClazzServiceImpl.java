package com.example.demo.afterthrows;


public class ClazzServiceImpl implements ClazzService{

	@Override
	public void save(String name) {
		// TODO Auto-generated method stub

        System.out.println("Service save调用"+name);
	}

	@Override
	public String find(String name) {
		// TODO Auto-generated method stub

        System.out.println("Service find调用"+name);
        throw  new RuntimeException("find方法调用出错啦!");
	}

}

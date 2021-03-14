package com.example.demo.adi;

public class StudentServiceImpl implements StudentService{

	
	//自动注入
	private StudentDAO studentDAO;
	
	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	@Override
	public void save(String name) {
		// TODO Auto-generated method stub
		System.out.println("service Name :" + name);
		studentDAO.save(name);
	}

}

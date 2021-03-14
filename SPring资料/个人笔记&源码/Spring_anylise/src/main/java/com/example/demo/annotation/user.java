package com.example.demo.annotation;


@myAnnotation("这是内容")
public class user {
	private int id;
	private String userName;
	private String passWord;
	private String realName;
	
	
	@Override
	public String toString() {
		return "user [id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", realName=" + realName + "]";
	}
	public user() {
		super();
	}
	public user(int id, String userName, String passWord, String realName) {
		super();
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
		this.realName = realName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	
	
	
}

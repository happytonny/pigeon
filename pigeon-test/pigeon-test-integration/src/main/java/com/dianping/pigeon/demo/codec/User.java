/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.demo.codec;

public class User implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int age;
	private String name;

//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	static User getUser() {
		User user = new User();
		user.setAge(10);
		user.setName("XiaoMing");
		//user.setPassword("pppp");
		return user;
	}

	public boolean equals(Object obj) {
		User an = (User) obj;
		return this.name.equals(an.getName()) && this.age == an.getAge();
	}

	public String toString() {
		return name + ", " + age;
	}
}
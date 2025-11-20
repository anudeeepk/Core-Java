package com.jspiders.encapsulation;

public class Person {
	private int age;
	public int getAge() {
		//Authorization
		return age;
	}
	public void setAge(int age) {
		//Authorization
		this.age=age;
	}

}

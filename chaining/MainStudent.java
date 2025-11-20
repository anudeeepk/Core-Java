package com.jspiders.chaining;
class Student
{
	Student()
	{
		System.out.println("Initialize Personal Details");
		System.out.println("Initialize Academic Details");
	}
	Student(boolean b)
	{
		this();
		System.out.println("Initialize Experience Details");
	}
}
public class MainStudent {
	public static void main(String[] args) {
		Student fresher=new Student();
		System.out.println("------------------");
		Student experience=new Student(false);
	}

}

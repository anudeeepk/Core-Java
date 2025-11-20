package com.jsp.collection;

import java.util.ArrayList;

public class Student {
	int id;
	String name;
	double mark;
	public Student(int id, String name, double mark) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student[id="+id+",name="+name+",mark="+mark+"]";
	}
	public static void main(String[] args) {
		Student s1=new Student(101,"Anudeep",98.03);
		Student s2=new Student(102,"germany",98.03);
		Student s3=new Student(103,"france",98.03);
		
		ArrayList<Student> al=new ArrayList<Student>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		System.out.println(al);
	}
}


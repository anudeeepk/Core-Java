package com.parob;

import java.util.Scanner;

public class College {
	static void displayStudentInfo(Student s)
	{
		if(s!=null)
		{
			System.out.println("Yop: "+s.yop);
			System.out.println("cgpa: "+s.cgpa);
			System.out.println("Email: "+s.email);
		}
	}
	static Student createStudent()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter yop");
		int yop=sc.nextInt();
		System.out.println("Enter cgpa");
		double cgpa=sc.nextDouble();
		System.out.println("Enter email");
		String email=sc.next();
		Student s=new Student(yop,cgpa,email);
		return s;
	}
}

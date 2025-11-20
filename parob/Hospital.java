package com.parob;

import java.util.Scanner;

public class Hospital {
	static void displayPatientDetails(Patient p)
	{
		if(p!=null)
		{
			System.out.println("Age: "+p.age);
			System.out.println("ID: "+p.id);
		}
	}
	static Patient createPatient()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		System.out.println("Enter id: ");
		int id=sc.nextInt();
		Patient p=new Patient(age,id);
		return p;
	}
}

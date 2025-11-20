package com.jsp.collection;

import java.util.ArrayList;
import java.util.Collections;

public class MainEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee(3,"Riya",98.08);
		Employee e2=new Employee(1,"Riya",98.08);
		Employee e3=new Employee(2,"Riya",98.08);
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		for(Employee e:al) {
			System.out.println(e);
		}
		System.out.println("++++++");
		
		Collections.sort(al);
		
		for(Employee e:al) {
			System.out.println(e);
		}
	}
}

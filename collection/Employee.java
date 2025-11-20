package com.jsp.collection;

public class Employee implements Comparable {
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Object o) {
		Employee e=(Employee)o;
		if(this.id>e.id) {
			return 1;
		}
		else if(this.id < e.id) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	
}

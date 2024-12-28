package com;

public class Employee {
	Employee(int id) {
		this(45, "David");
		System.out.println("Id: "+id);
	}
	Employee(int age, String name){

		System.out.println("Age: "+age+" Name: "+name);
	}
	Employee(double salary){
		this(101);
		System.out.println("Salary: "+salary);
	}

	public static void main(String[] args) {
		Employee e = new Employee(4555.99);
	}
}

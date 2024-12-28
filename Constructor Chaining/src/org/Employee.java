package org;

public class Employee {
	int id;
	String nameString;
	double salary;
	Employee(int id){
		this.id = id;
	}
	Employee(int id, String nameString){
		this(id);
		this.nameString = nameString;
	}
	Employee(int id, String nameString, double salary){
		this(id, nameString);
		this.salary = salary;
	}

	public static void main(String[] args) {
		Employee employee = new Employee(101, "Tom", 3.5);
		System.out.println("Id: "+employee.id);
		System.out.println("Name: "+employee.nameString);
		System.out.println("Salary: "+employee.salary);

	}

}

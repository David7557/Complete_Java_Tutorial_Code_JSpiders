package org;

public class Student {
	int age;
	String name;
	public Student(int age) {
		
		this.age = age;
	}
	
	public Student(int age, String name) {
		this(age);//this(22); -> this.age=age;
		this.name = name;
	}
	

	public static void main(String[] args) {
		Student student = new Student(22, "David");
		
		System.out.println("Age: "+student.age);
		System.out.println("Name: "+student.name);
		
	}

}

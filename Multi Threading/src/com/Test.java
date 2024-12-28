package com;

public class Test {
	public static void main(String[] args) {
		//Default Thread name
		
		Thread t1 = new Thread();
		System.out.println(t1.getName());
		t1.setName("car Thread");
		System.out.println(t1.getName());
		
		
		System.out.println("-----");
		
		//Custom thread Name
		Thread t2 = new Thread("bike thread");
		System.out.println(t2.getName());
	}
}

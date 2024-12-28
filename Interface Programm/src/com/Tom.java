package com;

public class Tom implements Person{
	@Override
	public void eat() {
		System.out.println("Eating biryani");
	}

	public static void main(String[] args) {
		Tom t = new Tom();

		System.out.println("Age: "+Person.age);
		t.eat();
	}
}

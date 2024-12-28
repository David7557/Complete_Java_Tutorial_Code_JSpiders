package com;
import java.util.Scanner;

class CalculatorMainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Calculator c = new CalculatorImpl();// rule-->4 Upcasting

		System.out.println("Enter the numbers: ");
		System.out.println("-------------------");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		c.add(a, b);
		c.multiply(a, b);
	}

}

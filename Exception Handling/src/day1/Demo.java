package day1;

import java.util.Scanner;

class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Start");
		System.out.println("Enter two numbers");
		int a = sc.nextInt();//10
		int b = sc.nextInt();//0
		sc.close();

		try {
			System.out.println(a/b);
		} catch (ArithmeticException e) {
			System.out.println("A number can not divided by zero");
		}
		
		System.out.println("End");
	}

}

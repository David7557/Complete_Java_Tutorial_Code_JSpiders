package com;

import java.util.Scanner;

public class CalculatorMainClass{

	public static void main(String[] args) {
		CalculatorImpl cal = new CalculatorImpl();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("------------Welcome to my Calculator-----------");
		System.out.println("Enter your choice:\n1) Addition\n2) Substraction\n3) Multiplication\n4) Division");
		System.out.println("-----------------------------------------------");

		int ch = sc.nextInt();
		
		/** 
		 * local variable do not have default values, therefore initializing to 0. 
		 */
		int num1 = 0, num2 = 0;
		
		//accepting input when the choice i 1 2 3 4.
		if (ch <= 4 && ch > 0) {
			System.out.println("Enter your 1st Numbers:");
			num1 = sc.nextInt();
			System.out.println("Enter your 2nd  Numbers:");
			num2 = sc.nextInt();
			sc.close();
		}
		
		int result = 0;

		switch (ch) {
		case 1: {
			result=cal.add(num1, num2);
			System.out.println("Sum of "+num1+ " & "+num2+" is: "+result);
			break;

		}
		case 2: {
			result = cal.sub(num1, num2);
			System.out.println("Difference of "+num1+ " & "+num2+" is: "+result);
			break;

		}
		case 3: {
			result = cal.mul(num1, num2);
			System.out.println("Products of "+num1+ " & "+num2+ " is: "+result);
			break;

		}
		case 4: {
			result = cal.div(num1, num2);
			System.out.println("Division of "+num1+ " & "+num2+" is: "+result);
			break;

		}
		default:
			System.out.println("Invalid choice.");
		}


	}

}

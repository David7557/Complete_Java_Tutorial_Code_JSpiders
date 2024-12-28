package david;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int result = 0;

		Scanner sc = new Scanner(System.in);
		Calculation c = new Calculation();
		while(true) {
			
		System.out.println("-------------------Calculator----------------");
		System.out.println("Enter your choice:\n1) Addition\n2) Substraction\n3) Multiplication\n4) Division");
		System.out.println("---------------------------------------------");
		
			int ch= sc.nextInt();
			if (ch <= 4 && ch >=1) {
				System.out.println("Enter your first number: ");
				a = sc.nextInt();
				System.out.println("Enter your first number: ");
				b = sc.nextInt();
			}

			switch (ch) {

			case 1: {
				result = c.add(a, b);
				System.out.println(result);
				break;
			}
			case 2: {
				result = c.sub(a, b);
				System.out.println(result);
				break;	
			}
			case 3: {
				result = c.mul(a, b);
				System.out.println(result);
				break;
			}
			case 4: {
				result = c.div(a, b);
				System.out.println(result);
				break;
			}
			default: {
				System.out.println("Invalid Option");
			}
			
			}
		}		


	}

}

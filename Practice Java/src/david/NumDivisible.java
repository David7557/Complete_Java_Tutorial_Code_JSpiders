package david;

import java.util.Scanner;

public class NumDivisible {
	
	public static void divisible(int n) {
		if (n % 3 == 0 && n % 5 == 0) {
			System.out.println("Divisible by both 3 and 5.");
		}
		else if (n % 5 == 0) {
			System.out.println("Divisible by 5.");
		}
		else if (n % 3 == 0) {
			System.out.println("Divisible by 3.");
		}
		else {
			System.out.println("Not divisible by both.");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		divisible(n);
		}
		
		sc.close();
		
	}

}

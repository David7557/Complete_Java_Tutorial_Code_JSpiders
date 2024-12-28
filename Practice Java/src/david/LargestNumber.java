package david;

import java.util.Scanner;

public class LargestNumber {
	
	public static int largestNum(int a, int b, int c) {
		int max = a;
		
		if (b > max) {
			max = b;
		}
		else if (c > max) {
			max = c;
		}
		
		return max;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your numbers.");
		
		System.out.println("A: ");
		int a = sc.nextInt();
		System.out.println("B: ");
		int b = sc.nextInt();
		System.out.println("C: ");
		int c = sc.nextInt();
		sc.close();
		
		int result = largestNum(a, b, c);
		System.out.println(result+" is a largest number.");
		
	}

}

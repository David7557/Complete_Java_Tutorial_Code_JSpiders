package david;

import java.util.Scanner;

public class SecondLargest {
	
	public static void secondLargestNumber(int a,int b, int c) {
		if (a > b && a < c || a < b && a > c) {
			System.out.println(a);
		} else if (b > a && b < c || b < a && b > c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}

		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		secondLargestNumber(a, b, c);

	}

}

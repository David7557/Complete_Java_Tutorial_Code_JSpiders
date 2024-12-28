package david;

import java.util.Scanner;

public class CharacterOrNumber {
	
	public static void check(char c) {
		
		if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
			System.out.println(c+" is a character.");
		}
		else if (c >='0' && c<='9') {
			System.out.println(c+" Is number.");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Symbol.");
		char c = sc.next().charAt(0);
		sc.close();

		check(c);

	}

}

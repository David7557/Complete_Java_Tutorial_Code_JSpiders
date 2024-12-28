package com;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//infinite loop
		
		while(true) {
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			sc.close();
			
			if (choice == 1) {
				System.out.println("hai");
			}
			
			else if (choice == 2) {
				System.out.println("Bye");
			}
			else if(choice == 3) {
				System.out.println("Thank you");
			}
			else {
				System.out.println("Inavlid");
			}
			System.out.println("------------------------------");
		}
		

	}

}

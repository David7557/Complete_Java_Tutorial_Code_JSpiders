package org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Tom");
		al.add("Jerry");
		al.add("Oggy");
		al.add("Motu");
		al.add("Patlu");

		System.out.print("Enter your choice: ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		sc.close();

		if (choice == 1) {
			Collections.sort(al);
			System.out.println(al);
		}else if(choice == 2) {
			Collections.sort(al);
			Collections.reverse(al);
			System.out.println(al);
		}else {
			System.out.println("Invalid Choice");
		}
	}
}

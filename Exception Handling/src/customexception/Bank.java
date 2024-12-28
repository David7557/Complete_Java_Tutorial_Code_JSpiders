package customexception;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int balance = 5000;
		
		System.out.print("Enter amount to be withdraw: ");
		int amount = sc.nextInt();
		sc.close();
		
		if(amount <= balance) {
			System.out.println("Amount withdrawn Successfully!");
		}else {
			try {
				throw new InsufficientBalanceException("Insucfficient Balance");
			} catch (InsufficientBalanceException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

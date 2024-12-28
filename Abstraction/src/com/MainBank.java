package com;

import java.util.Scanner;

class MainBank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank b = new BankImp();
		boolean flag = false;

		System.out.println("Welcome to Banking System: \n1) Deposite\n2) Withdraw\n3) Check Balance");
		System.out.println("-------------------------------------------");
		
		System.out.println("Enter your Preference: ");
		int choice = sc.nextInt();
		if (choice>=1 && choice <= 3) {
			flag = true;
			while(flag) {

				switch (choice){
				case 1: {
					System.out.print("Enter your amount to deposite:");
					b.deposite(sc.nextInt());
					flag = false;
					break;
				}

				case 2: {
					System.out.print("Enter your amount to withdraw:");
					b.withdraw(sc.nextInt());
					flag = false;
					break;
				}

				case 3: {
					System.out.print("Available Balance is: ");
					b.checkBalance();
					flag = false;
					break;
				}
				default:
					System.out.println("Wrong choice.");
				}
			}
		}else {
			
		}

		
	}

}

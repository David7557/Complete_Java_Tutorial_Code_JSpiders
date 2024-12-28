package sbi;

import java.util.Scanner;

class BankImplementation implements Bank{
	 int userid = 101;
	 String password = "david@2002";
	 int balance = 500;
	@Override
	public void login(int userid, String password) {
		if(this.userid == userid) {
			if(this.password.equals(password)) {
					System.out.println("Choose option to perform action.");
					System.out.println("1) Deposite 2) Withdraw 3) Check Balance");
					Scanner sc = new Scanner(System.in);
					int ch = sc.nextInt();
					
					//if (ch >= 1 && ch <=3) {
						switch (ch) {
						case 1: {
							System.out.println("Enter your amount");
							deposite(sc.nextInt());
							break;
						}
						case 2: {
							System.out.println("Enter your amount");
							withdraw(sc.nextInt());
							break;
						}
						case 3: {
							checkBalance();
							break;
						}
						default:
							System.out.println("Wrong choice");
						}
						/*
						 * }else { System.out.println("Wrong choice! Try again."); }
						 */
					
			}else {
				System.out.println("Incorrect Password");
			}
		}else {
			System.out.println("Incorrect Userid");
		}
	}
	
	@Override
	public void deposite(int amount) {
		balance = balance + amount;
		System.out.println(amount+" Deposited Sucessfully.");
		checkBalance();
	}
	
	@Override
	public void withdraw(int amount) {
		balance = balance - amount;
		System.out.println(amount+" Withdrawn Sucessfully");
		checkBalance();
	}
	
	@Override
	public void checkBalance() {
		System.out.println("Available balance is "+balance);
	}

}

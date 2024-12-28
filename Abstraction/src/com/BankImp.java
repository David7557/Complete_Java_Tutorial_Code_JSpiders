package com;

class BankImp implements Bank{
	int balance = 0;
	
	@Override
	public void deposite(int amount) {
		System.out.println("Depositing Rs.: "+amount);
		
		balance = balance + amount;// balance += amount
		System.out.println("Amount deposited successfully.");
		checkBalance();
	}
	
	@Override
	public void withdraw(int amount) {
		System.out.println("Withdrawing  Rs.: "+amount);
		
		balance = balance - amount; // balance -=amount
		System.out.println("Amount deposited successfully.");
		checkBalance();
	}
	@Override
	public void checkBalance() {
		System.out.println("Available balance is: "+balance);
	}
}

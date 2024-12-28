package com;

public class Customer extends Amazon {
	
	@Override
	void buy() {
		System.out.println("Buying laptop");
	}
	
	@Override
	void pay() {
		System.out.println("Paying 500000");
	}
	
	public static void main(String[] args) {
		Customer c = new Customer();
		c.buy();
		c.pay();
		

	}

}

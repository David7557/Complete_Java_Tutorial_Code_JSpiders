package com;

class CalculatorImpl implements Calculator {//rule-->2

	@Override//rule -->3
	public  void add(int a, int b) {
		System.out.println("Sum of "+a+" & "+b+" is "+(a+b));
	}

	@Override
	public void multiply(int a, int b) {
		System.out.println("Product of "+a+" & "+b+" is "+(a*b));
	}

}

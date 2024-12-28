package com;

public class CalculatorImpl extends Calculator {
	@Override
	int add(int num1, int num2) {
		return (num1 + num2);
	}
	@Override
	int sub(int num1, int num2) {
		return (num1 - num2);
	}
	@Override
	int mul(int num1, int num2) {
		return (num1 * num2);
	}
	@Override
	int div(int num1, int num2) {
		return (num1 / num2);
	}

	

}

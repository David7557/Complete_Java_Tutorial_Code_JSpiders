package com;

import java.util.Iterator;

public class ForEachLoopDemo {
	public static void main(String[] args) {
		int[] a = {10, 20, 30};
		for(int x : a) {
			System.out.println(x);
		}

		System.out.println("------------------");

		double[] marks = {89.1, 45.3, 67.2};
		for(double d: marks) {
			System.out.println(d);
		}

		System.out.println("-------------------");

		String[] subjects = {"Java", "Python", "JavaScript"};
		for(String s: subjects) {
			System.out.println(s);
		}
	}
}

package com;

import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		//Array declaration
		int[] a;
		
		//Array creation
		a = new int[3];
		
		//printing array element
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		System.out.println("Length: "+a.length);
		
		System.out.println("----------");
		
		//array initialization
		
		a[0] = 10;
		a[1]= 50;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		System.out.println("-----------");
		
		double[] d = new double[2];
		
		System.out.println(d[0]);
		System.out.println(d[1]);
		
		//initialization 
		
		d[0] = 1.5;
		
		System.out.println(d[0]);
		System.out.println("length: "+d.length);
		
		
		/* Array string*/
		
		String[] fruits = {"Apple", "Mango", "Orange", "Grapse"};
		 for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
		
		
		
		

	}

}

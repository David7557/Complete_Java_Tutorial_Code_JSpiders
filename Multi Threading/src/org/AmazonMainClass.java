package org;

public class AmazonMainClass {
	public static void main(String[] args) {
		
		// rule - 3
		
		Amazon a = new Amazon();// Runnable type of object
		Thread t = new Thread(a);//Converting Runnable type into Thread type
		t.setName("amazon");//setting or initializing the thread name
		t.start();// invoking start().
		
		System.out.println("-------------");
		
		Thread t1 = new Thread(new Amazon());
		t1.setName("amazon");
		t1.start();
		
		System.out.println("-------------");
		
		Thread t2 = new Thread(new Amazon(), "amazon");
		t2.start();
		
		System.out.println("----------------");
		
		new Thread(new Amazon(), "amazon").start();
		
		
	}
}

package org;


//Swiggy is a thread type object
public class Swiggy extends Thread {//1
	
	@Override//2
	public void run() {
		System.out.println("Ordering Food!!");
	}
}

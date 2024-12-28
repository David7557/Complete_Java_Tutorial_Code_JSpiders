package org;


//PhonePe is Runnable type object
public class PhonePe implements Runnable {//1

	@Override//2
	public void run() {
		System.out.println("Paying!!");
	}
}

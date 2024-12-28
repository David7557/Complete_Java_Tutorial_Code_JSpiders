package org;

public class Solution {
	public static void main(String[] args) {
		
		//Method - 1
		Swiggy s = new Swiggy();
		s.setName("swiggy");
		s.start();
		
		System.out.println("-------------");
		//Method - 2
		new Thread(new PhonePe(), "phonepe").start();
	}
}

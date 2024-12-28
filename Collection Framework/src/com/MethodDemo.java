package com;

import java.util.ArrayList;

public class MethodDemo {
	public static void main(String[] args) {
		ArrayList x = new ArrayList();
		x.add(10);
		x.add(20);
		
		ArrayList y = new ArrayList();
		y.add(x);
		y.add(30);
		
		System.out.println("Element -> "+y+ " & Size -> "+y.size());
	}
}

/**
 * 1. If we use y.addAll(x); -> All the objects of 1 collection is added into another 
 * Collection 1 by 1 (sequentially).
 * Therefore Element are [10, 20, 30] and size is 3.
 * 
 * 2. If we use y.add(x); -> All the objects of 1 collection is added into another collection as a single 
 * object.
 * Therefore element are [[10,20],30] nested list and size is 2.
 * 
 **/

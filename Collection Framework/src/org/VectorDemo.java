package org;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		
		for(int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		System.out.println("------------------");
		for(Integer i: v) {
			System.out.println(i);
		}
	}

}

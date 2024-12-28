package com;
import java.util.ArrayList;
class MainClass {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(10.2);
		l.add("David");
		
		for ( int i = 0; i < l.size(); i ++) {
			System.out.println(l.get(i));
		}
		
		System.out.println("---------------");
		
		for (int i = l.size() -1; i >=0; i--) {
			System.out.println(l.get(i));
		}
	}
}

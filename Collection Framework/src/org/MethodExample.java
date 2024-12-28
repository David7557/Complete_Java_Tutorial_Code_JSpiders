package org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class MethodExample {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		System.out.println(al);//[10, 20, 30]
		Collections.sort(al);
		System.out.println(al);//[10, 20, 30]
		Collections.reverse(al);
		System.out.println(al);//[30, 20, 10]
		
		
		System.out.println("--------------------");
		
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(1.2);
		l.add(true);
		
		//Collections.sort(l);
		System.out.println(l);//[10, 1.2, true]
		Collections.reverse(l);
		System.out.println(l);//[true, 1.2, 10]
	}

}

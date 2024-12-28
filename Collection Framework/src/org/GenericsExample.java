package org;

import java.util.ArrayList;
import java.util.LinkedList;

public class GenericsExample {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
 
		l.add(10);
		l.add(15);
		l.add(20);

		for(Integer i: l) {// for(int i: l)
			System.out.println(i);
		}

		System.out.println("-----------");

		LinkedList<Double> ll = new LinkedList<Double>();
		ll.add(12.3);
		ll.add(34.5);
		ll.add(12.3);

		for(double x: ll) {// for(Double x: ll)
			System.out.println(x);
		}

		System.out.println("---------------");

		LinkedList l1 = new LinkedList();
		l1.add(12);//l1.add(new Integer(12);
		l1.add(12.5);//l1.add(new Double(12.5);
		l1.add("david");//l1.add(new String("david");

		//Generalization or Upcasting
		//1. Object obj = new Integer(12);
		//1. Object obj = new Double(12.5);
		//1. Object obj = new String("david");

		for (Object obj : l1) {
			System.out.println(obj);//Internally -> object.toString() -> toString() is overridden in all  Wrapper classes.

		}
	}
}

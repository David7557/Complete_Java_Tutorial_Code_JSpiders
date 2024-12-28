package example;

import java.util.ArrayList;
import java.util.ListIterator;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(10.5);
		al.add(10.6);
		
		// 1. Only forward - ListIterator
		
		ListIterator<Double> itrf = al.listIterator();
		while(itrf.hasNext()) {
			System.out.println(itrf.next());
		}
		
		//2. Forward and backward direction --> ListIterator
		System.out.println("--------------");
		
		ListIterator<Double> itrfb = al.listIterator();
		while(itrfb.hasNext()) {
			System.out.println(itrfb.next());
		}
		System.out.println("-------------");
		while(itrfb.hasPrevious()) {
			System.out.println(itrfb.previous());
		}
		//3.Backward direction --> ListIterator
		System.out.println("--------------");
		ListIterator<Double> itrb = al.listIterator(al.size());
		while(itrb.hasPrevious()) {
			System.out.println(itrb.previous());
		}
		
		System.out.println("David ");
		
	}
}

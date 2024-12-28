package storingobjects;

import java.util.ArrayList;
import java.util.Collections;

public class MobileMainClass {
	 public static void main(String[] args) {
		Mobile m1 = new Mobile(12000);
		Mobile m2 = new Mobile(13000);
		Mobile m3 = new Mobile(14000);
		
		ArrayList<Mobile> al = new ArrayList<Mobile>();
		al.add(m1);
		al.add(m2);
		al.add(m3);
		
		
		System.out.println("Insertion order maitained");
		System.out.println("------------------");
		
		for(Mobile m : al) {
			System.out.println(m);
		}
		
		
		System.out.println();
		System.out.println("Ascending order");
		System.out.println("-----------------");
		
		Collections.sort(al);
		
		for(Mobile m : al) {
			System.out.println(m);
		}
		System.out.println();
		System.out.println("Descending order");
		System.out.println("----------------");
		
		
		Collections.reverse(al);
		
		for(Mobile m : al) {
			System.out.println(m);
		}
		
	}
}

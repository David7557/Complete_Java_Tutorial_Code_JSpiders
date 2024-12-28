package storingobjects;

import java.util.ArrayList;
import java.util.Collections;

public class CountryMainClass {
	public static void main(String[] args) {
		Country c1 = new Country("India", 3.5);
		Country c2 = new Country("Russia", 2.4);
		Country c3 = new Country("Thailand", 2.0);
		
		ArrayList<Country> al = new ArrayList<Country>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		
		Collections.sort(al, new CountryNameComparator());
		
		
		for(Country c : al ) {
			System.out.println(c);
		}
		System.out.println("------------------");
		Collections.sort(al);
		
		for(Country c: al) {
			System.out.println(c);
		}
	}
}

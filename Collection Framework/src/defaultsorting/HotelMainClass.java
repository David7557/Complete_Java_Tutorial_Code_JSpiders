package defaultsorting;

import java.util.TreeSet;

public class HotelMainClass {
	public static void main(String[] args) {
		
		Hotel h1 = new Hotel("Taj", 4.5);
		Hotel h2 = new Hotel("Garoma Gorom", 3.5);
		Hotel h3 = new Hotel("Holy Palace", 4.00);
		
		TreeSet<Hotel> ts = new TreeSet<Hotel>();
		ts.add(h1);
		ts.add(h2);
		ts.add(h3);
		
		for (Hotel d: ts) {
			System.out.println(d);
		}
	}
}

package traversingobjects;

import java.util.ArrayList;
import java.util.Iterator;

public class MobileMainClass {
	public static void main(String[] args) {
		Mobile m1 = new Mobile("Apple",25000);
		Mobile m2 = new Mobile("Poco", 20000);

		ArrayList<Mobile> al = new ArrayList<Mobile>();
		al.add(m1);
		al.add(m2);

		Iterator <Mobile> l = al.iterator();
		while(l.hasNext()) {
			System.out.println(l.next());
		}
	}
}

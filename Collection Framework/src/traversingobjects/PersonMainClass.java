package traversingobjects;

import java.util.ArrayList;
import java.util.Iterator;

public class PersonMainClass {
	public static void main(String[] args) {
		Person p1 = new Person(19, "Tom", 2.4);
		Person p2 = new Person(12, "Jerry", 5.2);

		ArrayList<Person> al = new ArrayList<Person>();
		al.add(p1);
		al.add(p2);

		Iterator<Person> i = al.iterator();
		while(i.hasNext()) {
			Person p = i.next();
			System.out.println("Age: "+p.age+" Name: "+p.name+" Height: "+p.height);
		}
	}
}

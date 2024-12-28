package defaultsorting;

import java.util.TreeSet;

public class CarMainClass {
	public static void main(String[] args) {
		Car c1 = new Car(150000);
		Car c2 = new Car(450000);
		Car c3 = new Car(340000);

		TreeSet<Car> ts = new TreeSet<Car>();

		ts.add(c3);
		ts.add(c1);
		ts.add(c2);

		//System.out.println(ts);
		//System.out.println(ts);
		
		
		for(Car i : ts ) {
			System.out.println(i);
		}
		
		
	}
}

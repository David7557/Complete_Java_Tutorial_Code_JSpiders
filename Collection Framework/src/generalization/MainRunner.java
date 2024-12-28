package generalization;

import java.util.ArrayList;

public class MainRunner {
	public static void main(String[] args) {
		ArrayList<Vehicle> al = new ArrayList<Vehicle>();
		al.add(new Car());
		al.add(new Bike());
		al.add(null);
		
		for(Vehicle v : al) {
			if(v instanceof Car) {
				Car c = (Car) v;
				c.drive();
			}
			else if (v instanceof Bike) {
				Bike b = (Bike) v;
				b.ride();
			}
		}
	}
}

package generalization;

public class Vehicle {

}

class Car extends Vehicle{
	void drive() {
		System.out.println("Driving car!");
	}
}

class Bike extends Vehicle{
	void ride() {
		System.out.println("Bike riding!");
	}
}

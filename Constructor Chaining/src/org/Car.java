package org;

public class Car {
	String brandString;
	int cost;
	
	Car (String brandString){
		this.brandString = brandString;
	}
	
	Car(String brandString, int cost){
		this(brandString);
		this.cost = cost;
	}

	public static void main(String[] args) {
		Car c = new Car("Suzuki", 50000);
		System.out.println(c.brandString);
		System.out.println(c.cost);

	}

}

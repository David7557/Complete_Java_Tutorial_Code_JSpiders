package javabean;

public class CarMainClass {

	public static void main(String[] args) {
		Car car = new Car();
		car.setBrandString("Volvo");
		car.setCost(500000);

		String brand = car.getBrandString();
		int cost = car.getCost();
		System.out.println("Brand: "+brand+"\nCost:"+cost);

	}

}

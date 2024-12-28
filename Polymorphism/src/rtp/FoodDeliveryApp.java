package rtp;

class FoodDeliveryApp {
	void orderFood() {
		System.out.println("Odering Food");
	}
}

class Swiggy extends FoodDeliveryApp{
	@Override
	void orderFood() {
		System.out.println("Ordering food from swiggy");
	}
}

class Zomato extends FoodDeliveryApp{
	@Override
	void orderFood() {
		System.out.println("Ordering food from zomato");
	}
}

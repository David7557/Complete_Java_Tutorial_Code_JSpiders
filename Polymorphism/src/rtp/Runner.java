package rtp;

class Runner {

	static void selectApp(FoodDeliveryApp obj) {
		obj.orderFood();

	}

	public static void main(String[] args) {
		//1. Upcasting using a method
		selectApp(new Swiggy());
		selectApp(new Zomato());

		System.out.println("--------------");

		//2. Upcasting using single reference variable
		FoodDeliveryApp f;
		f = new Swiggy();
		f.orderFood();
		f = new Zomato();
		f.orderFood();

		System.out.println("--------------");

		//3. Upcasting using separate reference variable

		FoodDeliveryApp s = new Swiggy();
		s.orderFood();
		FoodDeliveryApp z = new Zomato();
		z.orderFood();

	}

}

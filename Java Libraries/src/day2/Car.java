package day2;

class Car {
	int cost;

	Car(int cost){
		this.cost = cost;
	}

	@Override
	public boolean equals(Object obj) {// upcasting Object ob = new Car(200)
		if(obj instanceof Car) {
			Car c = (Car) obj;
			return this.cost == c.cost;
		}
		return false;
	}

	public static void main(String[] args) {
		Car c1 = new Car(200000);
		Car c2 = new Car(200000);

		System.out.println(c1.equals(c2));
		
		System.out.println(c1.equals(new Car(20000)));
		System.out.println(new Car(2000).equals(new Car(2000)));
		
		if(c1.equals(c2)) {
			System.out.println("Cost is same.");
		}else {
			System.out.println("Not same");
		}
		
		
		
		
		
		
	}
}

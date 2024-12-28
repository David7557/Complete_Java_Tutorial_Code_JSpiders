package day1;

class Car {
	
	@Override
	public String toString() {
		return "car@123";
	}
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c);//toString()
		System.out.println(c.toString());

	}

}

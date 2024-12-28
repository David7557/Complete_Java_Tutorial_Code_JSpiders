package assignmentOnInterface;

class David extends Person implements Uber, Swiggy{
	
	@Override
	void walk() {
		System.out.println("Person is walking.");
	}
	
	@Override
	public void bookCab() {
		System.out.println("Person is booking cab.");
	}
	
	@Override
	public void orderFood() {
		System.out.println("Person ordering Food.");
	}

	public static void main(String[] args) {

		David d = new David();
		
		d.walk();
		d.bookCab();
		d.orderFood();
	}

}

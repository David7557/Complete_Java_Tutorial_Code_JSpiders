package interFace;

class Action implements A, B{
	@Override
	public void eat() {
		System.out.println("I am eating.");
	}
	@Override
	public void drink() {
		System.out.println("I am drinking");
	}

	public static void main(String[] args) {
		Action a = new Action();
		
		a.eat();
		a.drink();

	}

}

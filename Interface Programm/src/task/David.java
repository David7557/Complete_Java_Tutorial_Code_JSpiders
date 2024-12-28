package task;

class David extends Student implements Hotel, Theater{
	
	@Override
	void study() {
		System.out.println("Student Studing");
	}
	
	@Override
	public void eatFood() {
		System.out.println("Eating food");
	}
	
	@Override
	
	public void watchMovie() {
		System.out.println("Watching movies");
	}

	public static void main(String[] args) {
		David d = new David();
		d.study();
		d.eatFood();
		d.watchMovie();

	}

}

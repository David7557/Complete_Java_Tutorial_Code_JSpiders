package interFace;

interface Father {
	void dance(int age);
}

class Son implements Father{
	public void dance(int age) {
		if (age >= 25 && age <= 50) {
			System.out.println("You can dance Father.");
		}else {
			System.out.println("You have to take rest.");
		}
	}
}

package interFace;

class Employee{
	int id = 101;
	String name = "Raju";
}

class Developer extends Employee{
	void devApp() {
		System.out.println("Employee developing an App.");
	}
}

class Tester extends Employee{
	void testApp() {
		System.out.println("Employee testing an App.");
	}
}

public class Main {
	
	public static void teamWork(Employee obj) {
		if(obj instanceof Developer) {
			Developer d = (Developer) obj;
			System.out.println("Id: "+d.id+" Name: "+d.name);
			d.devApp();
		}else if(obj instanceof Tester) {
			Tester t = new Tester();
			System.out.println("Id: "+t.id+" Name: "+t.name);
			t.testApp();
		}
	}

	public static void main(String[] args) {
		teamWork(new Developer());
		teamWork(new Tester());

	}

}

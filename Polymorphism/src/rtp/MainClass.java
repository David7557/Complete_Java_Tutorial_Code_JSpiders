package rtp;

class MainClass {
	// if display(new Developer());--> Employee obj = new Developer();-->obj.work()
	// if display(new Tester());--> Employee obj = new Tester();-->obj.work()

	static void display(Employee obj) {
		obj.work();
	}

	public static void main(String[] args) {
		//1. Upcasting using method 
		display(new Developer());
		display(new Tester());

		System.out.println("----------------------");
		//2. Upcasting using single reference variable

		Employee emp;
		emp = new Developer();//rule 3-> Upcasting
		emp.work();
		emp = new Tester();//Rule 3 -> upcasting
		emp.work();

		System.out.println("--------------------");

		//3. Upcasting using separate reference variable
		Employee e1 = new Developer();// rule 3 -> upcasting
		e1.work();

		Employee e2 = new Tester();//rule 3 -> upcasting
		e2.work();

	}

}

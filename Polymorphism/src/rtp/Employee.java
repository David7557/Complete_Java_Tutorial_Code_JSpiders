package rtp;

class Employee {
	void work() {
		System.out.println("Employee is working");
	}
}


//rule 1
class Developer extends Employee{ 
	//rule 2
	@Override
	void work() {
		System.out.println("Develping App!");
	}
}


//rule 1
class Tester extends Employee{
	//rule 2
	@Override
	void work() {
		System.out.println("Testing App!");
	}
}

package storingobjects;

public class Employee {
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return "Id: "+id+" Name: "+name+" Salary: "+salary;
	}

}

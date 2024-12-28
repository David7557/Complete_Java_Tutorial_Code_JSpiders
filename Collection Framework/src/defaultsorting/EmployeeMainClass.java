package defaultsorting;

import java.util.TreeSet;

public class EmployeeMainClass {
	public static void main(String[] args) {
		Employee e1 = new Employee(103, "John");
		Employee e2 = new Employee(102, "David");
		Employee e3 = new Employee(101, "Rama");
		
		
		TreeSet<Employee> ts = new TreeSet<Employee>();
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		
		for(Employee obj: ts) {
			System.out.println(obj);
		}
	}
}

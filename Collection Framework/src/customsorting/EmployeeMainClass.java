package customsorting;

import java.util.TreeSet;

public class EmployeeMainClass {
	public static void main(String[] args) {
		Employee e1 = new Employee(103, "David");
		Employee e2 = new Employee(102, "Sumit");
		Employee e3 = new Employee(101, "Jyoti");
		
		
		TreeSet<Employee> tid = new TreeSet<Employee>(new EmployeeIdComparator());
		tid.add(e3);
		tid.add(e2);
		tid.add(e1);

		for(Employee e: tid) {
			System.out.println(e);
		}

		System.out.println("---------------------------");
		TreeSet<Employee> tname = new TreeSet<Employee>(new EmployeeNameComparator());
		tname.add(e3);
		tname.add(e2);
		tname.add(e1);


		for(Employee e: tname) {
			System.out.println(e);
		}
	}
}

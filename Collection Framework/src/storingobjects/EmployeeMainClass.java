package storingobjects;

import java.util.ArrayList;

public class EmployeeMainClass {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "David", 3.4);
		Employee e2 = new Employee(102, "Amit", 3.5);
		Employee e3 = new Employee(103, "Punam", 3.6);
		Employee e4 = new Employee(104, "Jyoti", 3.7);
		Employee e5 = new Employee(105, "Sumit", 3.8);

		ArrayList<Employee> al = new ArrayList<Employee>();

		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);

		System.out.println("Employee Details");
		System.out.println("---------------------------");
		System.out.println();
		for(Employee e: al) {
			System.out.println(e);
		}


		System.out.println("Employee name start with J");
		System.out.println("---------------------------");
		System.out.println();
		for(Employee e: al) {
			if(e.name.charAt(0) == 'J') {
				System.out.println(e);
			}
		}


		System.out.println("Employee Salary between 2.5 to 3.5");
		System.out.println("-----------------------");
		System.out.println();

		for(Employee obj: al) {
			if(obj.salary <= 3.5 && obj.salary >= 2.5) {
				System.out.println(obj);
			}
		}
	}

}

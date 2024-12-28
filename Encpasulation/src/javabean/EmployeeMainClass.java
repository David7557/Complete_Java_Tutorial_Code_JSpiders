package javabean;
import java.util.Scanner;

public class EmployeeMainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee e = new Employee();
		
		System.out.println("Enter the EmpId: ");
		int id = sc.nextInt(); //e.setId(sc.nextInt());
		
		System.out.println("Enter the Emp Name: ");
		String name = sc.next(); //e.setName(sc.next());
		
		System.out.println("Enter the salary: ");
		int salary = sc.nextInt(); //e.setSalary(sc.nextInt());
		
		sc.close();

		e.setId(id);
		e.setName(name);
		e.setSalary(salary);
		
		System.out.println("-----------Employee Details--------------");
		System.out.println("Id: "+e.getId());
		System.out.println("Id: "+e.getName());
		System.out.println("Id: "+e.getId());

	}

}

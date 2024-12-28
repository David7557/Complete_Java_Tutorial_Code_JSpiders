package traversingobjects;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeMainClass {

	public static void main(String[] args) {
		Employee e1 = new Employee("David", 10.0);
		Employee e2 = new Employee("Punam", 60.0);
		Employee e3 = new Employee("Jyoti", 5.00);

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);

		Iterator<Employee> i = al.iterator();
		while(i.hasNext()) {
			Employee e = i.next();
			System.out.println("Salary of "+e.name+" is "+e.salary+" LPA");
		}

	}

}

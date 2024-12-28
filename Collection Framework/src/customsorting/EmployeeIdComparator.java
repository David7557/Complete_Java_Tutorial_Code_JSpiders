package customsorting;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee curEmployee, Employee exEmployee) {
		return curEmployee.id - exEmployee.id;
	}

}

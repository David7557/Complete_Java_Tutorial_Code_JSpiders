package customsorting;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee curEmp, Employee exiEmp) {
		return curEmp.name.compareTo(exiEmp.name);
	}

}

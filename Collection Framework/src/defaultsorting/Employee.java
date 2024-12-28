package defaultsorting;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	
	public Employee(int id, String name) {
		this.id = id ;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Id: "+id+" Name: "+name;
	}
	
	@Override
	
	public int compareTo(Employee e) {
		return this.id - e.id;
	}
}

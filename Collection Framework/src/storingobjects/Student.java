package storingobjects;

public class Student {
	int age;
	String name;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name+" is "+ age + " years old.";
	}

}

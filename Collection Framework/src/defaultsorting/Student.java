package defaultsorting;

public class Student implements Comparable<Student> {
	int age;
	String name;
	
	Student(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name+" is "+age+" years old.";
	}
	
	@Override
	public int compareTo(Student s) {
		return this.name.compareTo(s.name);
	}
	
/*
 * @Override public int compareTo(Student s) { return this.name - s.name; } }
 */
}

/**
 * this -> current objects to inserted
 * s -> already existing object
 * 
 * Sorting based on age (int):
 * 1. Ascending order -> return this.age - s.age;
 * 2. Descending order -> return s.age - this.age;
 * 
 * For String comparison, we should use compareTo() of String class.
 * 
 * Sorting based on name (String):
 * 1. Ascending order -> return this.name.compareTo(s.name);
 * 2. Descending order -> return s.name.compareTo(this.name);
 * 
 */
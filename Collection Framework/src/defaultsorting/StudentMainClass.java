package defaultsorting;

import java.util.Iterator;
import java.util.TreeSet;

public class StudentMainClass {
	public static void main(String[] args) {
		Student s1 = new Student(21, "Tom");
		Student s2 = new Student(20, "Jerry");
		Student s3 = new Student(22, "David");
		
		
		TreeSet<Student> ts = new TreeSet<Student>();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		
		Iterator<Student> itr = ts.iterator();
		while(itr.hasNext()) {
			Student temp = itr.next();
			System.out.println(temp.toString());
		}
			
	}
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







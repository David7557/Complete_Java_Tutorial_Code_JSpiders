package customsorting;

import java.util.TreeSet;

public class StudentMainClass {
	public static void main(String[] args) {
		Student s1 = new Student(21);
		Student s2 = new Student(12);
		Student s3 = new Student(23);
		
		
		//StudentAgeComparator age = new StudentAgeComparator();
		//TreeSet<Student> ts = new TreeSet<Student>(age);
		
		TreeSet<Student> ts = new TreeSet<Student>(new StudentAgeComparator());
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		
		for(Student s : ts) {
			System.out.println(s);
		}
	}
}

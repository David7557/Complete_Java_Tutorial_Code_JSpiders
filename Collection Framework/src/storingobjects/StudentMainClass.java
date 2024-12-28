package storingobjects;

import java.util.ArrayList;

public class StudentMainClass {
	public static void main(String[] args) {
		Student s1 = new Student("David", 22);
		Student s2 = new Student("Punam", 21);

		ArrayList<Student> a = new ArrayList<Student>();
		a.add(s1);//a.add(new Student("David", 22));
		a.add(s2);//a.add(new Student("Punam", 21));

		for(Object obj: a) {//for(Student obj: a)
			System.out.println(obj);
		}
	}
}

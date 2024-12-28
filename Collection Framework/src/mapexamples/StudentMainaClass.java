package mapexamples;

import java.util.LinkedHashMap;
import java.util.Set;

public class StudentMainaClass {
	public static void main(String[] args) {
		Student s1 = new Student("David");
		Student s2 = new Student("John");

		LinkedHashMap<Student, Integer> map = new LinkedHashMap<Student, Integer>();
		map.put(s1, 90);//map.put(new Student("David"), 90);
		map.put(s2, 67);//map.put(new Student("John"), 67);

		Set<Student> keys = map.keySet();// s1, s2 

		for(Student key: keys) {
			System.out.println(key+" Mark: "+map.get(key));
		}
	}
}

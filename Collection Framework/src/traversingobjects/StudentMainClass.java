package traversingobjects;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentMainClass {

	public static void main(String[] args) {
		Student s1 = new Student(21, "Tom");
		Student s2 = new Student(20, "Jerry");
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(s1);
		al.add(s2);
		
		Iterator<Student> i = al.iterator();
		
		while(i.hasNext()) {
			Student temp = i.next();
			System.out.println("Age: "+temp.age+" Name: "+temp.name);
			//System.out.println("Age: "+i.next().age+" Name: "+i.next().name);
		}
;	}

}

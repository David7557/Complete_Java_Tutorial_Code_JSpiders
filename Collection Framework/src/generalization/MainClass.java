package generalization;

import java.util.ArrayList;

public class MainClass  {
	public static void main(String[] args) {
		ArrayList<StuEmp> l = new ArrayList<StuEmp>();
		l.add(new Student());
		l.add(new Employee());
		
		for(StuEmp sm: l) {
			if (sm instanceof Student) {
				Student s = (Student) sm;
				System.out.println(s.marks);
			}else {
				Employee e = (Employee) sm;
				System.out.println(e.salary);
			}
		}
	}
}

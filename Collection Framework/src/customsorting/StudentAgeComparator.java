package customsorting;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {
	@Override
	public int compare(Student x, Student y) {
		return x.age - y.age;//for descending order -> return y.age - x. age;
	}
}

// x -> current object to be inserted
//y -> existing object
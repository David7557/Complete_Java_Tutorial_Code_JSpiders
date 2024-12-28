package day2;

class Student {
	int age;

	Student(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) { //1. Upacasting -> Object obj = new Student();
		if(obj instanceof Student) {   //2. Checking id the obj is having the Student object
			Student s = (Student) obj; //3. Downcasting 
			return this.age == s.age; //4. Comparison Logic -> return s1.age == s2;
		}

		return false;	              //5. return false for the negative scenario
	}
	public static void main(String[] args) {
		Student s1 = new Student(20);
		Student s2 = new Student(20);
		System.out.println(s1.equals(s2));// s1.equals(new Student(20));
	}

}

//s1-> this
// s2-> obj(upcasting reference) -> s (downcast reference)
// in the above program upcasting is achieve only when we call / invoke equals()


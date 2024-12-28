package day1;

class Student {
	int age;
	
	public Student(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student age is "+age;
	}
	
	public static void main(String[] args) {
		Student s = new Student(20);
		System.out.println(s);//toString 
	}
}

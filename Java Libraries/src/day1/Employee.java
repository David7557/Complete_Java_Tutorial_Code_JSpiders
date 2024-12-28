package day1;

class Employee {
	int id;
	String name;
	
	 Employee(int id, String name) {
		 this.id = id;
		 this.name = name;
	}
	 
	 @Override
	 public String toString() {
		 return "Emplyee Id of "+name+" is "+id;
	 }

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Tom");
		Employee e2 = new Employee(102, "David");
		System.out.println(e1);
		System.out.println(e2);
		
		
	}

}

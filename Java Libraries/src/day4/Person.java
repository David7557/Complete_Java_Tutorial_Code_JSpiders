package day4;

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			
			return this.age == p.age && this.name.equals(p.name);//this.name == p.name
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("David", 21);
		Person p2 = new Person("Jyoti", 21);
		System.out.println(p1.equals(p2));
	}

}

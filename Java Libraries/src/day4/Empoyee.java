package day4;

class Empoyee {
	int id;
	
	public Empoyee(int id) {
		this.id= id;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean equals(Object obj) {//1. Upcasting: Object obj = new Employee(100);
		if(obj instanceof Empoyee) {//2. checking if obj having employee object
			Empoyee e = (Empoyee) obj;//3. Down Casting
			return this.id == e.id;//4. Comparison Logic -> e1.id == e2.id -> true
		}
		return false;// 5. return false
	}
	
	public static void main(String[] args) {
		Empoyee e1 = new Empoyee(100);
		Empoyee e2 = new Empoyee(100);
		System.out.println(e1.equals(e2));
	}

}

package com;

class Runner {

	static void display(Employee obj) {
		if(obj instanceof Developer) {
			Developer d = (Developer) obj;
			System.out.println("Id: "+d.id+" Name: "+d.name);
			d.developer();
		}else if(obj instanceof Tester) {
			Tester t = (Tester) obj;
			System.out.println("Id: "+t.id+" Name: "+ t.name);
			t.testApp();
		}
	}
	public static void main(String[] args) {
		display(new Developer());
		System.out.println("----------------------------");
		display(new Tester());

	}

}

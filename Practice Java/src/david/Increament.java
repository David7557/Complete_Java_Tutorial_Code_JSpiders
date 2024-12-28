package david;

class A{
	private int age;
	public void set(int age) {
		this.age = age;
	}
	
	public int get() {
		return age;
	}
}
public class Increament {
	public static void main(String[] args) {
		A a = new A();
		a.set(15);
		System.out.println(a.get());
	}
}

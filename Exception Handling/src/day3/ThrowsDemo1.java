package day3;

class ThrowsDemo1 {
	static void div() throws ArithmeticException{
		System.out.println(10/0);//Unchecked exception
	}
	public static void main(String[] args) {
		System.out.println("Start");
		
		try {
			div();//method caller
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("End");
	
	}
}

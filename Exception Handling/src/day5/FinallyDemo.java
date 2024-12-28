package day5;

class FinallyDemo {
	public static void main(String[] args) {
		System.out.println("Start");
		
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
//			System.out.println("Invalid denominator");
//			System.out.println(e.getMessage());
		} finally {
			System.out.println("Inside Finally block");
		}
		System.out.println("End");
	}
}

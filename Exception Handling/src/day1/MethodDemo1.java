package day1;

class MethodDemo1 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			String message = e.getMessage();
			System.out.println(message);
			
			System.out.println("-------------------");
			
			System.out.println(e.getMessage());
			
			System.out.println("-------------");
			
			e.printStackTrace();
		}
	}
}

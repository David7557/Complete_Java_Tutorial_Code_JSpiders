package customexception;

import java.util.Scanner;

class Login {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Password: ");
		int password = sc.nextInt();
		sc.close();
		
		if (password == 123) {
			System.out.println("Login Successfull");
		}else {
			try {
				throw new InvalidPasswordException("Kindly Enter valid Password");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

package sbi;
//import java.awt.Frame;
import java.util.Scanner;

class MainBank {
	
	/*
	 * public MainBank() { Frame frame = new Frame("Banking");
	 * 
	 * }
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank b = new BankImplementation();
		System.out.println("Enter your login credentials:");
		int userid = sc.nextInt();
		String password= sc.next();
		b.login(userid, password);
		sc.close();
	}

}

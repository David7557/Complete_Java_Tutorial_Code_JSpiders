package interFace;
import java.util.Scanner;

class MainSon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your father age: ");
		int age = sc.nextInt();
		
		sc.close();
		
		Son s = new Son();
		
		s.dance(age);
	}
}

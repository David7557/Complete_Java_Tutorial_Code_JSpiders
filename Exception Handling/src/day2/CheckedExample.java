package day2;

import java.io.FileNotFoundException;
import java.io.FileReader;

class CheckedExample {
	public static void main(String[] args) {
		//Unhandled exception type interruption
		for(int i =1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println("Handle");
			}
		}
		
		//unhandled exception type file not found
		try {
			FileReader f = new FileReader("car.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}

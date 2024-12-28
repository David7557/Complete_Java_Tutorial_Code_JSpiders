package day3;

import java.io.FileNotFoundException;
import java.io.FileReader;

class ThrowsDemo3 {
	static void fetch() throws FileNotFoundException{
		FileReader file = new FileReader("Car.txt");
	}
	
	
	public static void main(String[] args) {
		try {
			fetch();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}
}

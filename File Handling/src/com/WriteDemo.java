package com;

import java.io.File;
import java.io.FileWriter;

public class WriteDemo {
	public static void main(String[] args) throws Exception {

		File f = new File("employee.txt");

		FileWriter fw = new FileWriter(f);

		fw.write("Good Afternoon!!!");//convert character to stream of binary values
		
		fw.flush();// Again get back to stream of binary value to character

		fw.close();//fw.close() implicitly call the fw.flush();
		System.out.println("Data Stored successfully!!");
	}
}

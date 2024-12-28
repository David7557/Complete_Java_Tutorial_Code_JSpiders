package com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteExample {
	public static void main(String[] args) throws IOException {
		File f = new File("student.txt");
		FileWriter fw = new FileWriter(f, true);//append = false --> by default (implicitly append method)
		// if append = true it will allow us to  concatenate the string.
		fw.write(" at JSpiders.");
		fw.flush();
		fw.close();
		System.out.println("Data Stored!!");

	}
}

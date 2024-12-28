package com;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadExample {
	public static void main(String[] args) throws IOException {
		//File f = new File("student.txt");
		//FileReader fr = new FileReader(new File("student.txt"));
		//FileReader fr = new FileReader("student.txt");
		
		FileReader fr = new FileReader(new File("student.txt"));
		
		int x = fr.read();
		while(x != -1) {
			System.out.print((char)x);
			x = fr.read();
		}
	}
}

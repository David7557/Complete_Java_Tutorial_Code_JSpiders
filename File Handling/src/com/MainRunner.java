package com;

import java.io.File;

public class MainRunner {
	public static void main(String[] args) {
		File f = new File("d:/student.txt");
		System.out.println(f.exists());
		
		if (f.exists()) {
			f.delete();
			System.out.println("File or Folder deleted!");
		}else {
			System.out.println("Not present");
		}
	}
}

package com;

import java.io.File;

public class Demo {
	public static void main(String[] args) {
		
		//object representation of a file name or folder name
		// File f = new file("car");
		
		//File / Folder gets created in d drive
		// File f = new file("d:/car");
		
		// file/ folder gets created within the project
		File f = new File("car");
		boolean result = f.mkdir();
		System.out.println(result); //System.out.println(f.mkdir());
	}
}

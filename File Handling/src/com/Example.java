package com;

import java.io.File;
import java.util.Date;

public class Example {
	public static void main(String[] args) {
		//Specifying file name
		File f = new File("d:/student.doc");
		
		
		//getting millisecond value
		
		long milliseconds = f.lastModified();
		
		//converting millisecond value into date format
		
		Date d = new Date(milliseconds);
		
		//printing reference variable, calls toString()
		
		System.out.println(d);
		
		System.out.println("----------------------");
		
		File f1 = new File("d:/student.doc");
		Date d1 = new Date(f1.lastModified());
		System.out.println(d1);
		
		System.out.println("----------------------");
		
		Date d2 = new Date(new File("d:/student.doc").lastModified());
		System.out.println(d2);
		
		System.out.println("------------------------");
		
		System.out.println(new Date(new File("d:/student.doc").lastModified()));
		
		
	}
}

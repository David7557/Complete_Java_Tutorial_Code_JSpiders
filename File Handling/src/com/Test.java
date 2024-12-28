package com;

import java.io.File;

public class Test {
	public static void main(String[] args) throws Exception {
		
		// .txt, .doc, .xlsx, .pdf
		
		File f = new File("d:/student.pdf");
		System.out.println(f.createNewFile());
		
		/*
		 * File fdoc = new File("d:/student.doc");
		 * System.out.println(f.createNewFile());
		 * 
		 * File fxlsx = new File("d:/student.xlsx");
		 * System.out.println(f.createNewFile());
		 * 
		 * File fpdf = new File("d:/student.pdf");
		 * System.out.println(f.createNewFile());
		 */
	}
}

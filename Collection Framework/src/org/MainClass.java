package org;

import java.util.ArrayList;

public class MainClass {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		
		l.add(10);//l.add(new Integer(10);
		l.add(1.2);//
		l.add("Java");
		
		for(Object object : l) {
			if(object instanceof String) {
				System.out.println(object);
			}
		}
	}
}

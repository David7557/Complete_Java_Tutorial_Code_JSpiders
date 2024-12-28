package linkedlist;

import java.util.LinkedList;

class LinkedListExample {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		
		l.add(10);
		l.add(12.3);
		l.add(true);
		
		
		for(int i=0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
		
		System.out.println("----------------");
		
		for(int i=l.size()-1; i>=0; i--) {
			System.out.println(l.get(i));
		}
	}

}

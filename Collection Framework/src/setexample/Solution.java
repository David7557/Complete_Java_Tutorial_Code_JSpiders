package setexample;

import java.util.TreeSet;

public class Solution {
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>();
		t.add("B");
		t.add("C");
		t.add("A");
		
		for(String s:t) {
			System.out.println(s);
		}
	}
}

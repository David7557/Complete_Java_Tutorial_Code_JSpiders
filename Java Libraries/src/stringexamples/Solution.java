package stringexamples;

class Solution {
	public static void main(String[] args) {
		String s = new String("D");
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println("-----------------");
		
		System.out.println(s.hashCode());
		System.out.println("-----------------");
		
		String s1 = new String("Java");
		String s2 = new String("Java");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}

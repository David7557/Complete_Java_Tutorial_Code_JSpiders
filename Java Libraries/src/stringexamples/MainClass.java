package stringexamples;

class MainClass {
	public static void main(String[] args) {
		String s1 = new String("java");
		System.out.println(s1);//java
		s1.concat(" program");
		System.out.println(s1);//java
		
		System.out.println("--------------------");
		
		String s2 = new String("Java");
		System.out.println(s2);//Java
		s2 = s2.concat(" Programs");
		System.out.println(s2);// Java Programs
		
		System.out.println("-------------------");
		
		StringBuffer s3 = new StringBuffer("Good");
		System.out.println(s3);
		s3.append(" afternon");
		System.out.println(s3);
		
		System.out.println("--------------------");
		
		StringBuffer s4 = new StringBuffer("wake");
		System.out.println(s4);
		s4.append(" up!");
		System.out.println(s4);
		
		System.out.println("-------------------");
		
		StringBuffer s5 = new StringBuffer("Dabba");
		System.out.println(s5);
		s5.append(" fellow");
		System.out.println(s5);
	}
}

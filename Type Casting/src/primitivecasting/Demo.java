package primitivecasting;

class Demo {

	public static void main(String[] args) {
		//widening 
		int a = 25;
		double b = a;
		System.out.println(a+" "+b);// 25 25.0

		double c = 10;
		System.out.println(c);

		char x = 'B';
		int y = x;
		System.out.println(x+" "+y);//B 66
		System.out.println("-----------------");

		//Narrowing

		double i = 12.5;
		int j = (int) i;
		System.out.println(j);

		int z = (int) 40.23;
		System.out.println(z);


		int p = 97;
		char q = (char) p;
		System.out.println(p+" "+q);//97 a

		System.out.println("------------------");

		System.out.println((int) 50.67);//50
		System.out.println((char)65);//A
		System.out.println("----------------");
		System.out.println("A"+"B");//AB
		System.out.println("A"+10);//A10
		System.out.println('A'+"B");//AB
		System.out.println("A"+10+20);//A1020
		System.out.println("-------------------");
		System.out.println(10+20+"A");//30A
		System.out.println("------------------");
		System.out.println('A'+'B');//131
		System.out.println('a'+20);//117


	}

}

package day3;

class ThrowsDemo2 {
	static void dis()throws Exception{
		for(int i =1; i<=5; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	public static void main(String[] args) {
		try {
			dis();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

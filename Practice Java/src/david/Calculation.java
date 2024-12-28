package david;

class Calculation {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		int bigNum = 0;
		
		if(a < b) {
			bigNum = b;
			return bigNum-a;
		}
		else if(b<a) {
			bigNum = a;
			return bigNum-b;
		}
		
		return -1;
		
	}
	
	public int mul(int a, int b) {
		return a * b;
	}
	
	public int div(int a, int b) {
		return a/b;
	}



}

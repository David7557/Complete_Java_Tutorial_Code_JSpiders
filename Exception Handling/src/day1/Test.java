package day1;

class Test {
	public static void main(String[] args) {
		System.out.println("Start");

		int[] arr = {10, 20, 30};

		try {
			System.out.println(arr[99]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index");
		}

		System.out.println("End");
	}
}

package day4;

public class CityMainClass {
	public static void main(String[] args) {
		City c1 = new City("Bangriposi", 757032);
		City c2 = new City("Baripada", 757092);

		City[] arr  = {c1, c2};
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

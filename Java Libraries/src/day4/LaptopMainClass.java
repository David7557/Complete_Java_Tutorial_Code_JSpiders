package day4;

public class LaptopMainClass {
	public static void main(String[] args) {
		Laptop l1 = new Laptop("Dell", 50000);
		Laptop l2 = new Laptop("Asus", 60000);
		Laptop[] obj = {l1, l2};
		for (int i =0; i < obj.length;i++) {
			System.out.println(obj[i]);
		}

	}

}

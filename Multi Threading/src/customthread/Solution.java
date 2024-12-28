package customthread;

public class Solution {
	public static void main(String[] args) {
		Tom t = new Tom();
		t.setName("Tom");
		t.start();

		Thread t1 = new Thread(new Jerry(), "Jerry");
		t1.start();
	}
}

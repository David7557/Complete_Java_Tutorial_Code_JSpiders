package org;

class Tom extends Employee implements Jspiders, Qspiders {

	@Override
	void work() {
		System.out.println("Working");
	}
	@Override
	public void developApp() {
		System.out.println("Developing app");
	}
	@Override
	public void testApp() {
		System.out.println("Testing app");
	}

	public static void main(String[] args) {

		Tom t = new Tom();
		t.work();
		t.developApp();
		t.testApp();

	}

}

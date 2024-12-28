package generalization;

interface MobileApplication {

}

class Swiggy implements MobileApplication{
	void orderFood() {
		System.out.println("Ordering food!!");
	}
}

class PhonePe implements MobileApplication{
	void makePayment() {
		System.out.println("Amount Paying!!");
	}
}

class Uber implements MobileApplication{
	void bookCab() {
		System.out.println("Booking a cab!!");
	}
}

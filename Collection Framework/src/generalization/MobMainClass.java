package generalization;

import java.util.ArrayList;

public class MobMainClass {
	public static void main(String[] args) {
		ArrayList<MobileApplication> l = new ArrayList<MobileApplication>();
		l.add(new Swiggy());
		l.add(new PhonePe());
		l.add(new Uber());

		for(MobileApplication ma: l) {
			
			if(ma instanceof Swiggy) {
				((Swiggy) ma).orderFood();
			}else if (ma instanceof PhonePe) {
				((PhonePe) ma).makePayment();
			}else if (ma instanceof Uber) {
				((Uber) ma).bookCab();
			}
			
		}
	}
}

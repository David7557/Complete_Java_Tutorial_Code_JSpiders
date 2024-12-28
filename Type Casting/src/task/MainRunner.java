package task;

class MainRunner {
	static void selectState(India obj) {
		if(obj instanceof Karnataka) {
			System.out.println("State---> Karnataka");
			Karnataka k = (Karnataka) obj;
			System.out.println("PM: "+k.pm+" CM: "+k.cm);
		}else if(obj instanceof TamilNadu) {
			System.out.println("State---> TamilNadu");
			TamilNadu t = (TamilNadu) obj;
			System.out.println("PM: "+t.pm+" CM: "+t.cm);
		}
		else {
			System.out.println("State---> Goa");
			Goa g = (Goa) obj;
			System.out.println("PM: "+g.pm+" CM: "+g.cm);
		}
	}
	
	public static void main(String[] args) {
		selectState(new Karnataka());
		System.out.println("---------------");
		selectState(new TamilNadu());
		System.out.println("---------------");
		selectState(new Goa());
	}
}

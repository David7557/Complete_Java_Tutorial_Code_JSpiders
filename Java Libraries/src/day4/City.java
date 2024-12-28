package day4;

class City {
	String name;
	int pincode;

	public City(String name, int pincode) {
		this.name = name;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Pin code for "+name+" is "+pincode;
	}

}

package traversingobjects;

public class Mobile {
	String brand;
	int cost;
	public Mobile(String brand, int cost) {
		this.brand = brand;
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "Brand: "+brand+ " Cost: "+cost;
	}
}
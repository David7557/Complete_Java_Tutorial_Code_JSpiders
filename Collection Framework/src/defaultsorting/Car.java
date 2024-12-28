package defaultsorting;

public class Car implements Comparable<Car> {
	int cost;
	public Car(int cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "Cost: "+cost;
	}
	
	@Override
	public int compareTo(Car c) {
		return this.cost - c.cost;// return c.cost - this.cost;
	}
}

//this --> current objects to be inserted
//c --> Already existing object

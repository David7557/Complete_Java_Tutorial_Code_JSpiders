package storingobjects;

public class Country implements Comparable<Country> {
	
	String name;
	Double population;
	
	Country(String name, double population){
		this.name = name;
		this.population = population;
	}
	
	@Override
	public String toString() {
		return "Country Name is "+name+ " & Population is "+population+" crores";
	}
	
	@Override
	public int compareTo(Country c) {
		return this.population.compareTo(c.population);
	}

}

package defaultsorting;

public class Hotel implements Comparable<Hotel> {
	String name;
	Double ratings;// Wrapper class declaration to call compareTo() of double class
	
	Hotel(String name, Double ratings){
		this.name = name;
		this.ratings = ratings;
	}
	
	@Override
	public String toString() {
		return "Name: "+name+" Ratings: "+ratings;
	}
	
	@Override
	public int compareTo(Hotel h) {
		return this.ratings.compareTo(h.ratings);
	}
}

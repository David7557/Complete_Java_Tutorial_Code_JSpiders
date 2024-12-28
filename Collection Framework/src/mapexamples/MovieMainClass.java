package mapexamples;

import java.util.Set;
import java.util.TreeMap;

public class MovieMainClass {
	public static void main(String[] args) {
		Movie m1 = new Movie("PK");
		Movie m2 = new Movie("Raja Hindustani");
		Movie m3 = new Movie("Stree 2");
		
		
		TreeMap<Movie, Double> tm = new TreeMap<Movie, Double>(new MovieNameComparator());
		tm.put(m1, 7.8);
		tm.put(m2, 9.0);
		tm.put(m3, 6.7);
		
		Set<Movie> keys = tm.keySet();
		for(Movie key: keys) {
			System.out.println(key+ " Ratings: "+tm.get(key));
		}
	}
}

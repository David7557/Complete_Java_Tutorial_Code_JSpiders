package mapexamples;

import java.util.Comparator;

public class MovieNameComparator implements Comparator<Movie> {
	@Override
	public int compare(Movie curMovie, Movie exMovie) {
		return curMovie.name.compareTo(exMovie.name);
	} 
}

package mapexamples;


public class Movie{
	String name;
	
	Movie(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Movie Name: "+name;
	}
	
}

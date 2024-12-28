package interviewprograms;

public class CricketPlayer implements Comparable<CricketPlayer> {
	String name;
	String country;
	int runs;
	
	CricketPlayer(String name, String country, int runs){
		this.name = name;
		this.country = country;
		this.runs = runs;
	}
	
	@Override
	public String toString() {
		return "Name: "+name+" Country: "+country+" Runs: "+runs;
	}
	
	

	@Override
	public int compareTo(CricketPlayer o) {
		
		return this.runs - o.runs;
	}
}

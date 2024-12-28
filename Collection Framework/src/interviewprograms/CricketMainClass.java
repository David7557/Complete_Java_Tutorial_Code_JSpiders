package interviewprograms;

import java.util.ArrayList;
import java.util.Collections;

public class CricketMainClass {
	public static void main(String[] args) {
		CricketPlayer c1 = new CricketPlayer("Sachin", "Ind", 1200);
		CricketPlayer c2 = new CricketPlayer("Virat", "Ind", 4500);
		CricketPlayer c3 = new CricketPlayer("David", "Aus", 3400);
		CricketPlayer c4 = new CricketPlayer("Malinga", "Sri", 2300);
		CricketPlayer c5 = new CricketPlayer("Danish", "Pak", 3200);

		ArrayList<CricketPlayer> al = new ArrayList<CricketPlayer>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(c4);
		al.add(c5);

		Collections.sort(al);

		System.out.println("Player with Highest Run");
		System.out.println("-------------------");
		System.out.println(al.get(al.size() - 1)+" Highest");
		System.out.println();
		System.out.println("Player with Lowest Run");
		System.out.println("-------------------");
		System.out.println(al.get(0)+" Lowest");
		System.out.println();

		System.out.println("--------------");
		System.out.println("Player Name Start with S");
		System.out.println("---------------");

		for(int i = 0; i < al.size(); i++) {
			String name = al.get(i).name;
			if(name.charAt(0)=='S' || name.charAt(0) == 's') {
				System.out.println(al.get(i));
			}
		}

		System.out.println("-------------------");
		System.out.println("Indian Cricket Player");
		System.out.println("-------------------");
		for(int i = 0; i < al.size(); i++) {
			String country = al.get(i).country;
			if(country.equals("Ind")) {
				System.out.println(al.get(i));
			}


		}



	}
}

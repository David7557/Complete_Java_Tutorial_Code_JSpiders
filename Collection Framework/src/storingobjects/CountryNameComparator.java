package storingobjects;

import java.util.Comparator;

public class CountryNameComparator implements Comparator<Country> {
	@Override
	public int compare(Country curC, Country exC) {
		return curC.name.compareTo(exC.name);
	}
}

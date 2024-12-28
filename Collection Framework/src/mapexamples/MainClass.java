package mapexamples;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MainClass {
	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(10, "Apple");
		map.put(20, "Sony");
		map.put(30, "Oneplus");
		
		
		// Traverse using for each loop
		
		Set<Integer> keys = map.keySet();
		
		for(int key: keys) {
			System.out.println(key+"--->"+map.get(key));
		}
	
	}
}

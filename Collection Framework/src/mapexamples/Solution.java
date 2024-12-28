package mapexamples;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		map.put("Tom", 21);
		map.put("Jerry", 20);
		
		Set<String> keys = map.keySet();
		
		for(String key: keys) {
			System.out.println(key+" is "+map.get(key)+" years old!");
		}
	}
}

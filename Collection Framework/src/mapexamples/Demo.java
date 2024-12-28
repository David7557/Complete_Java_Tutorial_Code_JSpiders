package mapexamples;

import java.util.HashMap;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
		Map map = new HashMap();

		map.put(10, "Java");
		map.put("python", 1.2);
		map.put(34.7, 55);

		System.out.println(map);//python=1.2, 10=Java, 34.7=55}
		System.out.println(map.size());//3
		System.out.println(map.get(10));//Java
		System.out.println(map.get(23));// if key is not present it returns null.
		System.out.println(map.containsKey(34.7));//true
		System.out.println(map.containsValue("java"));//false

		System.out.println("------------------");

		System.out.println(map);//{python=1.2, 10=Java, 34.7=55}
		map.remove(10);
		System.out.println(map);//{python=1.2, 34.7=55}

		System.out.println("-----------------");

		System.out.println(map.isEmpty());//false
		map.clear();
		System.out.println(map+" "+map.size());//{} 0
		System.out.println(map.isEmpty());//true
	}
}

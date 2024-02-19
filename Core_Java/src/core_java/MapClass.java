package core_java;

import java.util.HashMap;
import java.util.Map;

public class MapClass {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		
		map.put(15, "Kavin");
		map.put(28, "Jyo");
		map.put(34, "Pavi");
		map.put(42, "Harsith");
		System.out.println(map.keySet());
		
		System.out.println(map);
		
		for(int a : map.keySet()) {
			System.out.println(a + " : " + map.get(a));
		}

	}

}

package edu.java.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

public class HashMapTest {

	public static void main(String[] args) {
	
		Map<String, Integer>map=
				new HashMap<String,Integer>();
		map.put("사과",100);
		map.put("두리안",300);
		map.put("바나나",200);
		map.put("배",600);
//		map.remove("바나나");
		map.replace("바나나",150);
		map.replace("사과",1150);
		map.hashCode();

		Set keySet =map.keySet();
		Iterator it =keySet.iterator();
		
		
		
	
	}

}

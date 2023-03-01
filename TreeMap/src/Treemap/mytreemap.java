package Treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class mytreemap {
	public static void main(String[] args) {
		TreeMap<Integer,String>  myMap = new TreeMap<Integer,String>();
		myMap.put(100,"Aparna");
		myMap.put(200,"Supriya");
		myMap.put(300,"Sadhana");
		myMap.put(400,"Bindu");
		System.out.println(myMap.get(100));
		System.out.println(myMap);
		//For knowing the available elements in the map
		Set mySet = myMap.entrySet();
		System.out.println(mySet);
		
		Iterator it = mySet.iterator();
		while (it.hasNext()) {
			Map.Entry entry =  (Entry)it.next();
			System.out.println("Key is " + entry.getKey());
			
		}
	}

}

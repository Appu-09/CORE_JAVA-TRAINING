package Hashmap;

import java.util.HashMap;

public class myhashmap {
	public static void main (String [] args) {
		 
		int a =10;
		int b = 3;
		int c = 88;
		
		HashMap<String,Integer> Hello = new HashMap<String,Integer>();
		Hello.put("a", 10);
		Hello.put("b", 3);
		Hello.put("c", 88);
		
		System.out.println(Hello);
		System.out.println(Hello.get("c"));
	}
	

}

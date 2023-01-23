package myassignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Numbers1 {
	public static long getCount(String input,char a) {
	
		return input.chars().filter((ab)->ab==a).count();
	}
	public static void main(String[] args) {
		
		Map<Character,Long>counts = new HashMap<Character,Long>();
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		for(int i = 0 ; i < input.length(); i++) {
			counts.put(input.charAt(i),getCount(input,input.charAt(i)));
		
		}
		
		System.out.println(counts.toString());
		
		sc.close();
	}

}

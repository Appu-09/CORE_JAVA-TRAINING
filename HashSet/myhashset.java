package hashset;

import java.util.HashSet;

public class myhashset {
	public static void main(String args[]) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Java");
		hs.add("Python");
		hs.add("C");
		hs.add("C++");
		hs.add("MongoDB");
		hs.add("MySQL");
		hs.add(null);
		System.out.println(hs);
	}

}

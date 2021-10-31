// Java program to demonstrate
// the working of Map interface

import java.util.*;
class HashMapDemo {
	public static void main(String args[])
	{
		Map<String, Integer> hm
			= new HashMap<String, Integer>();

		hm.put("a", new Integer(100));
		hm.put("b", new Integer(200));
		hm.put("c", new Integer(300));
		hm.put("d", new Integer(400));

		// Traversing through the map
		for (Map.Entry<String, Integer> me : hm.entrySet()) {
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
		}
	}
}

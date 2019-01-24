package ch13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("Hello");
		set.add("World");
		set.add("!!!");
		set.add("Hello");

		Iterator<String> iterator = set.iterator();

		while (iterator.hasNext())
			System.out.println(iterator.next());

		System.out.println("---------------");
		
		
		set.remove("!!!");
		for (String string : set)
			System.out.println(string);

	}
}

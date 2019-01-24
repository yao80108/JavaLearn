package ch13;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		Comparator<String> comparator = new CustomComparator<String>();
		Set<String> set = new TreeSet<String>(comparator);

		set.add("justin");
		set.add("caterpillar");
		set.add("momor");

		for (String string : set)
			System.out.println(string);

	}
}

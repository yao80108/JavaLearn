package ch13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<String> list = new ArrayList<String>();

		System.out.println("輸入名稱(quit結束)");

		while (true) {
			String input = scanner.next();
			if (input.equals("quit"))
				break;
			list.add(input);
		}

		System.out.println("-------------------");
		for (String string : list)
			System.out.println(string);

		System.out.println("-------------------");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());
		scanner.close();
	}
}

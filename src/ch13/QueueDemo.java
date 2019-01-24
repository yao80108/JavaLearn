package ch13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Queue<String> queue = new LinkedList<String>();

		System.out.println("輸入名稱(quit結束)");

		while (true) {
			String input = scanner.next();
			if (input.equals("quit"))
				break;
			queue.offer(input);
		}

		String element = null;
		while ((element = queue.poll()) != null)
			System.out.println(element);

		scanner.close();
	}
}

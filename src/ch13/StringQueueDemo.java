package ch13;

import java.util.Scanner;

public class StringQueueDemo {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		StringQueue queue = new StringQueue();
		
		System.out.println("輸入名稱(quit結束)");

		while (true) {
			String input = scanner.next();
			if (input.equals("quit"))
				break;
			queue.put(input);
		}
		
		while(!queue.isEmpty())
			System.out.println(queue.get());
		
		scanner.close();
	}
}

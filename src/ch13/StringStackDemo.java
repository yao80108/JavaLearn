package ch13;

import java.util.Scanner;

public class StringStackDemo {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		StringStack stack = new StringStack();
		
		System.out.println("輸入名稱(quit結束)");

		while (true) {
			String input = scanner.next();
			if (input.equals("quit"))
				break;
			stack.push(input);
		}
		
		while(!stack.isEmpty())
			System.out.println(stack.pop());
		
		scanner.close();
	}
}

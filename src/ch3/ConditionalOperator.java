package ch3;

import java.util.Scanner;

public class ConditionalOperator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input Student Score:");
		int scoreOfStudent = scanner.nextInt();
		System.out.println("score >= 60?"+(scoreOfStudent >= 60 ? '是' : '否'));
		
		System.out.println("Input Number:");
		int number = scanner.nextInt();
		System.out.println("Is Odd?"+ + (number%2 != 0 ? '是' : '否'));
		scanner.close();
	}
}

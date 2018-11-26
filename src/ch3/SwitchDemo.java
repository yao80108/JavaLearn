package ch3;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("input score:");
		int score = scanner.nextInt();
		if (score >= 90)
			System.out.println("A");
		else if (score >= 80)
			System.out.println("B");
		else if (score >= 70)
			System.out.println("C");
		else if (score >= 60)
			System.out.println("D");
		else
			System.out.println("E");

		int level = (int) score / 10;
		switch (level) {
		case 10:
		case 9:
			System.out.println("A");
		case 8:
			System.out.println("B");
		case 7:
			System.out.println("C");
		case 6:
			System.out.println("D");
		default:
			System.out.println("E");
		}
		scanner.close();
	}
}

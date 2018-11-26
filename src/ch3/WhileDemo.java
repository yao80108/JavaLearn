package ch3;

import java.util.Scanner;

public class WhileDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		int sum = 0;
		int count = -1;

		while (score != -1) {
			count++;
			sum += score;
			System.out.print("input score(input -1 end):");
			score = scanner.nextInt();
		}
		System.out.println("avg:" + (double) sum / count);

		int input = 0;
		int replay = 0;
		do {
			System.out.print("input int: ");
			input = scanner.nextInt();
			System.out.println("input is odd?" + ((input % 2 == 1) ? 'Y' : 'N'));
			System.out.print("input 0 end,1 continue:");
			replay = scanner.nextInt();
		} while (replay == 1);
		
		scanner.close();
	}
}

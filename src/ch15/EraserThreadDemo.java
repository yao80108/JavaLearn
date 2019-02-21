package ch15;

import java.util.Scanner;

public class EraserThreadDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Input name");
			String name = scanner.next();

			System.out.println("Input password");

            EraserThread eraserThread = new EraserThread('#');
            eraserThread.start();
            String password = scanner.next();
            eraserThread.setActive(false);

			if ("abc".equals(name) && "123456".equals(password)) {
				System.out.println("Welcome");
				break;
			} else {
				System.out.printf("%s name or password error%n", name);
			}
		}
	}
}

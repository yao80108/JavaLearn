package ch15;

import java.util.Scanner;

public class EraserDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("input name:");
			String name = scanner.next();

			System.out.println("input password");

			Eraser eraser = new Eraser('#');

			Thread eraserThread = new Thread(eraser);
			eraserThread.start();
			String password = scanner.next();
			eraser.setActive(false);

			if ("abc".equals(name) && "123456".equals(password))
				break;
			else
				System.out.println("name or password error!");
		}
		System.out.println("Welcome");
	}
}

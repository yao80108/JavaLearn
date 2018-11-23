package ch3;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入你的名字:");
		System.out.printf("Hello %s%n", scanner.nextLine());

		System.out.print("請輸入一個數字:");
		System.out.printf("你輸入了  %d", scanner.nextInt());

		scanner.close();
	}
}

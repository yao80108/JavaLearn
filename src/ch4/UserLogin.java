package ch4;

import java.util.Scanner;

public class UserLogin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("UserName:");
		String username = scanner.next();

		System.out.print("Password:");
		String password = scanner.next();

		if ("9527".equals(password))
			System.out.println("Hello " + username);
		else
			System.out.println("password error");
		
		scanner.close();
	}
}

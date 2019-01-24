package ch10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExceptionDemo {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("請輸入整數: ");
			int input = Integer.parseInt(reader.readLine());
			System.out.println("input x 10 = " + (input * 10));
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}

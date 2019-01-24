package ch14;

import java.io.*;

public class StreamDemo {
	public static void main(String[] args) {
		try {
			System.out.println("輸入字元:");
			System.out.println(System.in.read());
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

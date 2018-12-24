package ch6;

import java.io.*;

public class UseRegularExpression {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("abcededfabcbbcafd".replaceAll(".bc", "###"));

		String phoneEL = "[0-9]{10}";
		String urlEL = "<a.+href*=*['\"]?.*?['\"]?.*?>";
		String emailEL = "^[_a-z0-9-]+(.[_a-z0-9-]+)*" + "@[a-z0-9-]+([.][a-z0-9-]+)*$";

		System.out.print("phone number:");

		String input = reader.readLine();

		if (input.matches(phoneEL))
			System.out.println("OK");
		else
			System.out.println("error");

		System.out.print("href tag:");
		input = reader.readLine();

		if (input.matches(urlEL))
			System.out.println("OK");
		else
			System.out.println("error");

		System.out.print("email:");
		input = reader.readLine();
		if (input.matches(emailEL))
			System.out.println("OK");
		else
			System.out.println("error");
	}
}

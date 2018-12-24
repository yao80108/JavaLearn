package ch8;

public class ToStringDemo {
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < 10; i++)
			stringBuilder.append(i);

		System.out.println(stringBuilder.toString());
	}
}

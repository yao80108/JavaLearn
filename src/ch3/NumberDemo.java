package ch3;

public class NumberDemo {
	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(19));
		System.out.println(Integer.toHexString(19));
		System.out.println(Integer.toOctalString(19));

		System.out.printf("%d%n", 19);
		System.out.printf("%o%n", 19);
		System.out.printf("%x%n", 19);
	}
}

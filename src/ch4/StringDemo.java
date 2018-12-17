package ch4;

public class StringDemo {
	public static void main(String[] args) {
		String text = "Have a good day!!";
		
		System.out.println(text);
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		System.out.println(text.length());
		System.out.println(text.replaceAll("good", "nice"));
		System.out.println(text.substring(5));
	}
}

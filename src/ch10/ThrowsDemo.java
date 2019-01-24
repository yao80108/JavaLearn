package ch10;

public class ThrowsDemo {
	public static void main(String[] args) {
		try {
			throwsTest();
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	private static void throwsTest()throws ArithmeticException{
		System.out.println("Test");
		throw new ArithmeticException();
	}
}

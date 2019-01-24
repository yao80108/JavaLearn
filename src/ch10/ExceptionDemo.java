package ch10;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			throw new ArithmeticException();
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}

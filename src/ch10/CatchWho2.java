package ch10;

public class CatchWho2 {
	public static void main(String[] args) {
		try {
			try {
				throw new ArrayIndexOutOfBoundsException();
			} catch (ArithmeticException  e) {
				// TODO: handle exception
				System.out.println("ArithmeticException  內層");
			}
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("ArithmeticException 外層");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 外層");
		}
	}
}

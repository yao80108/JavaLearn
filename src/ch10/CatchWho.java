package ch10;

public class CatchWho {
	public static void main(String[] args) {
		try {
			try {
				throw new ArrayIndexOutOfBoundsException();
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println("ArrayIndexOutOfBoundsException 內層");
			}
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("ArithmeticException");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 外層");
		}
	}
}

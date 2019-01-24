package ch10;

public class CheckArgsDemo {
	public static void main(String[] args) {
		try {
			System.out.println(args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("沒有指定引數");
			e.printStackTrace();
		}
	}
}

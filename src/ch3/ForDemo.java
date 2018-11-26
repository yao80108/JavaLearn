package ch3;

public class ForDemo {
	public static void main(String[] args) {
		back: {
			for (int i = 0; i < 10; i++) {
				if (i == 9) {
					System.out.println("break");
					break back;
				}
			}
			System.out.println("test");
		}
		back1: for (int i = 0; i < 10; i++) {
			back2: for (int j = 0; j < 10; j++) {
				if (j == 9) {
					continue back1;
				}
			}
			System.out.println("test");
		}
	}
}

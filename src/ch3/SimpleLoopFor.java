package ch3;

public class SimpleLoopFor {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			System.out.println(i);

		for (int j = 1; j < 10; j++) {
			for (int i = 2; i < 10; i++)
				System.out.printf("%d * %d = %2d ", i, j, i * j);
			System.out.println();
		}

		for (int i = 2, j = 1; j < 10; i = (i == 9) ? ((++j / j) + 1) : (i + 1))
			System.out.printf("%d * %d = %2d%c", i, j, i * j, (i == 9 ? '\n' : ' '));
	}
}

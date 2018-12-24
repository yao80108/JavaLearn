package ch7;

import java.util.Random;

public class UseRecursion {
	public static void main(String[] args) {
		Random random = new Random();
		int m = random.nextInt(999);
		int n = random.nextInt(999);

		System.out.printf("%4d %4d %4d", m, n, gcd(m,n));
	
	}

	private static int gcd(int m, int n) {
		if (n == 0)
			return m;
		else
			return gcd(n, m % n);
	}
}

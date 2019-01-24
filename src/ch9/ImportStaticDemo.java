package ch9;

import static java.lang.System.out;
import static java.util.Arrays.sort;

public class ImportStaticDemo {
	public static void main(String[] args) {
		int[] arr = { 161, 16, 56, 1, 16, 1631, 61 };

		sort(arr);

		for (int i : arr)
			out.print(i + " ");
	}
}

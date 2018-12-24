package ch7;

public class SafeArray {
	private int[] arr;

	public SafeArray() {
		this(10);
	}

	public SafeArray(int length) {
		arr = new int[length];
	}

	public void showElement() {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public int getElement(int i) {
		if (i >= arr.length || i < 0) {
			System.err.println("index error");
			return 0;
		}
		return arr[i];
	}

	public int getLength() {
		return arr.length;
	}

	public void setElement(int i, int data) {
		if (i >= arr.length || i < 0) {
			System.err.println("index error");
			return;
		}
		arr[i] = data;
	}
}

package ch7;

public class SafeArrayDemo {
	public static void main(String[] args) {
		SafeArray arr1 = new SafeArray();

		SafeArray arr2 = new SafeArray(5);

		for (int i = 0; i < arr1.getLength(); i++)
			arr1.setElement(i, (i + 1) * 10);
		for (int i = 0; i < arr2.getLength(); i++)
			arr2.setElement(i, (i + 1) * 10);

		System.out.print("arr1: ");
		arr1.showElement();

		System.out.print("\narr2: ");
		arr2.showElement();
	}
}

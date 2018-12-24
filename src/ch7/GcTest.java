package ch7;

public class GcTest {
	private String name;

	public GcTest(String name) {
		this.name = name;
		System.out.println(name + "建立");
	}

	protected void finalize() {
		System.out.println(name + "被回收");
	}
}

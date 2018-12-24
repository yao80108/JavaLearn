package ch8;

public class SimpleCollection {
	private Object[] objects;
	private int index = 0;

	public SimpleCollection() {
		objects = new Object[10];
	}

	public SimpleCollection(int cappacity) {
		objects = new Object[cappacity];
	}

	public void add(Object object) {
		objects[index] = object;
		index++;
	}

	public int getLength() {
		return index;
	}

	public Object get(int i) {
		return objects[i];
	}
}

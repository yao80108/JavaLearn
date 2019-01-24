package ch12;

public class GenericFoo3<T> {
	private T[] fooArray;

	public T[] getFooArray() {
		return fooArray;
	}

	public void setFooArray(T[] fooArray) {
		this.fooArray = fooArray;
	}

}

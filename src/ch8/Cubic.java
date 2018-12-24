package ch8;

public class Cubic extends Rectangle {
	protected int z, length;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Cubic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cubic(int x, int y, int width, int height, int z, int length) {
		super(x, y, width, height);
		this.z = z;
		this.length = length;
	}

	public int getVolumn() {
		return length * width * height;
	}

}

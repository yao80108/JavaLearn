package ch8;

public class HollowCircle extends AbstractCircle {
	public HollowCircle() {
		// TODO Auto-generated constructor stub
	}

	public HollowCircle(double radius) {
		this.radius = radius;
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		System.out.printf("%f\n", getRadius());
	}

}
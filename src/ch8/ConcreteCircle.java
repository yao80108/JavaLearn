package ch8;

public class ConcreteCircle extends AbstractCircle {
	public ConcreteCircle() {
		// TODO Auto-generated constructor stub
	}

	public ConcreteCircle(double radius) {
		this.radius = radius;
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		System.out.printf("%f\n", getRadius());
	}

}

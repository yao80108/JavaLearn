package ch8;

public class CircleDemo {
	public static void main(String[] args) {
		renderCircle(new ConcreteCircle(3.33));
		renderCircle(new HollowCircle(10.33));
	}

	public static void renderCircle(AbstractCircle circle) {
		circle.render();
	}
}

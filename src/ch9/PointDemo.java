package ch9;

public class PointDemo {
	private class Point {
		private int x, y;

		public Point() {

		}

		public void setPoint(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}
	}

	private Point[] points;

	public PointDemo(int length) {
		points = new Point[length];

		for (int i = 0; i < points.length; i++) {
			points[i] = new Point();
			points[i].setPoint(i * 3, i * 5);
		}
	}

	public void showPoint() {
		for (int i = 0; i < points.length; i++) {
			System.out.printf("Point[%d]: x = %d, y = %d%n", i, points[i].getX(), points[i].getY());
		}
	}
}

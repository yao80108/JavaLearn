package ch8;

public class Table implements Cloneable {
	private Point center;

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public Object clone() throws CloneNotSupportedException {
		Table table = (Table) super.clone();
		if (this.center != null) {
			table.center = (Point) center.clone();
		}
		return table;
	}

}

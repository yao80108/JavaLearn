package ch8;

import java.util.Date;

public class Cat {
	private String name;
	private Date birthdy;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthdy() {
		return birthdy;
	}

	public void setBirthdy(Date birthdy) {
		this.birthdy = birthdy;
	}

	public Cat() {

	}

	public boolean equals(Object other) {
		if (this == other)
			return true;
		if (!(other instanceof Cat))
			return false;
		final Cat cat = (Cat) other;

		if (!getName().equals(cat.getName()))
			return false;
		if (!getBirthdy().equals(cat.getBirthdy()))
			return false;
		return true;
	}

	public int hashCode() {
		int result = getName().hashCode();
		result = 29 * result + getBirthdy().hashCode();
		return result;
	}
}

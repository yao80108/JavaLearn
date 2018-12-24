package ch8;

public class Bird {
	private String name;

	public Bird() {

	}

	public Bird(String name) {
		this.name = name;
	}
	
	public void walk() {
		System.out.println("walk");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

package ch8;

public class Chicken extends Bird {
	private String crest;

	public Chicken() {
		super();
	}

	public Chicken(String name, String crest) {
		super(name);
		this.crest = crest;
	}

	public void setCrest(String crest) {
		this.crest = crest;
	}

	public String getCrest() {
		return crest;
	}

	public void wu() {
		System.out.println("wuwu");
	}
}

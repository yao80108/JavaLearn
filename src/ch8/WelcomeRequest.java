package ch8;

public class WelcomeRequest implements IRequest {
	private String place;

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.printf("Welcome %s!%n", place);
	}

	public WelcomeRequest(String place) {
		super();
		this.place = place;
	}

}

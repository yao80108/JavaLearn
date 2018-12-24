package ch8;

public class HelloRequest implements IRequest {
	private String name;

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.printf("Hello %s!%n", name);
	}

	public HelloRequest(String name) {
		super();
		this.name = name;
	}

}

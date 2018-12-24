package ch8;

public class RequestDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
			int n = (int) (Math.random() * 10) % 2;
			switch (n) {
			case 0:
				doRequest(new HelloRequest("Java"));
				break;
			case 1:
				doRequest(new WelcomeRequest("Wiki"));
				break;
			}
		}
	}

	public static void doRequest(IRequest request) {
		request.execute();
	}
}

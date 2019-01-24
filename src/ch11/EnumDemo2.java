package ch11;

public class EnumDemo2 {
	private enum InnerAction {
		TURN_LEFT, TURN_RIGHT, SHOOT
	};

	public static void main(String[] args) {
		doAction(InnerAction.SHOOT);
	}

	public static void doAction(InnerAction action) {
		switch (action) {
		case TURN_LEFT:
			System.out.println("TURN_LEFT");
			break;
		case TURN_RIGHT:
			System.out.println("TURN_RIGHT");
			break;
		case SHOOT:
			System.out.println("SHOOT");
			break;
		}
	}
}

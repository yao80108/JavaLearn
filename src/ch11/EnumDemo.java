package ch11;

public class EnumDemo {
	public static void main(String[] args) {
		doAction(Action.TURN_LEFT);
		
		doAction(ActionConstants.TURN_LEFT);
	}
	
	public static void doAction(Action action) {
		switch(action) {
		case TURN_LEFT:
			System.out.println("向左轉");
			break;
		case TURN_RIGHT:
			System.out.println("向右轉");
			break;
		case SHOOT:
			System.out.println("SHOOT");
			break;
		}
	}
	
	public static void doAction(int action) {
		switch(action) {
		case ActionConstants.TURN_LEFT:
			System.out.println("向左轉");
			break;
		case ActionConstants.TURN_RIGHT:
			System.out.println("向右轉");
			break;
		case ActionConstants.SHOOT:
			System.out.println("SHOOT");
			break;			
		}
	}
}

package ch11;

public class ShowEnum {
	public static void main(String[] args) {
		for (Action action : Action.values())
			System.out.println(action.toString());
		
		for (Action action : Action.values())
			System.out.println(action);		
	}
}

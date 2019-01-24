package ch11;

public class EnumINdex {
	public static void main(String[] args) {
		for (Action action : Action.values())
			System.out.printf("%d %s%n", action.ordinal(), action);
	}
}

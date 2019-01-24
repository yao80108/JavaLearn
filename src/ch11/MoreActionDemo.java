package ch11;

public class MoreActionDemo {
	public static void main(String[] args) {
		for (MoreAction action : MoreAction.values())
			System.out.printf("%s：%s%n", action, action.getDescription());
		for (MoreAction2 action : MoreAction2.values())
			System.out.printf("%s：%s%n", action, action.getDescription());
		for (DetailAction2 action : DetailAction2.values())
			System.out.printf("%s：%s%n", action, action.getDescription());
		for (DetailAction3 action : DetailAction3.values())
			System.out.printf("%s：%s%n", action, action.getDescription());
	}
}

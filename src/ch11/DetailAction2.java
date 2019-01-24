package ch11;

public enum DetailAction2 {
	TURN_LEFT("向左轉"), TURN_RIGHT("向右轉"), SHOOT("射擊");
	
	private String decription;

	private DetailAction2(String decription) {
		this.decription = decription;
	}

	public String getDescription() {
		return decription;
	}
}

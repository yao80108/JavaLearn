package ch11;

public enum DetailAction3 implements IDescription {
	TURN_LEFT("向左轉"), TURN_RIGHT("向右轉"), SHOOT("射擊");

	private String descroption;

	private DetailAction3(String descroption) {
		this.descroption = descroption;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return descroption;
	}
}

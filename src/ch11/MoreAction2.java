package ch11;

public enum MoreAction2 {
	TURN_LEFT {
		@Override
		public String getDescription() {
			// TODO Auto-generated method stub
			return "向左轉";
		}
	},
	TURN_RIGHT {
		@Override
		public String getDescription() {
			// TODO Auto-generated method stub
			return "向右轉";
		}
	},
	SHOOT {
		@Override
		public String getDescription() {
			// TODO Auto-generated method stub
			return "射擊";
		}
	};

	public abstract String getDescription();
}

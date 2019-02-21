package ch15;

public class EraserThread extends Thread {
	private boolean active;
	private String mask;

	public EraserThread() {
		this('*');
	}

	public EraserThread(char maskChar) {
		active = true;
		mask = "\010" + maskChar;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isActive() {
		return active;
	}

	public void run() {
		while (isActive()) {
			System.out.print(mask);
			try {

				Thread.currentThread().sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
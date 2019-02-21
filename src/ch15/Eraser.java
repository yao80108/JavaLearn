package ch15;

public class Eraser implements Runnable {
	private boolean active;
	private String mask;

	public Eraser() {
		this('*');
	}

	public Eraser(char maskChar) {
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
			System.out.println(mask);
			try {
				Thread.currentThread().sleep(50);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}

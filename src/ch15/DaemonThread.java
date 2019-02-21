package ch15;

public class DaemonThread {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			public void run() {
				while (true)
					System.out.println("T");
			}
		});
		thread.setDaemon(true);
		thread.start();
	}
}

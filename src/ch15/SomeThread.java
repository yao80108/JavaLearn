package ch15;

public class SomeThread implements Runnable {
	public void run() {
		System.out.println("sleep to blocked sts");
		while (true) {
			try {
				Thread.sleep(9999);
			} catch (InterruptedException e) {
				System.out.println("I'm interrupted");
			}
		}
	}

	public static void main(String[] args) {
		Thread thread = new Thread(new SomeThread());
		thread.start();
		thread.interrupt();
	}
}

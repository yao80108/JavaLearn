package ch15;

public class InterruptDemo {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(99999);
				} catch (InterruptedException e) {
					// TODO: handle exception
					System.out.println("I'm interupted!!");
				}
			}
		});
		thread.start();
		thread.interrupt();
	}
}

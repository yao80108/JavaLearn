package ch15;

public class ThreadA {
	public static void main(String[] args) {
		System.out.println("Thread A run");

		Thread threadB = new Thread(new Runnable() {
			public void run() {
				try {
					System.out.println("Thread B start");
					for (int i = 0; i < 5; i++) {
						Thread.sleep(1000);
						System.out.println("Thread B run");
					}
					System.out.println("Thread B End");
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		});

		threadB.start();
		try {
			threadB.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Thread A run");
	}
}

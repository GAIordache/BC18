package thread3;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Thread th = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread-ul " + Thread.currentThread().getName());
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		th.setName("Secondary thread");

		th.start();
		System.out.println("Waiting for the other thread to finish");
		System.out.println("Alive?:" + th.isAlive());
		th.join();
		System.out.println("Alive?:" + th.isAlive());

		System.out.println("Done Waiting for the other thread to finish");
		//th.start();
	}

}

package thread1;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Thread th = new Thread() {
			public void run() {
				System.out.println("Sunt in Threadul ala nou");
				while(true) {
					System.out.println("Still alive");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		th.setDaemon(true);
		th.start();
		Thread th1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
		Thread th2 = new Thread(() -> System.out.println("Bau"));
		th2.start();
		Thread.currentThread().setName("PUFFFFFFFFFFIIIII");
		System.out.println("In thread principal");
		Thread.sleep(5000);
		throw new RuntimeException("Main thread dying");
		
	}

}

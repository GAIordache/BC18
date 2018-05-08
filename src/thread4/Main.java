package thread4;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
	//static  int[] contor = new int[1];
	static AtomicInteger contor = new AtomicInteger(0);
	static Object lock = new Object();

	public static void main(String[] args) throws InterruptedException {
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i < 10000;i++) {
					//synchronized (lock) {
						contor.incrementAndGet();
					//}
				}
				//System.out.println("Thread:" + Thread.currentThread().getName() + " " + contor[0]);
			}
		};
		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		th1.start();
		th2.start();
		th1.join();
		th2.join();
		System.out.println(contor.get());
	}

}

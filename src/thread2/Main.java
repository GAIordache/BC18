package thread2;

public class Main {
	public static void main(String[] pValue) {
		new Thread(() -> {
			while (true) {
				System.out.println("Bau");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		new Thread(() -> {
			while (true) {
				System.out.println("Pa");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();		
		System.out.println("Here");
	}
}

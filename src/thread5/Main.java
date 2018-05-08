package thread5;

public class Main {
	static long longVal = 0;
	static long v1 = 0x0000000100000002L;
	static long v2 = 0x1000000120000002L;


	public static void main(String[] args) {
		Thread th1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				boolean flip = false;
				while(true) {
					if(flip) {
						longVal = v1;
					} else {
						longVal = v2;
					}
					flip = !flip;
				}

			}
		});
		th1.start();
		Thread th2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					long x = longVal;
					if(x != v1 && x != v2) {
						throw new RuntimeException("Problem");
					}
				}
				
			}
		});
		th2.start();
	}

}

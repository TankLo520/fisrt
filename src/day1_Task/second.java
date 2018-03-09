package day1_Task;

public class second {
	public static void main(String[] args) {
//		Runnable run = new Runnable() {
//			
//			@Override
//			public void run() {
//				for (int i = 0; i < 100; i++) {
//					if (i%2==0) {
//						System.out.println(i);
//					}
//				}
//			}
//		};
//		Thread t1 = new Thread(run);
//		t1.start();
		
		Thread tt = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					if (i%2==0) {
						System.out.println(i);
					}
				}
			}
		});
		
		tt.start();
		
	}
}

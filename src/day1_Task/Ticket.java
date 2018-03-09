package day1_Task;

/**
 * public class Ticket extends Thread { int ticket = 100;
 * 
 * @Override public void run() { synchronized (this) { while (true) { try {
 *           Thread.sleep(100); } catch (InterruptedException e) {
 *           e.printStackTrace(); } if (ticket > 0) {
 *           System.out.println(Thread.currentThread().getName() + "还剩:" +
 *           ticket--); } } } } }
 **/

public class Ticket {
	public static void main(String[] args) {
		Runnable run1 = new Runnable() {
			int ticket = 100;

			@Override
			public void run() {

				while (true) {
					synchronized (this) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						if (ticket > 0) {
							System.out.println(Thread.currentThread().getName() + "还剩:" + ticket--);
						}
					}
				}
			}
		};
		Thread t1 = new Thread(run1, "窗口1");
		t1.start();
		Thread t2 = new Thread(run1, "窗口2");
		t2.start();
		Thread t3 = new Thread(run1, "窗口3");
		t3.start();
	}
}
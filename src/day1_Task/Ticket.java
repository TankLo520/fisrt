package day1_Task;

/**
 * public class Ticket extends Thread { int ticket = 100;
 * 
 * @Override public void run() { synchronized (this) { while (true) { try {
 *           Thread.sleep(100); } catch (InterruptedException e) {
 *           e.printStackTrace(); } if (ticket > 0) {
 *           System.out.println(Thread.currentThread().getName() + "��ʣ:" +
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
							System.out.println(Thread.currentThread().getName() + "��ʣ:" + ticket--);
						}
					}
				}
			}
		};
		Thread t1 = new Thread(run1, "����1");
		t1.start();
		Thread t2 = new Thread(run1, "����2");
		t2.start();
		Thread t3 = new Thread(run1, "����3");
		t3.start();
	}
}
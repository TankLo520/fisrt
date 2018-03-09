package day1_Task;

//public class Ticket1 implements Runnable {
public class Ticket1 extends Thread {
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
					System.out.println(Thread.currentThread().getName() + "»¹Ê£:" + ticket--);
				}
			}
		}
	}
}

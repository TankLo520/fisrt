package day1_Thread;

public class TicketThread implements Runnable {
	static int ticket = 100;
	Object obj = new Object();
	@Override
	public void run() {
		while(true){
//			synchronized (obj) {
//				if(ticket > 0){
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					System.out.println(Thread.currentThread().getName() + ":" + ticket--);
//				}
//			}
//			synchronized (obj) {
//				method();
//			}
			method();
			
		}
	}
	
	public synchronized void method(){
		if(ticket > 0){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ":" + ticket--);
		}
	}
	
	public static synchronized void method2(){
		if(ticket > 0){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ":" + ticket--);
		}
	}
}

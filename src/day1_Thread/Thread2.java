package day1_Thread;

public class Thread2 implements Runnable {
	int num;
	
	public Thread2(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":"  + i + "...." + num);
		}
	}
	
	public static void main(String[] args) {
		//第一种，用一种。参数共用
			Thread2 th1 = new Thread2(100);
			Thread t1 = new Thread(th1);
			t1.start();
			
			Thread t2 = new Thread(th1);
			t2.start();
	
		}

}

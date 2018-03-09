package day1_Thread;

public class MyThread extends Thread {
	@Override
	public void run() {
		for(int i = 0; i <= 100; i++){
			System.out.println(getName() + ":" + i);
		}
//		MyThread myt = new MyThread();
	}
	public static void main(String[] args) {
		MyThread mt1 = new MyThread();
		mt1.setName("最最");
		mt1.start();
		
		MyThread mt2 = new MyThread();
		mt2.setName("込込*************");
		mt2.start();		
	}
}

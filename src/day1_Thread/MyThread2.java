package day1_Thread;

public class MyThread2 {

	public static void main(String[] args) {
		MyThread mt1 = new MyThread();
		mt1.setName("最最");
		mt1.start();
		
		MyThread mt2 = new MyThread();
		mt2.setName("込込*************");
		mt2.start();		
	}

}

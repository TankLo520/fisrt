package day1_Thread;

public class MyThread2 {

	public static void main(String[] args) {
		MyThread mt1 = new MyThread();
		mt1.setName("�Ǻ�");
		mt1.start();
		
		MyThread mt2 = new MyThread();
		mt2.setName("����*************");
		mt2.start();		
	}

}

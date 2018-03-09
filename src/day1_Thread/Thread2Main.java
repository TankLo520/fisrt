package day1_Thread;

public class Thread2Main {
	public static void main(String[] args) {
	//第一种，用一种。参数共用
		Thread2 th1 = new Thread2(100);
		Thread t1 = new Thread(th1);
		t1.start();
		
		Thread t2 = new Thread(th1);
		t2.start();
	}
	//第二种，创建两个对象，分别用不同的参数
	public void method(){
		Thread2 th1 = new Thread2(100);
		Thread t1 = new Thread(th1);
		t1.start();
		
		Thread2 th2 = new Thread2(200);
		Thread t2 = new Thread(th2);
		t2.start();
	}
}

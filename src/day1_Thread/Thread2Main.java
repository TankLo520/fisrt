package day1_Thread;

public class Thread2Main {
	public static void main(String[] args) {
	//��һ�֣���һ�֡���������
		Thread2 th1 = new Thread2(100);
		Thread t1 = new Thread(th1);
		t1.start();
		
		Thread t2 = new Thread(th1);
		t2.start();
	}
	//�ڶ��֣������������󣬷ֱ��ò�ͬ�Ĳ���
	public void method(){
		Thread2 th1 = new Thread2(100);
		Thread t1 = new Thread(th1);
		t1.start();
		
		Thread2 th2 = new Thread2(200);
		Thread t2 = new Thread(th2);
		t2.start();
	}
}

package day1_Task;

public class four {
	
	public static void main(String[] args) {
		Ticket1 tt = new Ticket1();
		Thread t1 = new Thread(tt,"����1");
		t1.start();
		Thread t2 = new Thread(tt,"����2");
		t2.start();
		Thread t3 = new Thread(tt,"����3");
		t3.start();
	}
}

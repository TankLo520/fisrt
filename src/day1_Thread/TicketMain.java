package day1_Thread;

public class TicketMain {

	public static void main(String[] args) {
		TicketThread tt = new TicketThread();
		
		Thread t1 = new Thread(tt);
		t1.setName("´°¿Ú1");
		t1.start();
		
		Thread t2 = new Thread(tt);
		t2.setName("´°¿Ú2");
		t2.start();
		
		Thread t3 = new Thread(tt);
		t3.setName("´°¿Ú3");
		t3.start();
		
	}

}

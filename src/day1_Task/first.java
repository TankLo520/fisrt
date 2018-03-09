package day1_Task;

public class first {
	public static void main(String[] args) {
		new Thread(){
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("hello world");
				}
			}
		}.start();
	}
}

package day1_Thread;

public class InnerThread {
	public static void main(String[] args) {
		//第一种
		new Thread(){
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("aaaaa");
				}
			}
		}.start();
		//第二种
	   Runnable run = new Runnable() {
		
		@Override
		public void run() {
			for (int i = 0; i <100; i++) {
				System.out.println("bbbbbb");
			}
		}
	};
		new Thread(run).start();
		//第三种
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("ccccccc");
				}
			}
		}).start();
	}
}

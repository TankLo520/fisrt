package day1_Thread;

public class InnerThread {
	public static void main(String[] args) {
		//��һ��
		new Thread(){
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("aaaaa");
				}
			}
		}.start();
		//�ڶ���
	   Runnable run = new Runnable() {
		
		@Override
		public void run() {
			for (int i = 0; i <100; i++) {
				System.out.println("bbbbbb");
			}
		}
	};
		new Thread(run).start();
		//������
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

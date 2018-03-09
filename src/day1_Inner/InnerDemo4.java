package day1_Inner;

public class InnerDemo4 {
	public static void main(String[] args) {
//		method(new Dog());
//		method(new Cat());
		
		method(new Animal() {
			
			@Override
			public void eat() {
				System.out.println("��");
			}
		});
		
		method(new Animal() {
			
			@Override
			public void eat() {
				System.out.println("è");
			}
		});
	}
	
	public static void method(Animal a){
		a.eat();
	}
}

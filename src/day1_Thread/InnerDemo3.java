package day1_Thread;

public class InnerDemo3 {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.method();
	}
}

interface Inner1{
	public void function();
}

class Outer2{
	public void method(){
//		new Inner1(){
//			@Override
//			public void function() {
//				System.out.println("function111");
//			}
//		}.function();
		
		Inner1 i = new Inner1(){
			@Override
			public void function() {
				System.out.println("function111");
			}
		};
		
		i.function();
		i.function();
	}
	
}

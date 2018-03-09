package day1_Thread;

public class InnerDemo2 {
	public static void main(String[] args) {
		Outer1 out = new Outer1();
		out.method();
	}
}

class Outer1{
	public void method(){
		
		class Inner{
			public void function(){
				System.out.println("局部内部类");
			}
		}
		
		Inner in = new Inner();
		in.function();
	}
}

package day1_Thread;

public class InnerClass {

	public static void main(String[] args) {
//		Outer out = new Outer();
//		out.method();
//		Outer.Inner in = new Outer().new Inner();
//		in.function();
		
//		Outer.Inner in = new Outer.Inner();
//		in.function();
		
		Outer.Inner.function();
	}
	
	
}
class Outer{
	private static int num = 10;
	public void method(){
		Inner in = new Inner();
		in.function();
	}
	
	static class Inner{
		public static  void function(){
			System.out.println(num);
		}
	}
}
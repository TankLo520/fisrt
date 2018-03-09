package day3_Reflect;

import java.io.Serializable;

public class Student2 implements Serializable {
	private String name;
	public int age;
	
	public Student2() {
	}

	public Student2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	public void method(){
		System.out.println("fsdfsdf");
	}
	
	private int fuck(int a,int b){
//		System.out.println("fuck you !!!");
		return a+b;
	}
	
}

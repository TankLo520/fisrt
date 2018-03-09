

package day3_Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflect_Demo1 {
	public static void main(String[] args) throws ReflectiveOperationException {
//		Class clazz =  Class.forName("day3_Reflect.Student");
		//无参
//		Constructor con = clazz.getConstructor();
//		Object obj = con.newInstance();
//		System.out.println(con);
//		System.out.println(obj);
		
//		Constructor con0 = clazz.getConstructor();
//		Object obj0 = con0.newInstance();
//		System.out.println(obj0);
		
//		Object stu = clazz.newInstance();
//		
//		Field f = clazz.getField("age");
//		f.set(stu, 30);
//		Object age = f.get(stu);
//		System.out.println(age);
		
		Class clazz = Class.forName("day3_Reflect.Student");
		
		//成员变量的获取
		
//		Object stu = clazz.newInstance();
//		
//		Field f = clazz.getField("age");
//		f.set(stu, 666);
//		Object age = f.get(stu);
//		System.out.println(age);
		
//		Constructor con = clazz.getConstructor(String.class,int.class);
//		Object obj = con.newInstance("fsdfas",30);
//		System.out.println(obj);
		
		Object stu = clazz.newInstance();
		//无参
//		Method mm = clazz.getMethod("method");
//		mm.invoke(stu);
//		System.out.println(mm);
		//获取有参
//		Method mm = clazz.getMethod("setAge", int.class);
//		mm.invoke(stu, 100);
//		System.out.println(stu);
		//获取私有方法
//		Method mm = clazz.getDeclaredMethod("setAge", int.class);
//		mm.setAccessible(true);
//		mm.invoke(stu, 100);
//		System.out.println(stu);
		
//		Method mm = clazz.getDeclaredMethod("fuck");
//		mm.setAccessible(true);
//		mm.invoke(stu);
		
		Method mm =	clazz.getDeclaredMethod("fuck",int.class,int.class);
		mm.setAccessible(true);
		int m = (int) mm.invoke(stu, 1,2);
		System.out.println(m);
//		System.out.println(stu);
		
		
		
		
		
	}
}

package day3_Reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Reflect_fanxing {
	public static void main(String[] args) throws ReflectiveOperationException {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1212);
		list.add(1233);
		
		Class clazz = Class.forName("java.util.ArrayList");
		Method mm = clazz.getMethod("add", Object.class);
		
		mm.invoke(list, "fsdfa");
		System.out.println(list);
	}
}

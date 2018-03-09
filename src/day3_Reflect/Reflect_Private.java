package day3_Reflect;

import java.lang.reflect.Field;

public class Reflect_Private {
	public static void main(String[] args) throws ReflectiveOperationException {
		Class clazz = Class.forName("day3_Reflect.Student");
		Object stu = clazz.newInstance();
		Field f = clazz.getDeclaredField("name");
		f.setAccessible(true);
		f.set(stu, "maronng");
		Object name = f.get(stu);
		System.out.println(name);
	}
}

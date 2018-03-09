package day3_Reflect;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import org.apache.commons.beanutils.BeanUtils;

public class Bean_Demo {

	public static void main(String[] args) throws ReflectiveOperationException {
		Student2 stu = new Student2();
		
		BeanUtils.setProperty(stu, "name", "xian");
		String name = BeanUtils.getProperty(stu, "name");
		System.out.println(name);
//		demo();
	}

	private static void demo() throws IllegalAccessException, InvocationTargetException {
		Student2 stu = new Student2();
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("name", "lbx");
		map.put("age", 100);
		
		BeanUtils.populate(stu,map);
//		int age = stu.getAge();
		System.out.println(stu);
	}

}

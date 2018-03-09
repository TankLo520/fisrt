package day3_Bean;

import java.util.HashMap;
import java.util.Map;

public class MyBeanDemo {

	public static void main(String[] args) throws ReflectiveOperationException {
//		test();
		Student2 stu = new Student2();
		Map map = new HashMap();
		map.put("name", "lxxxx");
		map.put("age", 1000);
		map.put("fsa", "fdsfs");
		MyBean.populate1(stu, map);
		System.out.println(stu);
	}

	private static void test() throws ReflectiveOperationException {
		Student2 stu = new Student2();
		MyBean.setValue(stu, "name", "lbdsadasdx");
		String name = MyBean.getValue(stu, "name");
		System.out.println(name);
	}

}

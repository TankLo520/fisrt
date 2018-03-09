package day3_Bean;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyBean {
	public static void setValue(Object bean, String name, Object value) throws ReflectiveOperationException {
		Class class1 = bean.getClass();

		Field f = class1.getDeclaredField(name);
		f.setAccessible(true);
		f.set(bean, value);
	}

	public static String getValue(Object bean, String name) throws ReflectiveOperationException {
		Class class1 = bean.getClass();

		Field f = class1.getDeclaredField(name);
		f.setAccessible(true);
		Object obj = f.get(bean);
		return obj.toString();
	}
	
	public static void populate1(Object bean, Map map) throws ReflectiveOperationException{
		Class clazz = bean.getClass();
		
		Set keys = map.keySet();
		
		for(Object key : keys){
			try{
			Field f = clazz.getDeclaredField(key.toString());
			Object value = map.get(key);
			f.setAccessible(true);
			f.set(bean, value);
			}catch(NoSuchFieldException e){
				
			}
		}
		
		
	}
}

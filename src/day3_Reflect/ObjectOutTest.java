package day3_Reflect;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectOutTest {

	public static void main(String[] args) throws IOException{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("a.txt")));
		ArrayList<Student2> list = new ArrayList<>();
 		Student2 s1 = new Student2("sb", 100);
		Student2 s2 = new Student2("sbb", 100);
		list.add(s1);
		list.add(s2);
		oos.writeObject(list);
//		oos.writeObject(s2);
		
		oos.close();
	}

}

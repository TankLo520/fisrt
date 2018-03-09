package day3_Reflect;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class ObjectInTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
		ArrayList<Student2> list = (ArrayList<Student2>) ois.readObject();
//		Student2 s1 = (Student2) ois.readObject();
//		Student2 s2 = (Student2) ois.readObject();
	
//		Student2 s3 = (Student2) ois.readObject();
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
		for (Student2 student2 : list) {
			System.out.println(student2);
		}
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println((Student2)ois.readObject());
//		}
		
	}

}

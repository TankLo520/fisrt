package com.tank2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.tank.Student;

public class StudentManagerIO {

	public static void main(String[] args) throws IOException {

//		ArrayList<Student> array = new ArrayList<Student>();
		String filename = "students.txt";
		

		while (true) {
			System.out.println("-------��ӭʹ��ѧ������ϵ��-------");
			System.out.println("1.�鿴����ѧ��");
			System.out.println("2.���ѧ��");
			System.out.println("3.ɾ��ѧ��");
			System.out.println("4.�޸�ѧ��");
			System.out.println("5.�˳�����");
			System.out.println("���������ѡ��");

			Scanner sc = new Scanner(System.in);
			String choiceString = sc.nextLine();

			switch (choiceString) {
			case "1":
				findAllStudent(filename);
				// 1.�鿴����ѧ��
				break;
			case "2":
				addStudent(filename);
				// 2.���ѧ��
				break;
			case "3":
				delStudent(filename);
				// 3.ɾ��ѧ��
				break;
			case "4":
				updateStudent(filename);
				// 4.�޸�ѧ��
				break;
			case "5":
				// 5.�˳�����
				// break;
			default:
				System.out.println("лл����ʹ��!!");
				System.exit(0);
				break;
			}

	}

}
	public static void readData(String filename, ArrayList<Student> array) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(filename));
		
		String line ;
		while((line = br.readLine())!=null){
			String[] datas = line.split(",");
			Student s = new Student();
			s.setId(datas[0]);
			s.setName(datas[1]);
			s.setAge(datas[2]);
			s.setAddress(datas[3]);
			
			array.add(s);
			
		
		}
	br.close();
	}
		
	
	public static void writeData(String filename, ArrayList<Student> array) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(filename));

		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			StringBuffer sb = new StringBuffer();
			sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",")
					.append(s.getAddress());

			bw.write(sb.toString());
			bw.newLine();
			bw.flush();

		}
		bw.close();
	}

	public static void updateStudent(String filename) throws IOException {
		
	ArrayList<Student> array = new ArrayList<Student>();
		
		readData(filename, array);
		// �޸�ѧ����˼·������¼��һ��ѧ�ţ���������ȥ���ң����Ƿ���ѧ��ʹ�õ��Ǹ�ѧ�ţ�����о��޸ĸ�ѧ��
		// ��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ�޸ĵ�ѧ����ѧ�ţ�");
		String id = sc.nextLine();

		// ����һ������
		int index = -1;

		// ��������
		for (int x = 0; x < array.size(); x++) {
			// ��ȡÿһ��ѧ������
			Student s = array.get(x);
			// ��ѧ�������ѧ�źͼ���¼���ѧ�Ž��бȽ�
			if (s.getId().equals(id)) {
				index = x;
				break;
			}
		}

		if (index == -1) {
			System.out.println("������˼,��Ҫ�޸ĵ�ѧ�Ŷ�Ӧ��ѧ����Ϣ������,���ȥ�������ѡ��");
		} else {
			System.out.println("������ѧ����������");
			String name = sc.nextLine();
			System.out.println("������ѧ�������䣺");
			String age = sc.nextLine();
			System.out.println("������ѧ���¾�ס�أ�");
			String address = sc.nextLine();

			// ����ѧ������
			Student s = new Student();
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);

			// �޸ļ����е�ѧ������
			array.set(index, s);
			writeData(filename, array);
			// ������ʾ
			System.out.println("�޸�ѧ���ɹ�");
		}
	}

	public static void delStudent(String filename) throws IOException {
	ArrayList<Student> array = new ArrayList<Student>();
		
		readData(filename, array);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ɾ��ѧ�ţ�");
		String id = sc.nextLine();

		int index = -1;
		for (int x = 0; x < array.size(); x++) {
			Student s = array.get(x);
			if (s.getId().equals(id)) {
				// array.remove(x);
				index = x;
				break;
			}
		}

		if (index == -1) {
			System.out.println("�����ڣ��������룡��");
		} else {
			array.remove(index);
			writeData(filename, array);
			System.out.println("ɾ���ɹ�");
		}
	}

	public static void addStudent(String filename) throws IOException {
		ArrayList<Student> array = new ArrayList<Student>();
		
		readData(filename, array);
		Scanner sc = new Scanner(System.in);
		// System.out.println("������ѧ�ţ�");
		String id;

		while (true) {
			System.out.println("������ѧ�ţ�");
			id = sc.nextLine();

			boolean flag = false;
			for (int i = 0; i < array.size(); i++) {
				Student s = array.get(i);

				if (s.getId().equals(id)) {
					flag = true;
					break;
				}

			}

			if (flag) {
				System.out.println("�������ѧ���Ѿ���ռ��,����������");
			} else {
				break; // ����ѭ��
			}
			// String id = sc.nextLine();
			System.out.println("������������");
			String name = sc.nextLine();
			System.out.println("���������䣺");
			String age = sc.nextLine();
			System.out.println("�������ַ��");
			String address = sc.nextLine();

			Student s = new Student();

			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);

			array.add(s);
			// if(s.getName().equals(name)){
			// System.out.println("�Ѵ��ڣ���");
			//// break;
			//// break;
			// }
			writeData(filename, array);
			
			System.out.println("��ӳɹ�������");
		}
	}

	public static void findAllStudent(String filename) throws IOException {
		ArrayList<Student> array = new ArrayList<Student>();
		
		readData(filename, array);
		if (array.size() == 0) {
			System.out.println("*****Ŀǰûѧ��******");
			return;
		}

		System.out.println("ѧ��\t����\t����\t��ַ");
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
		}
	}

	}

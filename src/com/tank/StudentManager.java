package com.tank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {

		ArrayList<Student> array = new ArrayList<Student>();

		while (true) {
			System.out.println("-------欢迎使用学生管理系用-------");
			System.out.println("1.查看所有学生");
			System.out.println("2.添加学生");
			System.out.println("3.删除学生");
			System.out.println("4.修改学生");
			System.out.println("5.退出！！");
			System.out.println("请输入你的选择：");

			Scanner sc = new Scanner(System.in);
			String choiceString = sc.nextLine();

			switch (choiceString) {
			case "1":
				findAllStudent(array);
				// 1.查看所有学生
				break;
			case "2":
				addStudent(array);
				// 2.添加学生
				break;
			case "3":
				delStudent(array);
				// 3.删除学生
				break;
			case "4":
				updateStudent(array);
				// 4.修改学生
				break;
			case "5":
				// 5.退出！！
				// break;
			default:
				System.out.println("谢谢您的使用!!");
				System.exit(0);
				break;
			}

		}
	}

	public static void updateStudent(ArrayList<Student> array) {
		// 修改学生的思路：键盘录入一个学号，到集合中去查找，看是否有学生使用的是该学号，如果有就修改该学生
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要修改的学生的学号：");
		String id = sc.nextLine();

		// 定义一个索引
		int index = -1;

		// 遍历集合
		for (int x = 0; x < array.size(); x++) {
			// 获取每一个学生对象
			Student s = array.get(x);
			// 拿学生对象的学号和键盘录入的学号进行比较
			if (s.getId().equals(id)) {
				index = x;
				break;
			}
		}

		if (index == -1) {
			System.out.println("不好意思,你要修改的学号对应的学生信息不存在,请回去重新你的选择");
		} else {
			System.out.println("请输入学生新姓名：");
			String name = sc.nextLine();
			System.out.println("请输入学生新年龄：");
			String age = sc.nextLine();
			System.out.println("请输入学生新居住地：");
			String address = sc.nextLine();

			// 创建学生对象
			Student s = new Student();
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);

			// 修改集合中的学生对象
			array.set(index, s);

			// 给出提示
			System.out.println("修改学生成功");
		}
	}

	public static void delStudent(ArrayList<Student> array) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入删除学号：");
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
			System.out.println("不存在，重新输入！！");
		} else {
			array.remove(index);
			System.out.println("删除成功");
		}
	}

	public static void addStudent(ArrayList<Student> array) {
		Scanner sc = new Scanner(System.in);
		// System.out.println("请输入学号：");
		String id;

		while (true) {
			System.out.println("请输入学号：");
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
				System.out.println("你输入的学号已经被占用,请重新输入");
			} else {
				break; // 结束循环
			}

		}

		// String id = sc.nextLine();
		System.out.println("请输入姓名：");
		String name = sc.nextLine();
		System.out.println("请输入年龄：");
		String age = sc.nextLine();
		System.out.println("请输入地址：");
		String address = sc.nextLine();

		Student s = new Student();

		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);

		array.add(s);
		// if(s.getName().equals(name)){
		// System.out.println("已存在！！");
		//// break;
		//// break;
		// }
		System.out.println("添加成功！！！");

	}

	public static void findAllStudent(ArrayList<Student> array) {
		if (array.size() == 0) {
			System.out.println("*****目前没学生******");
			return;
		}

		System.out.println("学号\t姓名\t年龄\t地址");
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
		}
	}

}

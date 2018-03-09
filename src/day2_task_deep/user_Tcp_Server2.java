package day2_task_deep;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class user_Tcp_Server2 {

	public static void main(String[] args) throws IOException {
		/**
		 * // 创建socket ServerSocket ss = new ServerSocket(8888);
		 * 
		 * // 监听 Socket soc = ss.accept(); // 获取输入流对对象 InputStream in =
		 * soc.getInputStream(); // 获取数据 byte[] bys = new byte[1024];
		 * 
		 * int len = in.read(bys); String str = new String(bys, 0, len);
		 * System.out.println(str); // 输出数据 // 转换数据 String bigStr =
		 * str.toUpperCase(); // 获取输出流对象 OutputStream out =
		 * soc.getOutputStream();
		 * 
		 * // 返回数据 out.write(bigStr.getBytes()); // 释放资源 soc.close();
		 **/

		// ServerSocket ss = new ServerSocket(9999);
		// Socket soc = ss.accept();
		// InputStream in = soc.getInputStream();
		// byte[] bys = new byte[1024];
		// int len = in.read(bys);
		// String str = new String(bys,0,len);
		// System.out.println(str);
		// OutputStream out = soc.getOutputStream();
		// out.write(str.toUpperCase().getBytes());
		//
		// soc.close();

		// 创建socket
		ServerSocket ss = new ServerSocket(9999);
		// 监听
		Socket soc = ss.accept();
		// 获取输入流对象
		BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
		// 获取、处理数据
		String name = br.readLine();
		String pwd = br.readLine();
		
		//获取用户组
		List<User> users = UserDB.getUsers();
		//获取用户
		User user = new User(name, pwd);
		boolean flag = false;
		if (users.contains(user)) {
			flag = true;
		}
		// 获取输出流对象
		PrintWriter pw = new PrintWriter(soc.getOutputStream(), true);
		if (flag) {
			pw.println("成功登陆！！！");
		} else {
			pw.println("登录失败！！！");
		}

		// 释放资源
		br.close();
		pw.close();
		soc.close();
	}

}

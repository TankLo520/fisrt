package day2_task_deep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class user_Tcp_Client {

	public static void main(String[] args) throws IOException{
	/**	//创建socket
		Socket soc = new Socket("127.0.0.1", 8888);
		//创建输出流对象
		OutputStream out = soc.getOutputStream();
		//发出数据
		out.write("hello".getBytes());
		//获取输入流对象
		InputStream in = soc.getInputStream();
		byte[] bys = new byte[1024];
		//接收数据
		int len = in.read(bys);
		//输出数据
		System.out.println(new String(bys,0,len));
		//释放
		soc.close();
		**/
		
//		Socket soc = new Socket("127.0.0.1", 9999);
//		OutputStream out = soc.getOutputStream();
//		out.write("hehhehehe".getBytes());
//		InputStream in = soc.getInputStream();
//		byte[] bys = new byte[1024];
//		int len = in.read(bys);
//		System.out.println(new String(bys,0,len));
//		soc.close();
		//创建socket
		Socket soc = new Socket("127.0.0.1", 9999);
		//输入两个值，名字，密码
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入名字:");
		String name = br.readLine();
		System.out.println("请输入密码:");
		String pwd = br.readLine();
		
		//获取输出流对象
//		OutputStream out = soc.getOutputStream();
		PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
		out.println(name);
		
		out.println(pwd);
		
		//获取输入流对象
		BufferedReader serverBr = new BufferedReader(new InputStreamReader(soc.getInputStream()));
		//接收数据
		String line = serverBr.readLine();
		System.out.println(line);
		
		//释放
		br.close();
		out.close();
		serverBr.close();
		soc.close();
		
	}

}

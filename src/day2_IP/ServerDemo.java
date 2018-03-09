package day2_IP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		// 创建服务端socket
		ServerSocket ss = new ServerSocket(8888);
		// 监听
		Socket soc = ss.accept();
		// 获取输入流对象
		InputStream in = soc.getInputStream();
		// 获取数据
		byte[] bys = new byte[1024];
		int len;
		len = in.read(bys);
		// 输出数据
		InetAddress address = soc.getInetAddress();
		System.out.println("client --> :" + address.getHostAddress());
		String str = new String(bys, 0, len);
		 System.out.println(str);
		// 释放
		String bigStr = str.toUpperCase();

//		Socket sc = new Socket("127.0.0.1", 8888);
		// 获取对象
		OutputStream out = soc.getOutputStream();
		// 发送数据
//		String s = "hello";
		out.write(bigStr.getBytes());
		// 释放资源
//		sc.close();
		soc.close();
		// ServerSocket ss = new ServerSocket(11111);
		// Socket s = ss.accept();
		// InputStream is = s.getInputStream();
		// byte[] bys = new byte[1024];
		// int len;
		// len = is.read(bys);
		// InetAddress address = s.getInetAddress();
		// System.out.println("client--->" + address.getHostName());
		// System.out.println(new String(bys, 0, len));
		// s.close();

	}
}

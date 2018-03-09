package day2_task;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Tcp_Server {

	public static void main(String[] args) throws IOException {
	/**	// 创建socket
		ServerSocket ss = new ServerSocket(8888);

		// 监听
		Socket soc = ss.accept();
		// 获取输入流对对象
		InputStream in = soc.getInputStream();
		// 获取数据
		byte[] bys = new byte[1024];

		int len = in.read(bys);
		String str = new String(bys, 0, len);
		System.out.println(str);
		// 输出数据
		// 转换数据
		String bigStr = str.toUpperCase();
		// 获取输出流对象
		OutputStream out = soc.getOutputStream();
		
		// 返回数据
		out.write(bigStr.getBytes());
		// 释放资源
		soc.close();
		**/
		
		ServerSocket ss = new ServerSocket(9999);
		Socket soc = ss.accept();
		InputStream in = soc.getInputStream();
		byte[] bys = new byte[1024];
		int len = in.read(bys);
		String str = new String(bys,0,len);
		System.out.println(str);
		OutputStream out = soc.getOutputStream();
		out.write(str.toUpperCase().getBytes());
		
		soc.close();
		
		
	}

}

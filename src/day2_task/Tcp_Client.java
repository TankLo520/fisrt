package day2_task;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Tcp_Client {

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
		
		Socket soc = new Socket("127.0.0.1", 9999);
		OutputStream out = soc.getOutputStream();
		out.write("hehhehehe".getBytes());
		InputStream in = soc.getInputStream();
		byte[] bys = new byte[1024];
		int len = in.read(bys);
		System.out.println(new String(bys,0,len));
		soc.close();
		
		
		
	}

}

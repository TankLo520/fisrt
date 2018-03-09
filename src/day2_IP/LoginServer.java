package day2_IP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class LoginServer {

	public static void main(String[] args) throws IOException {
		//创建服务器socket
		ServerSocket ss = new ServerSocket(8888);
		//监听
		Socket soc = ss.accept();
		//获取输入流对象
		InputStream in = soc.getInputStream();
		//接收数据
		byte[] bys = new byte[1024];
		int len;
		len = in.read(bys);
		System.out.println(new String(bys,0,len));
//		System.out.println(new String(bys,0,len));
		//释放
		soc.close();
	}

}

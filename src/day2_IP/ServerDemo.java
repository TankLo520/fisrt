package day2_IP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		// ���������socket
		ServerSocket ss = new ServerSocket(8888);
		// ����
		Socket soc = ss.accept();
		// ��ȡ����������
		InputStream in = soc.getInputStream();
		// ��ȡ����
		byte[] bys = new byte[1024];
		int len;
		len = in.read(bys);
		// �������
		InetAddress address = soc.getInetAddress();
		System.out.println("client --> :" + address.getHostAddress());
		String str = new String(bys, 0, len);
		 System.out.println(str);
		// �ͷ�
		String bigStr = str.toUpperCase();

//		Socket sc = new Socket("127.0.0.1", 8888);
		// ��ȡ����
		OutputStream out = soc.getOutputStream();
		// ��������
//		String s = "hello";
		out.write(bigStr.getBytes());
		// �ͷ���Դ
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

package day2_IP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class LoginClient {
	public static void main(String[] args) throws IOException{
		//����socket
		Socket sc = new Socket("127.0.0.1", 8888);
		
		//��ȡ���������
		OutputStream os = sc.getOutputStream();
		//��������
//		String user = "hello";
//		String pwd = "123456";
//		BufferedReader br = new BufferedReader();
		
//		os.write(user.getBytes());
//		os.write(pwd.getBytes());
//		
		sc.close();
	}
}

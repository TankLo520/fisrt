package day2_IP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {

	public static void main(String[] args) throws IOException, IOException {
		//�����׽���  DESKTOP-00IPDK7
		Socket sc = new Socket("192.168.79.57",8888);
		//��ȡ���������
		OutputStream out = sc.getOutputStream();
		//��������
		String s = "hello";
		out.write(s.getBytes());
	
		
		InputStream in = sc.getInputStream();
		byte[] bys = new byte[1024];
		int len;
		len = in.read(bys);
		
		System.out.println(new String(bys,0,len));
		//�ͷ���Դ
		sc.close();
	}

}

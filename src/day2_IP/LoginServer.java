package day2_IP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class LoginServer {

	public static void main(String[] args) throws IOException {
		//����������socket
		ServerSocket ss = new ServerSocket(8888);
		//����
		Socket soc = ss.accept();
		//��ȡ����������
		InputStream in = soc.getInputStream();
		//��������
		byte[] bys = new byte[1024];
		int len;
		len = in.read(bys);
		System.out.println(new String(bys,0,len));
//		System.out.println(new String(bys,0,len));
		//�ͷ�
		soc.close();
	}

}

package day2_task;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Tcp_Client {

	public static void main(String[] args) throws IOException{
	/**	//����socket
		Socket soc = new Socket("127.0.0.1", 8888);
		//�������������
		OutputStream out = soc.getOutputStream();
		//��������
		out.write("hello".getBytes());
		//��ȡ����������
		InputStream in = soc.getInputStream();
		byte[] bys = new byte[1024];
		//��������
		int len = in.read(bys);
		//�������
		System.out.println(new String(bys,0,len));
		//�ͷ�
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

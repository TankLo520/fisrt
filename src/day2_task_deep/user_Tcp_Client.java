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
		
//		Socket soc = new Socket("127.0.0.1", 9999);
//		OutputStream out = soc.getOutputStream();
//		out.write("hehhehehe".getBytes());
//		InputStream in = soc.getInputStream();
//		byte[] bys = new byte[1024];
//		int len = in.read(bys);
//		System.out.println(new String(bys,0,len));
//		soc.close();
		//����socket
		Socket soc = new Socket("127.0.0.1", 9999);
		//��������ֵ�����֣�����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("����������:");
		String name = br.readLine();
		System.out.println("����������:");
		String pwd = br.readLine();
		
		//��ȡ���������
//		OutputStream out = soc.getOutputStream();
		PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
		out.println(name);
		
		out.println(pwd);
		
		//��ȡ����������
		BufferedReader serverBr = new BufferedReader(new InputStreamReader(soc.getInputStream()));
		//��������
		String line = serverBr.readLine();
		System.out.println(line);
		
		//�ͷ�
		br.close();
		out.close();
		serverBr.close();
		soc.close();
		
	}

}

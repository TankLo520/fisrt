package day2_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class user_Tcp_Server2 {

	public static void main(String[] args) throws IOException {
		/**
		 * // ����socket ServerSocket ss = new ServerSocket(8888);
		 * 
		 * // ���� Socket soc = ss.accept(); // ��ȡ�������Զ��� InputStream in =
		 * soc.getInputStream(); // ��ȡ���� byte[] bys = new byte[1024];
		 * 
		 * int len = in.read(bys); String str = new String(bys, 0, len);
		 * System.out.println(str); // ������� // ת������ String bigStr =
		 * str.toUpperCase(); // ��ȡ��������� OutputStream out =
		 * soc.getOutputStream();
		 * 
		 * // �������� out.write(bigStr.getBytes()); // �ͷ���Դ soc.close();
		 **/

		// ServerSocket ss = new ServerSocket(9999);
		// Socket soc = ss.accept();
		// InputStream in = soc.getInputStream();
		// byte[] bys = new byte[1024];
		// int len = in.read(bys);
		// String str = new String(bys,0,len);
		// System.out.println(str);
		// OutputStream out = soc.getOutputStream();
		// out.write(str.toUpperCase().getBytes());
		//
		// soc.close();

		// ����socket
		ServerSocket ss = new ServerSocket(9999);
		// ����
		Socket soc = ss.accept();
		// ��ȡ����������
		BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
		// ��ȡ����������
		String name = br.readLine();
		String pwd = br.readLine();
		boolean flag = false;
		if ("lbx".equals(name) && "123456".equals(pwd)) {
			flag = true;
		}
		// ��ȡ���������
		PrintWriter pw = new PrintWriter(soc.getOutputStream(), true);
		if (flag) {
			pw.println("�ɹ���½������");
		} else {
			pw.println("��¼ʧ�ܣ�����");
		}

		// �ͷ���Դ
		soc.close();
	}

}

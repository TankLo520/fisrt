package day2_IP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class udp_Receive {
	public static void main(String[] args) throws IOException {

		// ����socket����
		DatagramSocket ds = new DatagramSocket(8888);
		while (true) {
			// ��������
			byte[] buf = new byte[1024];
			// int length = buf.length;
			DatagramPacket db = new DatagramPacket(buf, buf.length);
			ds.receive(db);
			// ��������
			InetAddress ip = db.getAddress();
			byte[] data = db.getData();
			int len = db.getLength();
			// �������
			// while (true) {
//			System.out.println("�ȴ�����");
			System.out.println("send by ---:" + ip.getHostAddress());
			System.out.println(new String(buf, 0, len));
			// �ͷ���Դ
			// ds.close();
		}
	}
}

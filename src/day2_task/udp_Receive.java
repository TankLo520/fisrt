package day2_task;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class udp_Receive {

	public static void main(String[] args) throws IOException {
		//����socket
		DatagramSocket ds = new DatagramSocket(8888);
		
		//����������
		byte[] bys = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bys,bys.length);
		//��������
		ds.receive(dp);
		//��������
		InetAddress address = dp.getAddress();
		byte[] data = dp.getData();
		int len = dp.getLength();
		//�������
		System.out.println("send-->:" + address);
		System.out.println(new String(data,0,len));
		//�ͷ�
		ds.close();
	}
	

}

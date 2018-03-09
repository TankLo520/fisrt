package day2_IP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class udp_Receive {
	public static void main(String[] args) throws IOException {

		// 创建socket对象
		DatagramSocket ds = new DatagramSocket(8888);
		while (true) {
			// 接收数据
			byte[] buf = new byte[1024];
			// int length = buf.length;
			DatagramPacket db = new DatagramPacket(buf, buf.length);
			ds.receive(db);
			// 解析数据
			InetAddress ip = db.getAddress();
			byte[] data = db.getData();
			int len = db.getLength();
			// 输出数据
			// while (true) {
//			System.out.println("等待接收");
			System.out.println("send by ---:" + ip.getHostAddress());
			System.out.println(new String(buf, 0, len));
			// 释放资源
			// ds.close();
		}
	}
}

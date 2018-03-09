package day2_IP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class udp_Send {
	public static void main(String[] args) throws IOException {

		// 创建socket对象
		DatagramSocket ds = new DatagramSocket();
		// String s = "hello world";
		// byte[] buf = s.getBytes();
		// int length = s.length();
		// InetAddress address = InetAddress.getByName("DESKTOP-00IPDK7");
		// int port = 8888;
		Scanner sc = new Scanner(System.in);
		while (true) {
		
			if("quit".equals(sc)){
				ds.close();
				break;
			}
			String line = sc.nextLine();
			// 创建数据并打包
			DatagramPacket db = new DatagramPacket(line.getBytes(), line.length(), InetAddress.getByName("DESKTOP-00IPDK7"), 8888);
			
			// 发送
			ds.send(db);
		}
			// 关闭
			
		
	}

}

package day2_task;

import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class udp_Send {

	public static void main(String[] args) throws IOException {
		//创建socket
		DatagramSocket ds = new DatagramSocket();
		
		//数据打包
		String s = "hello!!!";
		
		DatagramPacket dp = new DatagramPacket(s.getBytes(), s.length(), InetAddress.getByName("DESKTOP-00IPDK7"), 8888);
		
		//发送数据
		ds.send(dp);
		//释放数据
		ds.close();
	}

}

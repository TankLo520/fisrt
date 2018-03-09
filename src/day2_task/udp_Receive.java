package day2_task;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class udp_Receive {

	public static void main(String[] args) throws IOException {
		//创建socket
		DatagramSocket ds = new DatagramSocket(8888);
		
		//创建包对象
		byte[] bys = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bys,bys.length);
		//接收数据
		ds.receive(dp);
		//解析数据
		InetAddress address = dp.getAddress();
		byte[] data = dp.getData();
		int len = dp.getLength();
		//输出数据
		System.out.println("send-->:" + address);
		System.out.println(new String(data,0,len));
		//释放
		ds.close();
	}
	

}

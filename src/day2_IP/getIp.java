package day2_IP;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class getIp {
	public static void main(String[] args) throws UnknownHostException {
//		InetAddress Ip =InetAddress.getByName("AdminiskiiPhone");
//		System.out.println(Ip);
		System.out.println(InetAddress.getByName("124.160.213.171").getHostName());
		System.out.println(InetAddress.getByName("192.168.79.57").getHostName());
		System.out.println(InetAddress.getLocalHost().getHostName());
	}
}

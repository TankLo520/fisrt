package day2_task;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class first {

	public static void main(String[] args) throws IOException {
		// InetAddress ip = InetAddress.getByName("DESKTOP-00IPDK7");
		InetAddress ip = InetAddress.getByName("192.168.79.37");

		System.out.println(ip.getHostName());
		System.out.println(ip.getHostAddress());
	}

}

package day2_task_deep;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Pic_server {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(9999);
		Socket soc = ss.accept();
		InputStream in = soc.getInputStream();
		
		BufferedInputStream bis = new BufferedInputStream(in);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("hehe.jpg"));
		
		int b;
		while((b = bis.read())!=-1){
			bos.write(b);
		}
		
		bos.close();
		bis.close();
		soc.close();
	}

}

package day2_task_deep;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Pic_client {

	public static void main(String[] args) throws IOException{
		Socket soc = new Socket("127.0.0.1", 9999);
		
		OutputStream out = soc.getOutputStream();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:/0.jpg"));
		BufferedOutputStream bos =  new BufferedOutputStream(out);
		
		int b;
		
		while((b = bis.read())!=-1){
			bos.write(b);
		}
		
		bis.close();
		bos.close();
		soc.close();
		

	}

}

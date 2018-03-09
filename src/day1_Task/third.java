package day1_Task;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class third {
	public static void main(String[] args) {
		Thread tt = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					BufferedReader br = new BufferedReader(new FileReader("students.txt"));
					BufferedWriter bw = new BufferedWriter(new FileWriter("new.txt"));
					
					String line;
					while((line = br.readLine())!=null){
						bw.write(line);
						bw.newLine();
						bw.flush();
					}
					bw.close();
					br.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			}
		});
		
		tt.start();
	}
}

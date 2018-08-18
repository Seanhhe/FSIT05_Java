package tw.org.iii.mytest;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Brad61 {

	public static void main(String[] args) {
		byte[] buf = new byte[1024];//此行待修正
		try {
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(buf, buf.length, 
					InetAddress.getByName("10.2.1.133"), 8888);//IP位址
			socket.send(packet);
			socket.close();
		}catch (Exception e) {
			System.out.println(e);
		}
		

	}

}

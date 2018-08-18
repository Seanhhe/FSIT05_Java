package tw.org.iii.mytest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
/*
 * ------------------------------------
 * port的使用：大於1024，小於65535，皆可使用。(0~1024多數有預設用途)
 * UDP的用法
 * ------------------------------------
 * 01.先建立接收端
 * 02.再建立發送端(Brad61)，IP設定自己的測試
 * 03.while (true) {} 無限迴圈是最後加上，用來持續接收訊息。
 * 04.
 */
public class Brad60 {

	public static void main(String[] args) {
		while (true) {
			byte[] buf = new byte[1024];//buf初始化
			try {
				DatagramSocket socket = new DatagramSocket(8888);
				DatagramPacket packet = new DatagramPacket(buf, buf.length);
				//System.out.println("before");
				socket.receive(packet);//收到
				//System.out.println("after");
				socket.close();
				//收到的封包在buf裡
				byte[] data = packet.getData();//取出封包資料
				int len = packet.getLength();//取出封包長度
				InetAddress ip = packet.getAddress();//取出IP位址
				String mesg = new String(data, 0, len);
				System.out.println(ip.getHostAddress() + ":" + 
						len + ":" +
						mesg);//印出上述資訊
				
				if (mesg.equals("stop")) {
					System.out.println("will stop");//除錯
					break;
				}
				
			}catch (IOException e) {
				System.out.println(e);
				break;
			}
		}
		
		
	}

}

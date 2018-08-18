package tw.org.iii.mytest;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;
/*
 * 發送端
 */
public class Brad64 {

	public static void main(String[] args) {
		//01. read local file
		//02. send tcp data
		
		try {
			File file = new File("dir1/brad.jpg");
			byte[] buf = new byte[(int)file.length()];
			new FileInputStream(file).read(buf);
			
			
			Socket socket = new Socket("10.2.1.133",7777);
			
			
			OutputStream out = socket.getOutputStream();
			
			out.write(buf);
			out.flush();
			out.close();
			//fin.close();
			
			socket.close();
			System.out.println("Send OK");
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}

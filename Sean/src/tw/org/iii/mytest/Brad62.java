package tw.org.iii.mytest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad62 {

	public static void main(String[] args) {
		try {
			ServerSocket Server = new ServerSocket(9999);
			//Server.accept(); //三方交握
			Socket socket = Server.accept(); //三方交握
			//15至19是上週的程式
			InputStream in = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);//多列處理
			
			
			
			int len; String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			Server.close();
			System.out.println("OK");
			
		}catch (IOException e) {
			System.out.println(e);
		}

	}

}

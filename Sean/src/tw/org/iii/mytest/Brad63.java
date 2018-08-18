package tw.org.iii.mytest;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Brad63 {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("10.2.1.133", 9999);
			//Socket(IP位址或主機名稱without http:// ,PORT)
			//23PORT，是明碼傳輸，不能開
			
			OutputStream out = socket.getOutputStream();
			out.write("Hello, Brad\nLine1\nLine2".getBytes());//待修正
			out.flush();//沖出
			out.close();
			
			socket.close();
			System.out.println("OK1");//看到OK1就是PORT有開啟
		}catch (IOException e) {
			System.out.println(e);
		}
		

	}

}

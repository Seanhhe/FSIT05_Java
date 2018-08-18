package tw.org.iii.mytest;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class Brad68 {

	public static void main(String[] args) {

		try {
			URL url = new URL("https://pdfmyurl.com/?url=www.gamer.com.tw");//URL要包含https://
			//取得網頁原始碼(爬蟲)
			//HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
			conn.connect();
			
			FileOutputStream fout = new FileOutputStream("dir3/gamer.pdf");
			BufferedInputStream bin = new BufferedInputStream(conn.getInputStream());
			byte[] buf = new byte[4096]; int len;
			while ((len = bin.read(buf)) != -1) {
				
			}
			bin.close();
			fout.flush();
			fout.close();
			System.out.println("fetch OK");


			
		}catch (Exception e) {
			System.out.println(e);
		}

	

	}

}

package tw.org.iii.mytest;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class Brad66 {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://products.mizuno.tw/product_images/list/SH_J1GC182509.jpg");//URL要包含https://
			//取得網頁原始碼(爬蟲)
			//HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
			conn.connect();
			
			FileOutputStream fout = new FileOutputStream("dir3/ok.jpg");
			BufferedInputStream bin = new BufferedInputStream(conn.getInputStream());
			byte[] buf = new byte[4096]; int len;
			while ((len = bin.read(buf)) != -1) {
				
			}
			bin.close();
			System.out.println("fetch OK");

			
			
//			BufferedReader reader = new BufferedReader(
//					new InputStreamReader(
//							conn.getInputStream()));
//			String line;
//			while ((line = reader.readLine()) != null) {
//				System.out.println(line);
//			}
//			//InputStream in = conn.getInputStream();//提示：傳送接收頁面原始碼的文字資料
//			reader.close();
			
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}

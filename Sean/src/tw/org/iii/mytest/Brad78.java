package tw.org.iii.mytest;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Brad78 {

	public static void main(String[] args) {
		System.out.println("OK:" + System.currentTimeMillis());
		String[] urls = {
				"https://www.freeiconspng.com/img/35070/dust-png-35070.png",
				"https://wall.alphacoders.com/big.php?i=671281.jpg",
				"https://wallpaper-house.com/data/out/8/wallpaper2you_247567.jpg",
				"http://deskbg.com/s3/wpp/11/11631/early-nebula-desktop-background.jpg"
		};
		String[] targets = {"brad01.png","brad02.jpg","brad03.jpg","brad04.jpg"};
		
		for (int i=0; i<urls.length; i++) {
			//new FetchURLImage(urls[i], targets[i]).start();//用執行緒的做法
			new FetchURLImage(urls[i], targets[i]).run();//用run方法
		}
	}

}
class FetchURLImage extends Thread {
	private String url, target;
	public FetchURLImage(String url, String target) {
		this.url = url;
		this.target = target;
	}
	
	@Override
	public void run() {
		super.run();
		try {
			URL source = new URL(url);
			HttpURLConnection conn = 
					(HttpURLConnection)source.openConnection();
			conn.connect();
			BufferedInputStream bin = new BufferedInputStream(conn.getInputStream());
			FileOutputStream fout = new FileOutputStream("dir1/" + target);
			byte[] buf = new byte[4096*1024]; int len = 0;
			while((len = bin.read(buf)) != -1) {
				fout.write(buf, 0, len);
			}
			fout.flush();
			fout.close();
			bin.close();
			System.out.println(target + ":OK");
			
		}catch(Exception e) {
			System.out.println(target + "ERROR");
		}
		System.out.println("Finish:" + System.currentTimeMillis());
	}
}
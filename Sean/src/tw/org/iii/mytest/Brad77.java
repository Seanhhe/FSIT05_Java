/*
 * 檔案的IO及網際網路的處理常運用執行緒
 */

package tw.org.iii.mytest;

import java.util.TimerTask;

public class Brad77 {

	public static void main(String[] args) {
		Brad771 obj1 = new Brad771();//是執行緒
		Brad772 obj2 = new Brad772();//此用法比執行緒彈性，可認別的父類別
		Brad773 obj3 = new Brad773();
		
		
		obj1.start();//是執行緒，有start()可用
		//obj2沒實作start可用
		//Thread t2 = new Thread(obj2);//用java.lang.Thread的建構式Thread(Runnable)
		//t2.start();
		Thread t3 = new Thread(obj3);
		t3.start();
		
		Thread t4 = new Thread(obj2) {//不寫class，改寫在裏頭的執行緒(註解掉19,20行後存檔執行測試)
			public void run() {
				System.out.println("t4");
			}
		};
		t4.start();
		
		new Thread() {
			public void run() {//override
				for (int i=10000; i<10020; i++) {
					System.out.println(i);
					try {
						Thread.sleep(100);
					}catch (InterruptedException e) {
						
					}
				}	
			}
			
		}.start();
		
		
		System.out.println("OK");
	}

}

//只能繼承一個父類別Thread
class Brad771 extends Thread {
	@Override
	public void run() {
		super.run();
		for (int i = 0; i<20; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			}catch(Exception e) {
				
			}
		}
		
	}
}
//實作Runnable，不代表執行緒Thread
class Brad772 implements Runnable {
	@Override
	public void run() {
		for (int i = 100; i<120; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			}catch(Exception e) {
				
			}
		}
	}
}

class Brad773 extends TimerTask {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 100; i<220; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			}catch(Exception e) {
				
			}
		}
	}
}

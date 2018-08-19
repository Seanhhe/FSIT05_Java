package tw.org.iii.mytest;

public class Brad76 {

	public static void main(String[] args) {
		Brad761 t1 = new Brad761("A");
		Brad761 t2 = new Brad761("B");
		t1.start();
		t2.start();
		System.out.println("OK");
		try {
		Thread.sleep(3*1000);
		}catch(Exception e) {
			
		}
		System.out.println("Wake Up");//醒來run()是普通方法，所以會依序印完A、B
		t1.run();
		t2.run();
	}

}
class Brad761 extends Thread {
	String name;
	Brad761(String name){this.name = name;}
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(100);//睡足秒數(大於等於秒數)再從新run pool排隊(只能用於延遲，不能用於週期排程)
			}catch(Exception e) {
				
			}
		}
	}
}
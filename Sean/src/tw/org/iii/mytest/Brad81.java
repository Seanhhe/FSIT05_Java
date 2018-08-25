package tw.org.iii.mytest;


/*
 * 多執行緒使用同步鎖定
 * 參考連結：http://eoffice.im.fju.edu.tw/phpbb/viewtopic.php?t=6280
 * 
 * StringBuffer：可在多重執行緒下使用，較安全。
 * StringBuilder：對於多重執行緒使用下，不可使用。
 * 
 * wait()要與notifyAll()配合使用才能避開死結問題
 * 
 * */
public class Brad81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATMv2 atm = new ATMv2();
		Bankv2 bank = new Bankv2(atm);
		Personv2 pA = new Personv2(atm, "A");
		Personv2 pB = new Personv2(atm, "B");
		Personv2 pC = new Personv2(atm, "C");
		Personv2 pD = new Personv2(atm, "D");
		bank.start();
		pA.start();pB.start();pC.start();pD.start();
	}

}
class ATMv2{//提款機物件實體
	private int limit = 1000;
	private int money;
	void add(int add) {
		while (money+add>1000) {
			try {
				System.out.println("bank:" + add + ":wait");
				wait();
			} catch (Exception e) {
				
			}
		}
		
		
		
//		if (money+add > 1000) {
//			// xx
//			System.out.println("add:xx");
//		}else {
//			money += add;
//			System.out.println("add:" + add + " => " + money);
//		}
	}
	//synchronized void get(int get, String name) {
	void get(int get, String name) {
		if (money<get) {
			System.out.println(name + ":get:xx");
		}else {
			money-=get;
			System.out.println(name + ":get:" + get + " => " + money);
			/*
			 * 執行結果發生問題(AB同時領錢)，解決方法是鎖定synchronized void get(int get, String name)
			 * add:500 => 500
			   A:get:4 => 462
			   B:get:34 => 462
			 * */
		}
	}
}
class Bankv2 extends Thread{
	private ATMv2 atm;
	Bankv2(ATMv2 atm){this.atm = atm;}
	@Override
	public void run() {
		super.run();
		for (int i=0; i<10; i++) {
			atm.add(500);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

class Personv2 extends Thread {
	private ATMv2 atm;
	private String name;
	Personv2(ATMv2 atm, String name){this.atm = atm; this.name = name;}
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			//鎖定物件去進行操作(看情況決定是否使用)
			synchronized (atm) {
				atm.get((int)(Math.random()*100)+1, name);
			}
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				
			}
		}
		System.out.println(name + ":stop");
	}
}
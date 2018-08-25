package tw.org.iii.mytest;
/*
 * 多執行緒使用同步鎖定
 * 參考連結：http://eoffice.im.fju.edu.tw/phpbb/viewtopic.php?t=6280
 * 
 * */
public class Brad80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM atm = new ATM();
		Bank bank = new Bank(atm);
		Person pA = new Person(atm, "A");
		Person pB = new Person(atm, "B");
		Person pC = new Person(atm, "C");
		Person pD = new Person(atm, "D");
		bank.start();
		pA.start();pB.start();pC.start();pD.start();
	}

}
class ATM{//提款機物件實體
	private int limit = 1000;
	private int money;
	void add(int add) {
		if (money+add > 1000) {
			// xx
			System.out.println("add:xx");
		}else {
			money += add;
			System.out.println("add:" + add + " => " + money);
		}
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
class Bank extends Thread{
	private ATM atm;
	Bank(ATM atm){this.atm = atm;}
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
	private ATM atm;
	private String name;
	Person(ATM atm, String name){this.atm = atm; this.name = name;}
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
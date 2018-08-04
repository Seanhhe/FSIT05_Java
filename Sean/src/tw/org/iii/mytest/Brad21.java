package tw.org.iii.mytest;

public class Brad21 {

	public static void main(String[] args) {
		Bike b1; //宣告變數b1
		Bike b2;
		b1 = new Bike();//建立新物件，然後初始化
		System.out.println(b1.getSpeed());
		b2 = new Bike(1.4);
		System.out.println(b2.getSpeed());
		b1.upSpeed();
		System.out.println(b1.getSpeed());
	}

}

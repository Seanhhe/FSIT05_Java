/*
 * 強迫子類別表現多型
 * */

package tw.org.iii.mytest;

public class Brad34 {

	public static void main(String[] args) {
		//Brad341 obj1 = new Brad341();
		//Brad341已被宣告抽象類別，便無法以Brad341宣告obj1
		Brad341 obj1 = new Brad342();
		Brad341 obj2 = new Brad343();
		obj1.m2();
		obj2.m2();
		
	}

}

abstract class Brad341 {
	void m1() {System.out.println("Brad341:m1");}
	abstract void m2();
	//抽象方法(有定義無實作的方法)，需至class前宣告可能有抽象類別
	//強迫子類別表現m2()
}
class Brad342 extends Brad341 {
	void m2() {
		System.out.println("Brad342:m2()");
	}
}
class Brad343 extends Brad341 {
	void m2() {
		System.out.println("Brad343:m2()");
	}
}
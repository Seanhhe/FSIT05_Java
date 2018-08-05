/*
 * 01."繼承"透過extends父類別，來表現"多型"override
 * 02.強迫子類別表現出"多型"
 */

package tw.org.iii.mytest;

public class Brad33 {

	public static void main(String[] args) {
		//Brad331.m2();
		//Brad331 obj1 = new Brad331();
		Brad332 obj2 = new Brad332(); //宣告Brad332物件實體，留意執行結果的父子順序
		Brad332 obj3 = new Brad332();
		
	}

}
//建構式在做物件的初始化
class Brad331 {
	static 	{System.out.println("Brad331{static}");} //static:物件類別的程式區塊
	{System.out.println("Brad331{}");} //物件的程式區塊code block
	Brad331(){System.out.println("Brad331()");}// 建構式
	void m1() {System.out.println("Brad331:m1()");}
	static void m2(){System.out.println("Brad331:m2");}
}

class Brad332 extends Brad331 {
	static 	{System.out.println("Brad332{static}");} //static:物件的程式區塊
	{System.out.println("Brad332{}");} //物件的程式區塊
	Brad332(){System.out.println("Brad332()");}//建構式
	void m1() {System.out.println("Brad332:m1()");}
	static void m2(){System.out.println("Brad332:m2");}
}
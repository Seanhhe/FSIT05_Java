package tw.org.iii.mytest;

public class Brad36 {

	public static void main(String[] args) {
		Brad363 obj1 = new Brad363();
		Brad362 obj2 = new Brad363();
		
	}

}
//跟class同等級，有protocol的感覺
interface Brad362 { //定規格，不會有實作方法在內，永遠是public
	void m1(); //連abstract都不用加在前面，也不用存取修飾字的宣告，永遠是public
	void m2();
	
}

class Brad363 implements Brad362 { //implements實現實作
	public void m1() {} //實作者要宣告public
	public void m2() {}
	void m3() {}
}


//繼承 是 單一繼承，但interface實現可多樣
class Brad364 implements Brad362 {
	public void m1() {} //實作者要宣告public
	public void m2() {}
}
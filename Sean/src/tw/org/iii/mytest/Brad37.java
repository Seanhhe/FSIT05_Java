package tw.org.iii.mytest;

public class Brad37 {

	public static void main(String[] args) {
		
	}

}
//繼承 是 單一繼承，但interface實現可多樣
interface Brad371 {
	void m1();//介面無實作，但可透過類別內的實作來實現
}

interface Brad372 {
	void m2();
}
interface Brad373 extends Brad371, Brad372 {//把372、371規格融為一體
	void m3();
}
class Brad374 implements Brad371, Brad372 {
	public void m1() {}
	public void m2() {}
	public void m3() {}
}

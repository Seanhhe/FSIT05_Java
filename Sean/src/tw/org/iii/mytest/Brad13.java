package tw.org.iii.mytest;

public class Brad13 {

	public static void main(String[] args) { //for迴圈
		int i = 0;
//		for (m1(); i<10; i++) { 
//			System.out.println(i);
		for (m1(); i<10; System.out.println("-----")) { 
			System.out.println(i++);
		}
		System.out.println(i);
	}
	
	public static void m1() { //呼叫m1方法(進入迴圈之前要做的事)
		int a = 10, b = 3;
		System.out.println(a/b);
	}

}
// 無窮迴圈可用於壞事:DDOS攻擊   好事:伺服器搭配多重執行緒
// for (;;){
// }
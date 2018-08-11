/*
 * 完整try catch結構
 */

package tw.org.iii.mytest;


//完整try catch結構
public class Brad42 {

	public static void main(String[] args) {
		m1();

	}
	
	static void m1() {
		//int a = 10, b = 0;
		int a = 10, b = 3;
		try {
			System.out.println(a / b);
			return;
		}catch (Exception e) {
			System.out.println("OK");
			return;
		}finally {
			//不管如何都會執行finally
			System.out.println("OK2");
		}
		//System.out.println("OK3");
	}
}

//public class Brad42 {
// 
//	public static void main(String[] args) {
//		int a = 10, b = 0;
//		try { //完整try catch結構
//			System.out.println(a / b);
//		}catch (Exception e) {
//			System.out.println("OK");
//		}finally {
//			//不管如何都會執行finally
//			System.out.println("OK2");
//		}
//		System.out.println("OK3");
//
//	}
//
//}
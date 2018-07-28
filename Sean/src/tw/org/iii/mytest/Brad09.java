package tw.org.iii.mytest;

public class Brad09 {

	public static void main(String[] args) {
		int a = 10, b = 3;
		if (--a >= 10 && ++b <= 3) {  //只要前一個為true,後一個判斷式便不會去執行
			System.out.println("ok:a =" + a + ";b =" + b);
		}else {		//只要前一個判斷式為false,便直接執行else內的程式
			System.out.println("xx:a =" + a + ";b =" + b);
		}
		
		System.out.println( 3 & 2); // 二進位運算 (常運用在影像處理)
		System.out.println( 3 ^ 2); // XOR
		System.out.println("-----");
		if (a < 10) {
			System.out.println("III");
		}
	}

} 

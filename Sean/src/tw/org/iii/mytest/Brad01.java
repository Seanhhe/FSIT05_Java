package tw.org.iii.mytest;

public class Brad01 {

	public static void main(String[] args) {
		byte b1;	// -128 ~ 127 => 256 => 2^8
		byte b2 = 12;  //可直接給值
		byte b3 = 127; 
		// 命名規則[a-zA-Z$_][a-zA-Z0-9$_]*
		// 不要撞到關鍵字
		byte $_$ = 123;
		byte 變數1 = 123;
		
		short s1 = 128; // 2^16
		short s2 = 32767;
//		short s3 = 32768; 超過
		
		int a1 = 123; //	整數範圍 2^32  => 約43億 => 十位數
		long g1 = 123;  //  2^64
		
	}

}

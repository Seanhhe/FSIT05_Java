package tw.org.iii.mytest;

public class Brad11 {

	public static void main(String[] args) {
		 byte a = 11, b = 100; //範圍-128至127
		 final byte c = 100; //final後只能給一次初始值
		 
		 switch (a) {
		 case 1: 
			 System.out.println("A"); 
			 break;
		 default: //default的結尾不加break,是要結合其他程式運作用的(例如擺放的位置)
			 System.out.println("X");
			 
		 case c-90:
			 System.out.println("B");
			 break;
		 case c-91: //不可case b: ,因b是變數，case 只能接常數(數值)
			 System.out.println("C");
			 break;
//		 case c: 
//			 System.out.println("C");
//			 break;
//		 case 1000:
//			 System.out.println("D");
		 		 
		 }
	}

}

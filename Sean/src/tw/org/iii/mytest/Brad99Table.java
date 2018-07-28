package tw.org.iii.mytest;

public class Brad99Table {

	public static void main(String[] args) { // \t是無法列印字元(tab)
//		for (int k=0; k<4; k++) { //k有幾列
//			for (int y=1; y<=9; y++) {
//				for (int x=2; x<=5; x++) { //由內而外寫, 
//					int newx = x + k*4; //一列有4個colum
//					int r = newx * y; //由內而外寫
//					System.out.print(newx + " x " + y + " = " + r +"\t");
//				}
//				System.out.println();//換列
//			}
//			System.out.println("------------------------------------------------------------");
//		}
		
		for (int k=0; k<2; k++) { //乘法表有k列
			for (int y=1; y<=9; y++) {
				for ( int x=2; x<=5; x++) {
					int newx = x + k*4; // k列 與(k+1列) 差4
					int r = newx * y;
					System.out.print(newx + " x " + y + " = " + r + "\t");
				}
				System.out.println(); //每行換列
			}
			System.out.println("-------------------分隔線------------------------------------");	
		}
		
	}

}

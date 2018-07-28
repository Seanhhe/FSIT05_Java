/*
 * 二維陣列
 */
package tw.org.iii.mytest;

public class Brad18 {

	public static void main(String[] args) {
		 int[][] a = new int[2][3]; // 初始化完成，內值是0
		 int[][] b = new int[2][]; // 第二維度暫時不設定
		 b[0] = new int[3];
		 b[1] = new int[2];
		 
		 for (int i =0; i<b.length; i++) {
			 for (int j=0; j<b[i].length; j++) {
				 System.out.print(b[i][j] + " ");
			 } 
			 System.out.println();//有幾個元素
		 }
		 System.out.println("---");
		 int[] c = {1,3,4,7,3};
		 for (int brad: c) { //中間是冒號:  左邊是元素型別   右邊是想巡訪的陣列   然後放入左邊宣告的陣列
			 System.out.println(brad); //此寫法注重只想取出值
		 }
		 System.out.println("分隔線");
		 for (int[] bb:b) {
			 for (int bbb:bb) {
				 System.out.print(bbb + " ");
			 }
			 System.out.println();
		 }
	}

}

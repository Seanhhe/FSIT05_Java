package tw.org.iii.mytest;

public class Brad16 {

	public static void main(String[] args) {
		/*
		 * Array
		 * 1. Type: 資料型別
		 * 2. Length: 記憶體中的長度是固定的
		 */
		int[] a; //宣告整數陣列，八大型別置換印出來看看
		a = new int[4]; //有四個元素在陣列中，從0至3，上下兩行就是宣告&初始化
		for (int i=0; i<a.length; i++) { //該物件
			System.out.println(a[i]);
		}
		
		int[] b = new int[3];
		int[] c = new int[] {1,2,3,4,5};
		for (int i=0; i<=c.length; i++) {
			System.out.println(c[i]);
		}
		int[] d= {1,2,3,4,5};
		for (int i=0; i<d.length; i++) {
			System.out.println(d[i]);
		}

		int[] e;
		int[] f;
		e = new int[] {1,2,3,4,5};
		//f = {1,2,3,4,5}
		
		

	}

}

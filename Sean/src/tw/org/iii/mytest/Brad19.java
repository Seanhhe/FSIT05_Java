/*
 * 
 */

package tw.org.iii.mytest;

public class Brad19 {

	public static void main(String[] args) {
		int a = 1;
//		while (a<10) { //進入迴圈前會先判斷能否進入  前測迴圈
//			System.out.println(a++);
//		}
		do { //後測迴圈  先做再判斷while
			System.out.println(a++);
		}while (a<10);

	}

}



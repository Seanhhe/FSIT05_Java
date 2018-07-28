/*
 * Brad17 陣列範例：骰子機率
package tw.org.iii.mytest;

public class Brad17 {

	public static void main(String[] args) {
		 int[] p = new int[7];
		 		 
		 for (int i=0; i<10000; i++) {
			 int point = (int)(Math.random()*6) +1;
			 if (point>=1 && point <=6) {
				 p[point]++;
			 }else {
				 p[0]++;
			 }
 	 
		 }
		 if (p[0] == 0) {
			for (int i=1; i<p.length; i++) {
				System.out.println(i + "點出現" + p[i] + "次");
			}
		 }else {
			 System.out.println("XX");
		 }
	}

}
 *
 */
package tw.org.iii.mytest; 
// 一維陣列
public class Brad17 { //骰子456多一倍

	public static void main(String[] args) {
		 int[] p = new int[7];
		 		 
		 for (int i=0; i<10000; i++) {
			 int point = (int)(Math.random()*9) +1; // 1.先內部改成1至9
			 if (point>=1 && point <=9) { // 1.先內部改成1至9
				 p[point>=7?point-3:point]++; // 2. 三元運算式
			 }else {
				 p[0]++;
			 }
 	 
		 }
		 if (p[0] == 0) {
			for (int i=1; i<p.length; i++) {
				System.out.println(i + "點出現" + p[i] + "次");
			}
		 }else {
			 System.out.println("XX");
		 }
	}

}


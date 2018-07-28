package tw.org.iii.mytest;

public class Brad15 {

	public static void main(String[] args) {
		 for (int i=0; i<10; i++) {
			 if (i % 2 ==0) {
				 continue; //continue以下code不做，也可自訂lable標籤。
			 }
			 System.out.println(i);
		 }
		 System.out.println("---");
		 
		 brad: //自訂lable標籤，只能緊跟迴圈敘述句，如for, while, do, while, 命名規則同變數
		 for (int i=0; i<10; i++) {
			 for (int j=0; j<=10; j++) {
				 if (i + j >=10) {
					 break brad; //脫離至brad:
				 }
				 System.out.println(i + ":" + j);
			 }
		}
	}

}

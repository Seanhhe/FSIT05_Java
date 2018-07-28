package tw.org.iii.mytest;

public class Brad14_PrimeNumber {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		for (int i=1; i<=100; i++) {
			
			boolean isPrime = true;//最後加上的程式boolean
			for (int j=2; j<i; j++) {
				if (i % j == 0) {
					//抓到不是質數即可break脫離
					isPrime = false; //最後加上的程式boolean
					break;
				}
			}
			
			System.out.print(i + (isPrime?"*":" ") + " ");
			if (i % 10 == 0) System.out.println();
		}
		System.out.println(System.currentTimeMillis()-start);
	}

}

/* 基礎表格輸出
		for (int i=1; i<=100; i++) {
			System.out.print(i + " ");
			if (i % 10 == 0) System.out.println();
 */
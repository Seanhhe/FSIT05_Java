package tw.org.iii.mytest;

public class Brad41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=3; //double型態的任何數除以接近零的數，等於無限大。可把B=3或0交換測試看印出Ooops1至3何者，可得知哪個捕捉功能發揮作用
		//double a=0, b=0; not a number
		int c ;
		//System.out.println(c);
		int[] d = new int[3];
		
		/*
		//範例一
		try { //捕捉 try catch
		System.out.println(d[13]);//出現例外時，拋出給main()，後續不會被執行。
		}catch (ArrayIndexOutOfBoundsException e) {
			//捕捉後的處理方式寫在這裡
			
		}//捕捉處理後會繼續執行列印Game Over
		System.out.println("Game Over");
		*/
		
		//範例二
		try { //捕捉 try catch
			c = a / b;
			//System.out.println("before");
			System.out.println(d[13]);//出現例外時，拋出給main()，後續不會被執行。
			//System.out.println("after");
//			}catch (ArrayIndexOutOfBoundsException e) {
//				//捕捉後的處理方式寫在這裡
//				System.out.println("Ooop1");
			}catch (ArithmeticException e) { //捕捉數學例外
				//捕捉後的處理方式寫在這裡
				System.out.println("Ooop2");
			}catch (RuntimeException e) { //是ArrayIndexOutOfBoundsException的直系血親，可以囊括處理
				//捕捉後的處理方式寫在這裡
				System.out.println("Ooop3");
			}//捕捉處理後會繼續執行列印Game Over
		
			System.out.println("Game Over");
	}

}

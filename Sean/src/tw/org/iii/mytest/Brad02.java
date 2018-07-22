package tw.org.iii.mytest;

public class Brad02 {

	public static void main(String[] args) {
		int a1 = 10, a2 = 3;
		int a3 = a1 / a2;
		System.out.println(a3);
		byte b1 = 10, b2 =3;
//		byte b3 = b1 / b2;  
		byte b3 = (byte)(b1 / b2);
		// byte, short, int的混合運算結果被視為int
		// 若long加入, 則被視為long
		System.out.println(b3);
		byte b4 = 10 + 3; // 被視為常數運算
//		byte b4 = b1 + 3;  
		byte b5 = 127;
		b5++;
		System.out.println(b5); //內部是位元移動,結果是-128
		b5--;
		System.out.println(b5);
		b5 += 4;
		System.out.println(b5);
		b5 -= 4;
		System.out.println(b5);
//		b5 = b5 +1;  b5若宣告為int就ok
		
	}

}

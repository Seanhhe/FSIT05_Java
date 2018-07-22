package tw.org.iii.mytest;

public class Brad05 {

	public static void main(String[] args) {
		char c1 = 'a'; //單引號只能包一個字元
		System.out.println(c1);
		char c2 = '資';
		char c3 = 65;    //  0-65535 無正負號範圍
		System.out.println(c3); //印出 ASCII code
		char c4 = '\u0041';
		System.out.println(c4);
		System.out.println(c4);  //0開頭的數字視為八進位, 0X開頭視為16進位
		
		System.out.println(0x41);
		
		int a1 = c1 + 4;
		System.out.println(a1);
	}

}

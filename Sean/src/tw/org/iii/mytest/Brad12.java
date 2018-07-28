package tw.org.iii.mytest;

public class Brad12 {

	public static void main(String[] args) {
//		 char a = 97; //帶入八大型別玩玩看 byte short char int (long float double boolean不可放進switch)
//		 switch (a) {
//		 case 1: System.out.println("A"); break;
//		 case 10: System.out.println("B"); break;
//		 case 'a': System.out.println("a"); break; //a的ASCII碼是97
//		 case '資': System.out.println("A"); break;
//		 default: System.out.println("C"); break;
		String a = "Brad";
		switch (a) {
		case "B": System.out.println("1"); break;
		case "Bradd": System.out.println("10"); break;
		case "Brad": System.out.println("a"); break;
		default: System.out.println("D"); break;
		}
	}
}


/*
 在基本型別中，只有byte, short, char, int, 才能放入switch()中。
 String可以被設定
 */
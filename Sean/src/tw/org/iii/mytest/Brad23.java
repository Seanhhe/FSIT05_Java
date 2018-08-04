package tw.org.iii.mytest;

public class Brad23 {

	public static void main(String[] args) {
		 String s1 = new String();//查API建構式 (交換資料都是用字串)
		 byte[] b2 = {97,98,99,100};
		 String s2 = new String(b2);
		 String s3 = new String(b2,1,2); //擷取部分字串by index
		 System.out.println(s1);
		 System.out.println(s2);
		 System.out.println(s3);
		 
//		 s1 = new String(b2); //s1的字串內容被重新指向，不建議常用
		 String s4 = "Brad"; //單引號只能包一個字元，雙引號可包字串。
		 //起初，在string pool中產生了"Brad"的字串物件實體，然後s4才指向"Brad"。
		 String s5 = "Brad"; //在string pool中找到"Brad"，然後s5指向"Brad"。
		 String s6 = new String(s4);//s6指向記憶體位址並創造物件實體，s6的字串內容等於"Brad"
		 String s7 = new String(s5);
		 
		 int a = 10, b = 10;
		 System.out.println(a == b);
		 System.out.println(s4 == s5); //
		 System.out.println(s4 == s6); //false，因為比的是位址?(不同的物件實體)
		 System.out.println(s6 == s7); //false,位址不同?
		 
		 System.out.println("-----");
		 
		 System.out.println(s4.equals(s5)); //比的是位址內存放的值(是否為相等)
		 System.out.println(s4.equals(s6));
		 System.out.println(s6.equals(s7));
		 System.out.println("--------------------");
		 s4 = s6; //相同物件實體，把s6位址指向給s4
		 System.out.println(s4 == s6);
		 
		 
	}

}

/*
 * 字串物件實體的字串內容就不再會被變更。
 */
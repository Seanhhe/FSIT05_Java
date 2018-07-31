package tw.org.iii.mytest;

public class Brad22 {

	public static void main(String[] args) {
		TWID id1 = new TWID();
		TWID id2 = new TWID(true);
		TWID id3 = new TWID(14);
		TWID id4 = new TWID(false, 17);
		TWID id5 = TWID.createTWId("A123456789");
		System.out.println(id1.getId());
		System.out.println(id2.getId());
		System.out.println(id3.getId());
		System.out.println(id4.getId());
		System.out.println(id5.getId());
		//System.out.println(id5.getId());
		
//		TWID id1 = TWID.createTWId("A123456789");
//		System.out.println(id1 == null);
		
		
//		String a = "A123456789";
//		if (TWID.checkId(a)) {  //正規表示式 維基百科 ; {數字}前物件重複幾次; 身分證檢查
//			System.out.println("OK");
//		}else {
//			System.out.println("XX");
//		} //練習：用正規表示式檢查LOG表內的IP，再加入黑白名單
		
		
		
//		if (TWID.checkId("A123456789")) {
//			System.out.println("OK");
//		}else {
//			System.out.println("XX");
//		}
		
//		TWID.checkId("aaa");
//		 
//		 TWID id1 = new TWID();
//		 id1.m1("aaa");
	}

}

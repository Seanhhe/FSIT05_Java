package tw.org.iii.mytest;

public class Brad25 {

	public static void main(String[] args) {
		 Brad251 b1 = new Brad251(2);
//		 Brad251 b2 = new Brad251();
		 
		 Brad251 b3 = new Brad251(2);
		 System.out.println(b1.equals(b3)); //比字串內容
		 System.out.println(b1 == b3);
		 System.out.println(b1.isSame(b3));
		 
		 
		 
	}

}

class Brad251 {
	private int a;
	Brad251 (int a) {
		//super();永遠在第一道敘述句產生祖宗八代。 要寫，只能選一或二，1.super(其他) 2.this(), 不寫則會預設為super();
		this.a = a;
		System.out.println("Brad251()");
		
	}
	
	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);
		return ((Brad251)obj).getA() == a;
	}
	
}

class Brad252 extends Brad251 { //任何一個類別都要有建構式，沒寫建構式會以父類別沒傳參數的建構式為預設建構式[Object()]
	//不論有無自己的建構式，不會繼承父類別的建構式
	//任何一個物件實體可被使用，則祖宗都會在記憶體中，如此才可override/overload
	Brad252() {
		super(3);
	}
}

//class Brad253 extends Brad253 {
//	
//}
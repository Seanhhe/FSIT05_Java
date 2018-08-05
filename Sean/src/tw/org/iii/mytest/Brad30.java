package tw.org.iii.mytest;

public class Brad30 {

	public static void main(String[] args) {
		 Brad302 obj1 = new Brad302();
		 byte b1 = 2;
		 obj1.m1(b1);
		 Brad301 obj2 = new Brad301();
		 //obj2.m1(1);
		 obj2.m1(1,2,3);
	}

}
class Brad301{
	int m1(int a) {
		System.out.println("A1");
		return 1;
	}
	
	void m1(int a, int b) {
		System.out.println("A2");
	}
	
	void m1(int...as) { //不定個數的參數
		System.out.println("A3");
	}
	
}
class Brad302 extends Brad301 {
	String m1(byte a) {
		System.out.println("B");
		//基本型別下，子分類的override m1參數基本型別要與父類別m1參數基本型別相同
		//物件型別下，子分類的物件型別不同時，兒子要比父親大。(發揚光大)
		//override，將父類別相同的方法名稱及參數類別要依樣，型別要子比父大
		return "a";
	}
	void m1(int[] names) {
		System.out.println("A4");
	}
	
}



/* 
 * 何為override, overload
 * 
class Brad301{
	Object m1() {
		return "Brad";
	}
}
class Brad302 extends Brad301 {
	String m1() { 
		return "";
	}
}
 * 
 * */
 
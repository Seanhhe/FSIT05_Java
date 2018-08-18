
public class Brad70 {

	public static void main(String[] args) {
		int a = 10;
		Integer b = new Integer(10);
		Integer c = new Integer("10");
		Integer d = 10; // auto-boxing 自動封裝
		System.out.println(b + 4);//物件b unWrapper 解包裝 => auto-unboxing，b仍是物件。
		System.out.println(d + 6); 
		
		System.out.println(a == b);
		System.out.println(c == b); //b不同於c。兩者是物件實體在比較
		
		System.out.println(d == a);
		System.out.println("--------");
		System.out.println(b.equals(a));//此時a被自動封裝後才比較其值

	}

}

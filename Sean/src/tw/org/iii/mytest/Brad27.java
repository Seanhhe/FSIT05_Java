package tw.org.iii.mytest;

public class Brad27 {

	public static void main(String[] args) {
		String str1 = "Brad"; //可換成String str1 = new String("Brad");
		System.out.println(str1);
		Brad271 obj1 = new Brad271();
		System.out.println(obj1);
		Brad271 obj2 = new Brad271();//obj2同樣是新的物件實體，不同於obj1，只是肚子裡的內容相同
		System.out.println(obj2);
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));//內容相同，物件實體不同(記憶體位址不同)
	}

}
class Brad271 {
	@Override
	public String toString() {
		return "Brad";
	}
}
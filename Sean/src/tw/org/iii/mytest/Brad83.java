package tw.org.iii.mytest;

public class Brad83 {

	public static void main(String[] args) {
		class Brad831 {
			Brad831(){System.out.println("Brad831()");}
			void m1() {System.out.println("Brad831:m1()");}//實務上少用
		}
		Brad831 obj = new Brad831();//需先定義才能用此行
	}

}

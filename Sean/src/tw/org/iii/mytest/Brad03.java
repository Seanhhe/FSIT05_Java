package tw.org.iii.mytest;

public class Brad03 {

	public static void main(String[] args) {
		float f1 = 1.2f; // 1.2 被視為double, 1.2f就可被接受
		double s1 = 12.3;
		
		f1++;
		System.out.println(f1);
		f1 += 10;
		System.out.println(f1);
		
		long a1 = 10;
		float a2 = a1 + f1; //運算int + float => float
	}

}

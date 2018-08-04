package tw.org.iii.mytest;

public class Brad20 {

	public static void main(String[] args) {
		 //Bike b1 = new Bike(); //類別Bike已建立，此時Bike類別已可使用
		 //System.out.println(b1); //物件b1的值?? tw.org.iii.mytest.Bike@383534aa(@記憶體位址)
		 //System.out.println(b1.speed); //值為0.0
		 
		 
//		 int b = 123; //b的值是123
//		 System.out.println(b);
		 
		 
		 Bike b1 = new Bike();
		 Bike b2 = new Bike();
		 System.out.println(b1.getSpeed());
		 
//		 b1.upSpeed();
//		 b1.upSpeed();
//		 b1.upSpeed();
		 System.out.println(b1.getSpeed());
		 System.out.println(b2.getSpeed());
		 for (int i = 0; b1.getSpeed()<10; i++) {
			 b1.upSpeed();
			 System.out.println(b1.getSpeed());
		 }

	}

}

//--------------------以下的是老師的--------------------------




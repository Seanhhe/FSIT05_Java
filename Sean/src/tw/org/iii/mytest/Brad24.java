package tw.org.iii.mytest;

public class Brad24 {

	public static void main(String[] args) {
		 Bike b1 = new Bike();
		 Scooter s1 = new Scooter();
		 //仍是腳踏車，只是由Scooter製程產生
		 System.out.println(b1.getSpeed());
		 System.out.println(s1.getSpeed());
		 s1.upSpeed();
		 s1.upSpeed();
		 System.out.println(b1.getSpeed());
		 System.out.println(s1.getSpeed());
		 s1.changeGear(3);
		 //Override=>改良父類別，Overload=>超負荷
		 s1.upSpeed();
		 System.out.println(s1.getSpeed());
		 
	}

}

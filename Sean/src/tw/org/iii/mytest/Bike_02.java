package tw.org.iii.mytest;

public class Bike_02 {

	private double speed;
	
	void addSpeed() {
		speed = speed==0?1:speed*1.5;
	}
	
	void slowdownSpeed() {
		speed = speed==0?1:speed*0.5;
	}
	
	double reportSpeed() {
		return speed;
	}
	
	Bike_02() {
		speed = 0;
//		System.out.println("Bike_02()");
	}

}

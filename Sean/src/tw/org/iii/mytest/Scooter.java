package tw.org.iii.mytest;

public class Scooter extends Bike{ 
	/*
	 *宣告Scooter子類別延伸(繼承)Bike父類別。  每個子類別都有個父類別
	 *public class Scooter extends Bike (extend Object) { 不寫等於預設Object為父類別
	 *private 不會繼承給子類別
	 * Bike(){}建構式不繼承給子類別
	 * 
	 */
	private int gear;
	
	void changeGear(int gear) {
		this.gear = gear;
	}
	
	int getGear() {
		return gear;
	}
	
	void upSpeed() { //要override
		super.upSpeed();
	}
	
	double getSpeed() {
		return speed+2;
	}
}

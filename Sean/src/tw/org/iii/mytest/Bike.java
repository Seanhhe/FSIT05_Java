package tw.org.iii.mytest; //執行環境的路徑
//程式會預設載入java.lang，其他需要手動import

public class Bike { //每個*.java程式中，只有一個public class，此行是類別的宣告
					//沒寫public的class只有相同package才能存取。
/*
 * 屬性 Field:代表該類別擁有的屬性(has-a 屬性) (靜態)
 * 	|- 屬性很重要，方法是搭配屬性
 * 
 * 方法 Method:該類別擁有的方法(has-a 方法) (動態)
 * 
 * public, protected, 沒有, private 是關鍵字
 * 
 * 
 */
	private double speed; //加上private把speed屬性封裝起來，再透過方法改變屬性值
	//例如體重80KG，要透過方法(運動、不吃)，才能改體重屬性質
//	 void upSpeed() { //宣告"加速度" 的 "方法" 
//		 speed = speed ==0?1: speed*1.4; //三元運算式
//	 }
	 
	void upSpeed(int gear) { //宣告"加速度" 的 "方法"
		 speed = speed==0?1:speed*gear*1.4; //三元運算式
	 } 
	
	
	 void downSpeed() { //宣告"減速度"的"方法"
		 speed = speed==0?1: speed*0.7; 
	 }
	 
	 double getSpeed() { //宣告"看速度"的"方法"
		 return speed;
	 }
	 
	 //建構式 (屬性+建構式+方法);不會有傳回
	 Bike() { //建構式
		 //進行初始化的動作
//		 System.out.println("Bike()");
		 speed = 0;//初始值0
	 }
	 
	 Bike(double speed) {
		 this.speed = speed; //本類別物件實體的屬性speed
	 }
	 
	 
	 
}

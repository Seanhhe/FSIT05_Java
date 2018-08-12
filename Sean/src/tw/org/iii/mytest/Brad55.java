package tw.org.iii.mytest;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//將物件序列化
public class Brad55 {

	public static void main(String[] args) {
		Bike b1 =new Bike();
		Student s1 = new Student(90, 60, 24, b1);//物件擁有物件
		//所擁有的物件要有實作，才能序列化
		
		s1.bike.upSpeed();s1.bike.upSpeed();
		System.out.println(s1.calSum() + ":" + s1.calAvg());
		
		try(ObjectOutputStream oout = 
				new ObjectOutputStream(
						new FileOutputStream("dir1/brad.object"))){
			oout.writeObject(s1);
			oout.writeObject(b1);
			System.out.println("Save OK");
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}

class Student implements Serializable {//implements實作介面
	transient int ch;// transient用來提示該資料不序列化
	int eng, math;
	Bike bike;
	
	Student(int ch, int eng, int math, Bike bike) {
		this.ch = ch; this.eng = eng; this.math = math;
		this.bike = bike;
	}
	int calSum() {
		return ch + eng + math;
	}
	double calAvg() {
		return calSum()/3.0;
	}
}
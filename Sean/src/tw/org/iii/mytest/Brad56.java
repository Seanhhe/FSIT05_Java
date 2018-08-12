package tw.org.iii.mytest;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
//解序列化
public class Brad56 {

	public static void main(String[] args) {
		
		
		try(ObjectInputStream oin =
				new ObjectInputStream(new FileInputStream("dir1/brad.object"))){
			Object obj = oin.readObject();//從oin.readObject()讀資料已在記憶體中new出物件
			Student s1 = (Student)obj;
			System.out.println(s1.calSum() + ":" + s1.calAvg());
			
			Bike b1 = (Bike)oin.readObject();
			System.out.println(b1.getSpeed());
			System.out.println(s1.bike.getSpeed());
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}

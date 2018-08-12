package tw.org.iii.mytest;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
//解序列化
public class Brad58 {

	public static void main(String[] args) {
		
		
		try(ObjectInputStream oin =
				new ObjectInputStream(new FileInputStream("dir1/brad2.object"))){
			Object obj = oin.readObject();//從oin.readObject()讀資料已在記憶體中new出物件
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}

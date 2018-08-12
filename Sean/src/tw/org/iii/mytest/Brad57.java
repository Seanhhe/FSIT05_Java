package tw.org.iii.mytest;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//將物件序列化
public class Brad57 {

	public static void main(String[] args) {
		Brad573 obj = new Brad573();
		
		try(ObjectOutputStream oout = 
				new ObjectOutputStream(
						new FileOutputStream("dir1/brad2.object"))){
			oout.writeObject(obj);

			System.out.println("Save OK");
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}

class Brad571 {
	Brad571(){System.out.println("Brad571()");}
}
class Brad572 extends Brad571 implements Serializable{
	Brad572(){System.out.println("Brad572()");}
}
class Brad573 extends Brad572 {//若在此代implements Serializable，則父親、祖父則無法解序列化??
	Brad573(){System.out.println("Brad573()");}
}
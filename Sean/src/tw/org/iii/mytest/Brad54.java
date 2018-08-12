package tw.org.iii.mytest;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Brad54 {

	public static void main(String[] args) {
		//建立自動關閉autoclose物件實體
		try (DataInputStream din = 
				new DataInputStream(
						new FileInputStream("dir1/brad.dat"))){
				int stage = din.readInt();
				String username = din.readUTF();//要在Brad53用writeUTF()
				boolean isSound = din.readBoolean();
				System.out.println(stage);
				System.out.println(username);
				System.out.println(isSound);
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}

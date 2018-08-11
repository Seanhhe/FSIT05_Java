package tw.org.iii.mytest;

import java.io.FileInputStream; //專讀非文字檔用途
import java.io.FileNotFoundException;
import java.io.IOException;

public class Brad46 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fin = new FileInputStream("dir1/brad01.txt");
			//int a = fin.read();
			//System.out.println(a);//fileinputstream一次讀一個byte而已，範例內容Hello123
			
			
			//寫法一
//			int temp;
//			do {
//				temp = fin.read();
//				if (temp== -1) {
//					break;
//				}else {
//					System.out.println((char)temp);
//				}
//			}while(true);
			
			//寫法二
//			int temp;
//			while ((temp = fin.read()) != -1) {//先指定，再進行判斷
//				System.out.print((char)temp);
//			}
			
			//檔案分兩種，文字及非文字(binary)。
			
			//寫法三 (讀中文,若兩個中文字中間有數字，則出現亂碼，byte不適合讀文字資料，java支援UNICODE)
			int temp; byte[] b = new byte[3];
			while ((temp = fin.read(b)) != -1) {//先指定，再進行判斷
				System.out.print(new String(b, 0, temp));
			}
			
			
			fin.close();
		}catch(FileNotFoundException fe) {
			
		}catch(IOException fe) {
			
		}

	}

}

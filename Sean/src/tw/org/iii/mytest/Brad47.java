package tw.org.iii.mytest;

import java.io.FileOutputStream;
import java.io.IOException;


public class Brad47 {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("dir1/Brad4.txt",true);//true表append,預設否
			//fout.write("Hello,World".getBytes());//傳回byte[]
			fout.write("1234567\n".getBytes());
			fout.write("1234567\n".getBytes());
			fout.flush();//如果Brad4.txt檔案不在，則創新檔。若檔案存在，則清空再寫入。(是否有寫入權限有差)
			fout.close();
			System.out.println("OK");//看到OK代表前三行程式沒有拋出例外
		}catch(IOException ie) {
			System.out.println(ie);
			
		}

	}

}

/*
 * 01.java.io的class file，不涉及檔案內容的操作，所以沒copy()，檔案的剪下貼上，在同分割區下資料不動，只有指向位置改變，檔案的刪除也是。檔案的複製貼上，是讀到記憶體再寫到新位置。
 * 		renameTo() Brad48
 */

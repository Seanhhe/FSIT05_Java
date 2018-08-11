package tw.org.iii.mytest;

import java.io.File;
import java.io.IOException;

public class Brad45 {

	public static void main(String[] args) {
		//File的類別，有可能是檔案或是目錄
		File f1 = new File("dir1/");
		File f2 = new File("dir2");
		//File f3 = new File("dir3/");//物件可建立，但實體不存在
		File f3 = new File("dir3/dir4/dir5/dir6");//目錄是dir6，前面的是路徑
		File f4 = new File("dir3/dir4/dir5/dir6/file1");//物件實體可產生在記憶體中，實際檔案不一定存在
		if (f1.exists()) {
			System.out.println("f1 exist");
		}
		
		if (f3.exists()) {
			System.out.println("f3 exist");
		}else {
			f3.mkdirs();//建立出f3物件指定的dir6資料夾目錄
		}
		
		if (!f4.exists()) {
			try {
				//API createNewFile類別中有列出判斷可否讀寫執行、是檔案還是目錄、equals
				f4.createNewFile();
			}catch (IOException ie) {
				System.out.println(ie);
			}
		}
		
		File f5 = new File("dir1");
		File f6 = new File("dir2/../dir1");
		File f7 = new File("dir3/dir4/../../dir1");
		File f8 = new File("dir1");
		System.out.println(f5 == f6);
		System.out.println(f5.equals(f6));
		System.out.println(f5.equals(f7));
		
		System.out.println(f6.getAbsolutePath());
		System.out.println(f7.getAbsolutePath());
		System.out.println(f8.getAbsolutePath());
		
		
	}

}

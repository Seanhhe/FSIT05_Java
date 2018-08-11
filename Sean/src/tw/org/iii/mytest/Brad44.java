/*
 * JAVA.IO
 */
package tw.org.iii.mytest;

import java.io.File;

public class Brad44 {

	public static void main(String[] args) {
		System.out.println(File.pathSeparator);//印出path符號; //MAC印出:
		System.out.println(File.separator);//印出路徑符號\ //MAC印出/
		//File dir1 = new File("D:\\eclipse-workspace\\test1"); //建出物件實體
		//File dir1 = new File("D://eclipse-workspace//test1"); //建出物件實體，路徑用// (跨平台用法)
		//D:\eclipse-workspace下建立資料夾test1及dir1
		// 出現NullException (屬於RuntimeException)
		File dir1 = new File("./dir1");//一個點就是本目錄，兩個點是上一層..
		
		System.out.println(dir1.exists());
		//System.out.println(dir1.getAbsolutePath());//取得路徑
		
		File[] roots = File.listRoots();
		for (File root : roots) {
			System.out.println(root.getAbsolutePath());
		}
	}

}

package tw.org.iii.mytest;

import java.io.FileReader;//適用文字資料，把字元抽出時
import java.io.FileWriter;

public class Brad51 {
	/*
	 * for MyEditor.java
	 * 
	 * String a = null;
	 * System.out.println(a);
	 * 
	 * */
	
	
	public static void main(String[] args) {
		try {
		FileReader reader = new FileReader("dir1/brad.txt");
		int v = reader.read();
		System.out.println((char)v);
		v = reader.read();
		System.out.println((char)v);
		v = reader.read();
		System.out.println((char)v);
		reader.close();
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}

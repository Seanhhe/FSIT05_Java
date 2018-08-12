package tw.org.iii.mytest;

import java.io.File;

public class Brad48 {

	public static void main(String[] args) {
		File f1 = new File("dir1/Brad4.txt");
		File f2 = new File("dir2/brad6.txt");
		if (f1.renameTo(f2)) {
			System.out.println("OK");
			
		}else {
			System.out.println("XX");
		}
	}

}
/*
*
*/
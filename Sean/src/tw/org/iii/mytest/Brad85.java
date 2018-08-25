package tw.org.iii.mytest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Brad85 {

	public static void main(String[] args) {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		System.out.println(date);
		//System.out.println(calendar);
		
		//透過java.text中的抽象類別DateFormat或NumberFormat調整輸出格式(透過SimpleDateFormat實作)
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(df.format(date));
		System.out.println(df.format(calendar.getTime()));//calendar透過getTime()轉換出來
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;//java.util class Calendar的MONTH是由0起算，所以中文1月需加1顯示。
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "/" + month + "/" + day);
		
		//calendar.add(Calendar.DATE, 14);//加14天後是幾天
		//calendar.add(Calendar.WEEK_OF_YEAR, 2);//加2周後
		calendar.add(Calendar.WEEK_OF_YEAR, -2);//倒退2周
		System.out.println(df.format(calendar.getTime()));
	}

}

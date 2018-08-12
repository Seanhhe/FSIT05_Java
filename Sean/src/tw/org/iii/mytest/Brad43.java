/*
 * Error at Line:47
 */

package tw.org.iii.mytest;

import java.awt.FontFormatException;
import java.io.IOException;
import java.text.ParseException;

public class Brad43 {

	public static void main(String[] args) {
		Bird b1 = new Bird();
		try {
			b1.setLeg(2);
		}catch(ParseException e) {
			
		}catch(IOException e) {
			
		}


	}

}

class Bird {
	private int leg;
	void setLeg(int leg) throws ParseException, IOException { //宣告拋出throws
		Bird b1 = new Bird();
		if (leg <0) {
			throw new ParseException("XXX",3);/*拋出例外要預先宣告 void setLeg(int leg) throws Exception {} 
			要在public static void main(String[] args) {}中建立try catch結構
			*/
		}else if (leg>2) {
			throw new IOException();
		}else {
			this.leg = leg;
		}
		
	}
}
class BirdV2 extends Bird { //繼承

	//@Override //override的例外宣告，要比爸爸少，要比爸爸小。若把下方的 void setLeg改名為setLegV2，@Override刪除就可編譯
	void setLegV2(int leg) throws ParseException, IOException, FontFormatException{ //即使override也要宣告
		super.setLeg(leg);
		if (leg>1000) {
			throw new FontFormatException("");
		}
	}
//	@Override
//	void setLeg(int leg) throws ParseException, IOException { //即使override也要宣告
//		 
//		super.setLeg(leg);
//	}
}
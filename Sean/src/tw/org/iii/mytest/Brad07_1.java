package tw.org.iii.mytest;

import javax.swing.JOptionPane;

public class Brad07_1 {

	public static void main(String[] args) {
		String strYear = JOptionPane.showInputDialog("input a year"); //建立可輸入字串的對話框
		int year = Integer.parseInt(strYear); //將輸入的年份字串型態轉為int,才能進行數學判斷
		
		if (year % 4 ==0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					//29
				}else {
					//28
				}
			}else {
				//29
			}
		}else {
		}
	}
}

/* 閏年判斷練習，行事曆(萬年曆：google 1752年 萬年曆)
閏年二月?天
不閏年二月?天
Year % 4 == 0 閏
% 100 == 0 不閏
% 400 == 0 閏
*/
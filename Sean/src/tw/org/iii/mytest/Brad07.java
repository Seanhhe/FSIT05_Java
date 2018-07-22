package tw.org.iii.mytest;

public class Brad07 {

	public static void main(String[] args) {
////		 int score = Math.random(); // 應宣告為double
//		 // Math.random() 亂數值為0.0至1.0
//		 // 乘101，再強制轉為int(強制轉型要先運算)
//		 int score = (int)(Math.random()*101); //因為是0至100共101個數
////		 int score = (int)(Math.random()*6)+1; //六個數，外加1是值的範圍位移修正
//		 
//		 System.out.println(score);
//		 if (score >= 60) {
//			 System.out.println("PASS");
//		 }else {
//			 System.out.println("DOWN");
//		 }
//	}
//}
//90分以上A,80分以上B,70分以上C,60分以上D,60以下E
// if else 運用在過濾、或防火牆封包過濾(黑白名單)、AI預測
		int score = (int)(Math.random()*101);

		System.out.println(score);
		if (score >= 90) {
			System.out.println("A");
		}else if (score >= 80) {
			System.out.println("B");
			score = 58; //執行完即跳開，並重新執行
		}else if (score >= 70) {
			System.out.println("C");
		}else if (score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}}}
/* 閏年判斷練習，行事曆(萬年曆：google 1752年 萬年曆)
Year % 4 == 0 閏
% 100 == 0 不閏
% 400 == 0 閏
*/
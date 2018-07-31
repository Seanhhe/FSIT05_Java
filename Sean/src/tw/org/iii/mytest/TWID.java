package tw.org.iii.mytest;

public class TWID { //台灣身分證字號類別
	
		private String id; //封裝後如何產生數字
		static final String letters ="ABCDEFGHJKLMNPQRSTUVXYWZIO";
		
		TWID() { //身分證字號產生器
			this((int)(Math.random()*2)==0);// this() => 呼叫本類別的建構式
		}
		TWID(boolean isMale) {
			this(isMale,(int)(Math.random()*26));
		}
		TWID(int area) { //隨機出現男或女
			this((Math.random()*2)==0,area);
		}
		TWID(boolean isMale, int area) {
			String i1 = letters.substring(area, area+1);
			String i2 = isMale?"1":"2";
//			String newid = i1 +i2 +
//					(int)(Math.random()*10) +
//					(int)(Math.random()*10) +
//					(int)(Math.random()*10) +
//					(int)(Math.random()*10) +
//					(int)(Math.random()*10) +
//					(int)(Math.random()*10) +
//					(int)(Math.random()*10) ;
					
			String newid = i1.concat(i2) // 不可在此行加上;
					.concat(String.valueOf((int)(Math.random()*10)))
					.concat(String.valueOf((int)(Math.random()*10)))
					.concat(String.valueOf((int)(Math.random()*10)))
					.concat(String.valueOf((int)(Math.random()*10)))
					.concat(String.valueOf((int)(Math.random()*10)))
					.concat(String.valueOf((int)(Math.random()*10)))
					.concat(String.valueOf((int)(Math.random()*10)));
			for (int i =0; i<=9; i++) {
				if (checkId(newid+i)) {
					this.id = newid + i;
					break;
				}
			}		
		}
		
		//以下是類別的設計
		private TWID(String id) { //最後才加上private
			this.id = id;
		}
		static TWID createTWId(String id) {
			if (checkId(id)) {
				return new TWID(id);
			}else {
				return null;
			}
		}
		
		//先檢查字串長度為10，首字英文，次字1或2，第三碼後全是數字。
		static boolean checkId(String id) { //冠上static，是屬於類別TWID的。是分類上的需求與物件無關。
			boolean isRight = false;
			if (id.matches("^[A-Z][12][0-9]{8}$")) {
//				String letters ="ABCDEFGHJKLMNPQRSTUVXYWZIO";
				int n12 = letters.indexOf(id.charAt(0)) +10;
				int n1 = n12 / 10;
				int n2 = n12 % 10;
				int n3 = Integer.parseInt(id.substring(1, 2));
				int n4 = Integer.parseInt(id.substring(2, 3));
				int n5 = Integer.parseInt(id.substring(3, 4));
				int n6 = Integer.parseInt(id.substring(4, 5));
				int n7 = Integer.parseInt(id.substring(5, 6));
				int n8 = Integer.parseInt(id.substring(6, 7));
				int n9 = Integer.parseInt(id.substring(7, 8));
				int n10 = Integer.parseInt(id.substring(8, 9));
				int n11 = Integer.parseInt(id.substring(9, 10));
				int sum = n1*1 + n2*9 + n3*8 + n4*7 + n5*6 + n6*5 + 
						n7*4 + n8*3 + n9*2 + n10*1;
				
			}
			return isRight;
		}
		
		String getId() {return id;}
		
		boolean isMale() {
			return true;
		}
		
		String getArea() {
			return "台中市";
		}
//			m1(id); 此static區塊不會有其他物件存在
//			return true;
		
//		boolean m1(String id) {
//			System.out.println("m1 OK");
//			return true;
		}
/*
 * API查
 * static String, 
 * 
 * 
 */
	



package tw.org.iii.mytest;

public class Brad10 {

	public static void main(String[] args) {
		int month = (int)(Math.random()*12)+1;
		switch (month) { //括號內為數值，對應到下方的case數值，從上到下逐一比對
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println("31");
				break;//break表示提早離開，若無break敘述句，則會執行到區塊結束
			case 2: 
				System.out.println("28");
				break;
			case 4: case 6: case 9: case 11:
				System.out.println("30");
				break;
			default:
				System.out.println("D");
				break;
		}

	}

} // 挑戰題：萬年曆

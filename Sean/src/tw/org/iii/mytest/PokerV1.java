/*
 * 洗牌不重複
 */

package tw.org.iii.mytest;

public class PokerV1 {

	public static void main(String[] args) {
		int[] poker = new int[52]; //宣告52張牌
		for (int i=0; i<poker.length; i++) {
			int temp = (int)(Math.random()*52);//亂數產生洗牌
			
			//檢查機制，沒過就重做
			boolean isRepeat = false;
			for (int j=0; j<i; j++) {
				if (poker[j] == temp) {
					isRepeat = true;
					break;
				}
			}
			
			if (!isRepeat) {
				poker[i] = temp;
				System.out.println(poker[i]);
			}else {
				i--;
			}
			
		}
		
	}

}

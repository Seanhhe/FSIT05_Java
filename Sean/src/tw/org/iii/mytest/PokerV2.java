/*
 * 洗牌不重複
 */

package tw.org.iii.mytest;

public class PokerV2 {

	public static void main(String[] args) {
		int[] poker = new int[52]; //宣告52張牌
		boolean isRepeat; //變動處
		int temp; //變動處
		for (int i=0; i<poker.length; i++) {
			
			//以下為變動處
			
			do {
				temp = (int)(Math.random()*52);//亂數產生洗牌
				
				//檢查機制，沒過就重做
				isRepeat = false;
				for (int j=0; j<i; j++) {
					if (poker[j] == temp) {
						isRepeat = true;
						break;
					}
				}
			}while(isRepeat); 
			//以上為變動處
			
			if (!isRepeat) {
				poker[i] = temp;
				System.out.println(poker[i]);
			}else {
				i--;
			}
			
		}
		
	}

}
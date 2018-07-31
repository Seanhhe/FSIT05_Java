/*
 * 洗牌不重複
 */

package tw.org.iii.mytest;

import java.util.Arrays;

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
			poker[i] = temp;
			//System.out.println(poker[i]);
			//以上為變動處
						
		}
		System.out.println("------------");
		int[][] players = new int[4][13];
		for (int i=0; i<poker.length; i++) {
//			players[?][?] = poker[i];
			players[i%4][i/4] = poker[i];
		}
		
		//驗算
		//驗算第N家  players[N]
//		for (int v : players[0]) {
//			System.out.println(v);
//		}
		
		//區分牌面黑桃、紅心、方塊、梅花 & A到JQK
		//餘數定理分組		
		String[] suits = {"黑桃","紅心","方塊","梅花"};
		String[] values = {"A ", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 "
				, "9 ", "10 ", "J ", "Q ", "K "};

		for (int[] player: players) {  //int[] player需要被排序
			Arrays.sort(player); //查JAVA API 的java.util (packages),的Arrays, 的sort
			for (int card : player) {
				System.out.print(suits[card/13] + values[card%13] +" ");
			}
			System.out.println();
		}
		
		//四家全驗算
//		for (int[] player: players) {
//			for (int card : player) {
//				System.out.print(card + " ");
//			}
//			System.out.println();
//		}

		
		
	}

}
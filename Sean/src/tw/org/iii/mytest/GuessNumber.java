package tw.org.iii.mytest;
/*
 * 01.先看public static void main(String[] args) {
		 new GuessNumber();
 * 02.再看繼承、匯入
 * 03.
 */
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class GuessNumber extends JFrame{
	
	private JButton guess;
	private JTextField input;
	private JTextArea hist;
	private String answer = createAnswer();
	private int counter;
			
	public GuessNumber() {
		super("猜數字遊戲");
		
		//擁有物件實體
		guess = new JButton("猜");
		input = new JTextField();
		hist = new JTextArea(); //輸入歷史
		input.setFont(new Font("Default", Font.PLAIN, 24));
		hist.setFont(new Font("Default", Font.BOLD + Font.ITALIC, 32));
		
		//產生視窗
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//版面配置，在JFrame找 BoderLayout
		setLayout(new BorderLayout());
		add(hist, BorderLayout.CENTER); //歷史紀錄區域
		//右邊的權重高於中間
		JPanel top = new JPanel(new BorderLayout());// JPanel(LayoutManager)
		top.add(guess, BorderLayout.EAST);//top要裝東西
		top.add(input, BorderLayout.CENTER);
		
		//最後把top裝進視窗
		add(top, BorderLayout.NORTH);
		
		//新增動作聆聽者("猜")    聽事件有無觸發
		guess.addActionListener(new ActionListener() { //需要new一個聆聽物件( ac+/就會自動打出程式 )
			@Override
			public void actionPerformed(ActionEvent e) {
				 doGuess();
				
			}
		}); 
		
	}
	
	
	//寫成方法
	void doGuess() {
		counter++;
		String result = checkAB(); //檢查幾A幾B
		hist.append(input.getText() + " => " + result + "\n"); //秀結果 \n換行
		input.setText("");//把輸入區域清空
				
		if (result.equals("3A0B")) { //equals比對字串
			JOptionPane.showMessageDialog(null, "恭喜老爺，賀喜夫人"); //null等於父元件
		}else if (counter == 10) {
			JOptionPane.showMessageDialog(null, "Loser : " + answer);
		}//猜錯十次給答案
		// 至27行，設定全域變數 private int counter
		
		
		
		
	}
	
	
//	String checkAB() {
//		String guess = input.getText();
//		
//		//AB判斷邏輯實現
//		int a, b; a = b = 0;//AB紀錄表的初始化
//		for (int i=0; i<guess.length(); i++) {
//			if (guess中的第i碼 == answer中的第i碼) {
//				a++;
//			}else if(guess中的第i碼存在於a中) {
//				b++;
//			}
//		}
//		
//		
//		
//		return a + "A" + b + "B";
//	}
	String checkAB() {
		String guess = input.getText();
		
		//AB判斷邏輯實現
		int a, b; a = b = 0;//AB紀錄表的初始化
		for (int i=0; i<guess.length(); i++) {
			if (guess.charAt(i) == answer.charAt(i)) {
				a++;
			}else if(answer.indexOf(guess.charAt(i)) != -1) {
				b++;
			}
		}
			
		return a + "A" + b + "B";
	}
	
	
	
	
	
	
	String createAnswer() {
		//以下取自PokerV2.java
		int[] poker = new int[10]; //宣告52張牌
		boolean isRepeat; //變動處
		int temp; //變動處
		for (int i=0; i<poker.length; i++) {
			
			do {
				temp = (int)(Math.random()*10);//亂數產生洗牌
				
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
		
		}
		//以上取自PokerV2.java
		return "417";
	}
	
	
	public static void main(String[] args) {
		 new GuessNumber();

	}

}

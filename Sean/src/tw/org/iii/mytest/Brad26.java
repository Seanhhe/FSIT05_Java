package tw.org.iii.mytest;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Brad26 extends JFrame{
	private JButton b1, b2;//擁有按鈕屬性
	public Brad26() {
		super("我的視窗");//視窗標題"我的視窗"
		
		b1 = new JButton("B1");
		b2 = new JButton("B2");
		
		setLayout(new FlowLayout(FlowLayout.CENTER)); //符合規格的介面
		add(b1);//把JButton加入JFrame中
		add(b2);
		//進階
//		b1.addActionListener(new ActionListener()) {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("OK");
//			}
//		});
		
		//進階
		
		
//		b1.setLocation(100, 100);
//		b1.setSize(50, 60);
//		b1.setVisible(true);
//		
		
		//System.out.println("Brad");
		//接下來要初始化視窗，在API javax.swing.JFrame中找 setSize
		setSize(640, 480);
		setVisible(true);//setVisible，在API java.awt.Window中找到。 視窗關掉，該物件實體仍在執行中
		setDefaultCloseOperation(EXIT_ON_CLOSE);//setDefaultCloseOperation，在API javax.swing.JFrame中找到
		
		
	}
	
	public static void main(String[] args) {
		 //希望自己類別執行一個視窗程式
		/*Brad26 obj = */
		new Brad26();
		
		
	}

}

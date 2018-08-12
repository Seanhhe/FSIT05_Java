/*
 * 建構式沒有在繼承的
 * 建構式目的：
 * 1.物件初始化
 * 2.確保祖宗八代都載入記憶體中
 * 類別是在設計物件的藍圖
 */

package tw.org.iii.mytest;

import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.event.MouseEvent;

public class MyPanelV2 extends MyPanel {
	public MyPanelV2() {
		//super(); 並無載入addMouseListener
		//super(100, 100);
		addMouseListener(new MyMouseListener()); //使用內部類別(new出來)
	}
	
	//類別中的類別 (內部類別)
	class MyMouseListener implements MouseListener {
	
	//以下@Override的方法敘述數量需完整，數量不足則不能編譯	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("B");
		color = Color.gray;
		repaint();
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	}
}

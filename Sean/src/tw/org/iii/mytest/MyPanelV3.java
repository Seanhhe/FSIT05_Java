package tw.org.iii.mytest;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyPanelV3 extends MyPanel {
	public MyPanelV3() {
		// 自動載入super();
		addMouseListener(new MyMouseListener());
	}
	
	// MyPanelV3 object has-a Inner class
	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			//super.mouseClicked(e);
		}
	}
}

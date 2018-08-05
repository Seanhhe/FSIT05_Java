package tw.org.iii.mytest;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	public MyPanel() {
		System.out.println("MyPanel()");
		//用interface或windowadapter，做出滑鼠點到視窗會隨機劃出圓
		addMouseListener(new MouseListener) {
			
		}
	}


	
	@Override
	protected void paintComponent(Graphics g) { //Graphic有傳回值，不用new
		super.paintComponent(g);
		System.out.println("paint");
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.RED);
		g2d.fillOval((int)(Math.random()*400), (int)(Math.random()*400), 80, 80);
		
	}
	
}

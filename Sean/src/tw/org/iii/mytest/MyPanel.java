/*
 * 找Brad381
 */

package tw.org.iii.mytest;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class MyPanel extends JPanel implements MouseListener{
	private int x, y;
	Color color; //讓子類別也可存取
	
	public MyPanel() {
		//無傳參數建構式
	}
	public MyPanel(int x, int y) {
//		System.out.println("MyPanel()");
		//用interface或windowadapter，做出滑鼠點到視窗會隨機劃出圓
		this.x = x; this.y = y;
		color = Color.RED;
		addMouseListener(this);
	}

//	@Override
//	//	public void paint(Graphics g) {
//	public void paint(Graphics g) {
//		super.paint(g);
//		System.out.println("paint");
//	}
	
	@Override
	protected void paintComponent(Graphics g) { //Graphic有傳回值，不用new
		super.paintComponent(g);
		System.out.println("paintComponent");
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.RED);
		g2d.fillOval(x, y, 80, 80);
//		g2d.fillOval((int)(Math.random()*400), (int)(Math.random()*400), 80, 80);
		
	
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("A");
		x = e.getX()-40; y = e.getY()-40;
		repaint();
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
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

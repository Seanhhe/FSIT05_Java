package tw.org.iii.mytest;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.Serializable;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class MyView extends JPanel {
	//05.
	private MyMouseListener mouseListener = new MyMouseListener();
	//08.
//	private LinkedList<MyPoint> line = new LinkedList<>();
	//13.把08改成
	private LinkedList<LinkedList<MyPoint>> lines = new LinkedList<>();
	//19.
	private LinkedList<LinkedList<MyPoint>> recycle = new LinkedList<>();
	
	public MyView() {
		//01.
		setBackground(Color.YELLOW);
		//03.
		addMouseListener(mouseListener);
		//06.
		addMouseMotionListener(mouseListener);
		
	}
	
	// 02.alt+/選paintcomponent
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setStroke(new BasicStroke(4));
		g2d.setColor(Color.BLUE);
		g2d.drawLine(0, 0, 100, 100);//02.=>12.
		
		//17. for-each 把12入
		for (LinkedList<MyPoint> line : lines) {
			//12.
			for (int i=1; i<line.size();) {
				MyPoint p0 = line.get(i-1);
				MyPoint p1 = line.get(i);
				g2d.drawLine(p0.x, p0.y, p1.x, p1.y);
			}
		
		}
	}
		//12.
//		for (int i=1; i<line.size();) {
//			MyPoint p0 = line.get(i-1);
//			MyPoint p1 = line.get(i);
//			g2d.drawLine(p0.x, p0.y, p1.x, p1.y);
//		}
	
	
		public void saveJPEG() {
			BufferedImage paintImage = 
				new BufferedImage(
					getWidth(), getHeight(), 
					BufferedImage.TYPE_3BYTE_BGR);
			Graphics2D graphics2D = paintImage.createGraphics();
		    paint(graphics2D);
			try {
				ImageIO.write(paintImage, "jpeg", new File("dir1/brad1.jpeg"));
			}catch(Exception e) {
				
			}
			
		}
	
		//18.
		public void clear() {
			lines.clear();
			repaint();
		}
		
		//20.
		public void undo() {
			if (lines.size()>0) {
				recycle.add(lines.removeLast());
				repaint();
			}
		}
		
		//21.
		public void redo() {
			if (recycle.size()>0) {
				lines.add(recycle.removeLast());
				repaint();
				
			}
		}
		
		
		
	}
	
	// 04.
	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
//			附屬於04.
//			super.mousePressed(e);
//			System.out.println("1");
			
			//14.
			LinkedList<MyPoint> line = new LinkedList<>();
			
			//10.
			MyPoint point = new MyPoint(e.getX(),e.getY());
			line.add(point);
			
			//15.
			lines.add(line);
			recycle.clear();
			
		}
//		@Override
//		public void mouseMoved(MouseEvent e) {
//			super.mouseMoved(e);
//			System.out.println("2");
//		}
		@Override
		public void mouseDragged(MouseEvent e) {
//			附屬於04.
//			super.mouseDragged(e);
//			System.out.println("2");
						
			//11.
			MyPoint point = new MyPoint(e.getX(),e.getY());
			
			//16時被取消11.
			//Line.add(point);
			
			//16.
			lines.getLast().add(point);
			
			repaint();
		}
		
	}
	
	//07.
	private class MyPoint implements Serializable {
		int x, y;
		//09.
		public MyPoint(int x, int y) {this.x = x ; this.y = y;}
	}
	
}
	


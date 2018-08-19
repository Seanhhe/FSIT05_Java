package tw.org.iii.mytest;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyGame extends JFrame {
	private GamePanel gPanel;
	
	public MyGame() {
		setLayout(new BorderLayout());
		
		gPanel = new GamePanel();
		add(gPanel, BorderLayout.CENTER);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private class GamePanel extends JPanel {
		private BufferedImage ball;
		private int viewW, viewH, ballW, ballH;
		private Timer timer;
		private LinkedList<BallTask> balls = new LinkedList<>();
		
		public GamePanel () {
			
			timer = new Timer();
			try {
				ball = ImageIO.read(new File("dir1/ball.png"));
				ballW = ball.getWidth(); ballH = ball.getHeight();
				
			}catch(IOException e) {
				System.out.println(e);
			}
			
			addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					super.mouseClicked(e);
					addBall(e.getX()-(int)(ballW/2f), e.getY()-(int)(ballW/2f));
				}
			});
			
			timer.schedule(new ViewTask(), 0, 33);//獨立更新畫面
			
		}
		
		private void addBall(int x, int y) {
			BallTask ballTask = new BallTask(x, y);
			timer.schedule(ballTask, 500, 60);
			balls.add(ballTask);
		}
		
		private class ViewTask extends TimerTask {//畫面引擎
			@Override
			public void run() {
				repaint();
			}
		}
		
		
		//類別中的類別中的類別(三層)
		private class BallTask extends TimerTask{
			int x, y, dx, dy;
			BallTask(int x, int y){
				this.x = x; this.y = y;
				dx = dy = 8;
			}
			@Override
			public void run() {
				if (x<0 || x+ballW > viewW) {
					dx *= -1;
				}
				if (y<0 || y+ballH > viewH) {
					dy *= -1;
				}
				
				x += dx;
				y += dy;
				//repaint();另有周期更新畫面的程式在外
			}
			
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D)g;
			viewW = getWidth(); viewH = getHeight();
			
			for (BallTask ball : balls) {
				g2d.drawImage(this.ball, ball.x, ball.y, null);
			}
		}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyGame();
	}

}

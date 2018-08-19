package tw.org.iii.mytest;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class MySign extends JFrame {
	//03.
	private JButton clear, undo;
	//04.
	private MyView myView;
	
	public MySign() {
		super("簽名");
		
		//02.
		setLayout(new BorderLayout());
		//03.
		JPanel top = new JPanel(new FlowLayout());
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		top.add(clear); top.add(undo);
		add(top, BorderLayout.NORTH);
		
		//04.
		myView = new MyView();
		add(myView, BorderLayout.CENTER);
		
		//05.
		clear.addActionListener(new ActionListener() {
			
			
		});
		
		// 01.
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void saveJPEG() {
		BufferedImage imagebuf = null;
		
		try {
			
		}catch(AWTException e1) {
			
		}
		
		try {
		
			ImageIO.write(imagebuf, "jpeg", new File("dir1/save1.jpeg"));
		
		}catch (AWTException e1) {
			
		}
	}
	
	private void saveObject() {
		LinkedList<LinkedList<MyPoint>> lines = myView.getLines();
		try {
			ObjectOutputStream oout = 
					new ObjectOutputStream(
							new FileOutputStream("dir1/brad.obj"));
			oout.writeObject(lines);
			oout.flush();
			oout.close();
			JOptionPane.showMessageDialog(this, "Save OK");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		new MySign();
	}

}

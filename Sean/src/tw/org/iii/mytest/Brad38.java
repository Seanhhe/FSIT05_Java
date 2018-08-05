/*
 * java.awt.event
Interface WindowListener

 */

package tw.org.iii.mytest;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;


public class Brad38 extends JFrame {
	private MyPanel myPanel;
	
	public Brad38() {
		
		addWindowListener(new MyListener());
		
		setSize(640, 480);
		setVisible(true);
		
		setLayout(new BorderLayout());
		myPanel = new MyPanel();
		add(myPanel, BorderLayout.CENTER);
		
	}
	
	public static void main(String[] args) {
		new Brad38();
	}

}
class MyListener extends WindowAdapter {
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0); //command line return value; 0 => normal; non-zero => error
	}
}	
//class MyWindowListener implements WindowListener {
//
//	@Override
//	public void windowOpened(WindowEvent e) {
//		System.out.println("opened");
//	}
//
//	@Override
//	public void windowClosing(WindowEvent e) {
//		System.out.println("closing");
//		System.exit(0); //command line return value; 0 => normal; non-zero => error
//	}
//
//	@Override
//	public void windowClosed(WindowEvent e) {
//		System.out.println("closed");
//	}
//
//	@Override
//	public void windowIconified(WindowEvent e) {
//		
//	}
//
//	@Override
//	public void windowDeiconified(WindowEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void windowActivated(WindowEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void windowDeactivated(WindowEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}

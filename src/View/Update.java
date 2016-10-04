/**
 * 
 */
package View;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 * @author Dan
 *
 */
public class Update extends JFrame implements Runnable{
	
	private JProgressBar updateBar;
	private final static Random generator = new Random();
	private int value=0;

	/**
	 * 
	 */
	public Update() {
		// TODO Auto-generated constructor stub
		super("Software Update");
		
		JPanel updatePanel = new JPanel();
		updatePanel.add(updateBar = new JProgressBar());
		this.getContentPane().add(updatePanel);
	
}
	
	public void run(){
		JOptionPane.showMessageDialog(null, "Dialing Server for Software Update", "Software Update", 0);
		
		//add to panel updateBar = new JProgressBar();
		
		for(int t=0; t<100; t++){
			value++;
			updateBar.setValue(value);
			try {
				Thread.sleep(generator.nextInt(300));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

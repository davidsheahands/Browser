/**
 * 
 */
package View;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Dan
 *
 */
public class TestFrame extends JFrame{

	/**
	 * 
	 */
	public TestFrame() {
		// TODO Auto-generated constructor stub
		

	}

	
	public void paintComponent(Graphics g){
		super.paintComponents(g);
		ImageIcon picture = new ImageIcon("../../Res/DS.png");
		Image image = picture.getImage();
		Image newImage = image.getScaledInstance(1500, 1000, Image.SCALE_SMOOTH);
		g.drawImage(newImage, 0, 0, this);
	}
}

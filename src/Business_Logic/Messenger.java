/**
 * 
 */
package Business_Logic;

import java.awt.BorderLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import view.My_Window.ClickHandler;

/**
 * @author Dan
 *
 */
public class Messenger extends JPanel {

	/**
	 * 
	 */
	public Messenger() {
		// TODO Auto-generated constructor stub
		
	      JPanel messenger = new JPanel();
	        //default flowlayout
	      messenger.setLayout((LayoutManager) new BorderLayout());
	      
	        JLabel fileTitle = new JLabel("Messenger");
	        JTextField test = new JTextField("tester");
	       
	        messenger.add(test, BorderLayout.NORTH);
	        messenger.add(fileTitle, BorderLayout.SOUTH);
	       // messenger.add(new Server());
	       messenger.add(new Client("127.0.0.1"));
	        

	        
	       
	        
	    }
	}



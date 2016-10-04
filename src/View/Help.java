/**
 * 
 */
package View;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @author Dan
 *
 */
public class Help extends JFrame {

	private JMenuBar menuBar;
	private JMenu menuHelp;
	
	private ArrayList<String> JMenuHelpNames = new ArrayList<String>();
	private ArrayList<JMenuItem> JMenuHelpItems = new ArrayList<JMenuItem>();
	private JPanel mainPanel;
	/**
	 * 
	 */
	public Help(String title) {
		// TODO Auto-generated constructor stub
		
		super(title);
		
		menuBar = new JMenuBar();
		
		ClickHandler handler = new ClickHandler();
		
		JMenuHelpNames.add("section_1");
		JMenuHelpNames.add("section_2");
		JMenuHelpNames.add("section_3");
		
        menuHelp = new JMenu("Sections");
       
       
        for (int i=0; i<JMenuHelpNames.size(); i++){
        	JMenuHelpItems.add(i, new JMenuItem(JMenuHelpNames.get(i)));
        	JMenuHelpItems.get(i).addActionListener(handler);
       	menuHelp.add(JMenuHelpItems.get(i));
       }
       
       menuBar.add(menuHelp);
  
       this.setJMenuBar(menuBar);


		this.getContentPane().add(createMainPanel(), BorderLayout.CENTER);
	}
	
	private JPanel createMainPanel(){
		
		mainPanel = new JPanel();
		
		JTextArea myText = new JTextArea();
		myText.append("There is a constructer that lets you specify a file to load into this");
		mainPanel.add(myText);
		
		return mainPanel;
	}
	
	
	public class ClickHandler implements ActionListener{
		
		public void actionPerformed ( ActionEvent event )
		{}
		
	}

}

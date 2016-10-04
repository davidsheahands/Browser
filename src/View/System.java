/**
 * 
 */
package View;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 * @author Dan
 *
 */
public class System extends JFrame {
	
	private UIManager.LookAndFeelInfo[] looks;
	private String[] lookNames;
	private JRadioButton[] radio;
	private ClickHandler handler;
	private ItemHandler radioHandler;
	
	private JLabel label;

	/**
	 * 
	 */
	public System() {
		// TODO Auto-generated constructor stub
		
		
		JTabbedPane tabbedPane = new JTabbedPane();
		
		handler = new ClickHandler();
		radioHandler = new ItemHandler();
		
		JPanel panel2 = new JPanel();
		JSlider theSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 20);
		theSlider.setMajorTickSpacing(10);
		theSlider.setPaintTicks(true);
		panel2.add(theSlider);
		
		JPanel panel3 = new JPanel();
		
		tabbedPane.addTab("Display", null, createPanel1());
		tabbedPane.addTab("tab two", null, panel2);
		tabbedPane.addTab("tab three", null, panel3);
		
		this.getContentPane().add(tabbedPane);
		this.setVisible(true);
		

	}
	
	public JPanel createPanel1(){
		JPanel panel1 = new JPanel();
		panel1.setLayout(new BorderLayout());
		panel1.add(label = new JLabel("To Change the Look & Feel Click Below"), BorderLayout.NORTH);
		
		label.setHorizontalAlignment(this.getWidth()/2);
		
		JPanel panelRadio = new JPanel();
		
		ButtonGroup lookAndFeelGroup = new ButtonGroup();
		looks = UIManager.getInstalledLookAndFeels();
		lookNames = new String[looks.length];
		radio = new JRadioButton[looks.length];
		
		for (int i=0; i<looks.length; i++){
			lookNames[i] = looks[i].getName();
		}
		
		for (int count = 0; count < radio.length; count++)
		{
			radio[count] = new JRadioButton(lookNames[count]);
			radio[count].addItemListener(radioHandler);
			lookAndFeelGroup.add(radio[count]);
			panelRadio.add(radio[count]);
			}
		panel1.add(panelRadio, BorderLayout.CENTER);
		
		return panel1;
	}

private void changeTheLookAndFeel(int value){
	try
	{
		UIManager.setLookAndFeel(looks[value].getClassName());
		SwingUtilities.updateComponentTreeUI(this);
	}
	catch(Exception exception)
	{
		exception.printStackTrace();
	}
}

	
private class ItemHandler implements ItemListener
{
	public void itemStateChanged(ItemEvent event)
	{
		for(int count=0; count<radio.length; count++)
		{
			if(radio[count].isSelected())
			{
				label.setText(String.format("This is a %s look-and-feel", lookNames[count]));
				changeTheLookAndFeel(count);
			}
		}
	}

}

public class ClickHandler implements ActionListener{
		
		public void actionPerformed ( ActionEvent event )
		{}
		
	}
}

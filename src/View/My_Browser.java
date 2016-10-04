/**
 * 
 */
package View;

import java.awt.BorderLayout;
import java.awt.LayoutManager;
import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Business_Logic.ReadServerFile;
import View.My_Window.ClickHandler;

/**
 * @author Dan
 *
 */
public class My_Browser extends JFrame {

	private JPanel entertainmentPanel;





	/**
	 * 
	 */
	public My_Browser(String title){
		// TODO Auto-generated constructor stub
		
		super(title);
		
			JMenuBar myBar = new JMenuBar();
		    setJMenuBar(myBar);
	        JMenu menuFile = new JMenu("File");
	        JMenuItem menuItemOpen = new JMenuItem("Open");
	        
	        BrowserClickHandler handler = new BrowserClickHandler();
	        menuItemOpen.addActionListener(handler);
	        
	    	
		    	  
		 			
	        
	        menuFile.add(menuItemOpen);
	        myBar.add(menuFile);
	        
	        
		
		
		this.getContentPane().add(new ReadServerFile());
		/*JPanel theBrowser = new JPanel();
		theBrowser.add(new JButton("press"));
		theBrowser.setVisible(true);
		this.getContentPane().add(theBrowser);*/
	}
	
	
	
/*
	
	private JPanel createEntertainmentHubPanel(){
    	this.entertainmentPanel = new JPanel();
        this.entertainmentPanel.setLayout((LayoutManager) new BorderLayout());
        
        //myBrowser = new ReadServerFile();
        
        //entertainmentPanel.add(myBrowser);
        
        entertainmentPanel.setVisible(true);
        
        return entertainmentPanel;
    }

*/







public class BrowserClickHandler implements ActionListener{

	JFrame outerFrame = (JFrame)getRootPane().getParent();
	
    private File fileName = new File("help.txt");

//Controller controller = new Controller();
//JFrame outerFrame = (JFrame)getRootPane().getParent();

public void actionPerformed ( ActionEvent event )
{
	
	JOptionPane.showMessageDialog(outerFrame,  
			String.format("You Pressed: %s", event.getActionCommand()));
	
	JFileChooser fileChooser;
	switch(event.getActionCommand()){
	
	
	
	case "Open":
		
		
		 /*JOptionPane.showMessageDialog(My_Window.this, "Invalid Name", "Invalid Name", JOptionPane.ERROR_MESSAGE);*/
    	   fileChooser = new JFileChooser();
    	   
    	   int result = fileChooser.showOpenDialog(outerFrame);
    	   
    	   if (result == JFileChooser.CANCEL_OPTION)
    		  // fileChooser.cancelSelection();
    	   
    	   fileName = fileChooser.getSelectedFile();
    	   
    	   if((fileName == null)  || (fileName.getName().equals("")))
    	   {
    		   JOptionPane.showMessageDialog(outerFrame, "Invalid Name", "Invalid Name", JOptionPane.ERROR_MESSAGE);
    		   
    		  
    		   
    		   
    	   }
     	 
    	   String PUTthisINTObrowser = fileName.getAbsolutePath();
    	   
   		JOptionPane.showMessageDialog(outerFrame, 
				String.format("location is:" + PUTthisINTObrowser));
   		
   		
   		
		break;
	 case "Browser": 
    	  
		    My_Browser browse = new My_Browser("David's Browser View");
		    browse.setVisible(true);
		    browse.setSize(outerFrame.getWidth(),outerFrame.getHeight());
    	   
           //Controller.getInstance().setPickPanelB("server");
    	   
    	   //Controller.getInstance().reLoadView();
			
    	   //controller.getInstance().pickPanelB = "server";
			
			//JOptionPane.showMessageDialog(My_Window.this,  
					//String.format("panelIs:"+controller.getInstance().pickPanelB,controller.getInstance().pickPanelB));

			
			
			/*pickPanelB = "server";
			outerFrame.setVisible(false);
			outerFrame.setVisible(true); */

			break;

	case "Other": 
	   
		
		My_Window tool = new My_Window("David's Window View");
		tool.setVisible(true);
		tool.setSize(outerFrame.getWidth(),outerFrame.getHeight());
	   
	  /* pickPanel.put("face", false);
       pickPanel.put("server", false);
       pickPanel.put("traffic", false);
       pickPanel.put("stream", false);   */
	   
	   
	   //Controller.getInstance().setPickPanelB("face");
	   
	   //Controller.getInstance().reLoadView();
		
		//controller.getInstance().faceRecognition(outerFrame);
		
					
		//pickPanel = "face";
		
		//controller.getInstance().pickPanelB = "face";
		
		//JOptionPane.showMessageDialog(My_Window.this,  
				//String.format("panelIs:"+controller.getInstance().pickPanelB,controller.getInstance().pickPanelB));

		
		//outerFrame.setVisible(false);
		//outerFrame.setVisible(true);

		break;
  		case "Traffic Application": 
		
		//controller.getInstance().traffic(outerFrame);
		
        //controller.getInstance().pickPanelB = "traffic";
		
		//Controller.getInstance().setPickPanelB("traffic");
    	   
    	   //Controller.getInstance().reLoadView();
		
		//JOptionPane.showMessageDialog(My_Window.this,  
				//String.format("panelIs:"+controller.getInstance().pickPanelB,controller.getInstance().pickPanelB));

		
		
		/*pickPanelB = "traffic";
		outerFrame.setVisible(false);
		outerFrame.setVisible(true); */

		break;
    case "Entertainment Hub": 
		
    	//Controller.getInstance().setPickPanelB("entertainment");
 	   
 	   // Controller.getInstance().reLoadView();
		
		/*pickPanelB = "entertainment";
		outerFrame.setVisible(false);
		outerFrame.setVisible(true);*/

		break;	
		
        case "Stream Data": 
		
		//controller.getInstance().faceRecognition(outerFrame);
		
					
		//pickPanelB = "stream";
        	
        	
        	//Controller.getInstance().setPickPanelB("stream");
     	   
     	   //Controller.getInstance().reLoadView();
		
		//controller.getInstance().pickPanelB = "stream";
		
		//JOptionPane.showMessageDialog(My_Window.this,  
				//String.format("panelIs:"+controller.getInstance().pickPanelB,controller.getInstance().pickPanelB));

		/*
		outerFrame.setVisible(false);
		outerFrame.setVisible(true);
		*/
		break;
	
	case "Load": 
		
		
		//Controller.getInstance().setPickPanelB("Load");
    	   
    	   //Controller.getInstance().reLoadView();
    	   
		
		//JOptionPane.showMessageDialog(My_Window.this,  
				//String.format("Controller choose Load"));	
		
		//My_Window.this.position.add(fileName.toString());
   		
   		/* do parse get Name.toString() 
   		My_Window.this.fileNames.add(parsedName);
   		
   		My_Window.this.files.put(key, fileName);
   		
   		*/
		
		//JOptionPane.showMessageDialog(My_Window.this, "see button handler on code change");
		
		break;
		
	default: 
		//JOptionPane.showMessageDialog(My_Window.this,  
				//String.format("default"));	
		
		
		
		break;
	}
}


}}

package View;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;

//import Business_Logic.Controller;
//import view.My_Window;
//import view.My_Window.ClickHandler;

/**
 * 
 */

/**
 * @author Dan
 *
 */
public class MyDesktop extends JFrame {

	/**
	 * 
	 */
	
	private JDesktopPane theDesktop;
	private ImageIcon picture;
	
	private JMenuBar menuBar;
	
	private JMenu menuPrograms;
	private JMenu menuHelp;
	
	private JMenuItem menuItemTable;
	private JMenuItem menuItemBrowser;
	private JMenuItem menuItemJPanel;

	
	private JMenuItem menuItemSystem;
	private JMenuItem menuItemUpdate;
	private JMenuItem menuItemHelp;
	
	private ArrayList <String> JMenuProgramNames = new ArrayList <String>();
	private ArrayList <JMenuItem> JMenuProgramItems =  new ArrayList <JMenuItem>();
	
	private ArrayList <String> JMenuHelpNames = new ArrayList <String>();
	private ArrayList <JMenuItem> JMenuHelpItems =  new ArrayList <JMenuItem>();

	
	public MyDesktop(){
		// TODO Auto-generated constructor stub
		
		super("David Sheahan Desktop");
		
		theDesktop = new JDesktopPane();
		
		
		File rootFile = new File("/Root.dat");
		if(!rootFile.exists()){
			try{
			rootFile.createNewFile();
		       }catch(IOException e){};
			}
		
		//MouseHandler mouseHandler = new MouseHandler();
		ClickHandler handler = new ClickHandler();
		
		//theDesktop.addMouseListener(mouseHandler);
		
		
		JPopupMenu popUp = new JPopupMenu();
		popUp.add("one");
		
		theDesktop.add(popUp);
		

addMouseListener(new MouseAdapter(){



	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(theDesktop, "PUT A FILE HERE TO CLICK ON");
		if(e.getSource().toString() == "*.jar")
		{
			JOptionPane.showMessageDialog(theDesktop, "launch the Installer");
			
		}
		else if(e.getSource().toString() == "*.exe")
		{
			JOptionPane.showMessageDialog(theDesktop, "launch the Installer");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		checkForTriggerEvent(e);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		checkForTriggerEvent(e);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

private void checkForTriggerEvent(MouseEvent e){
	if(e.isPopupTrigger())
		//theouterFrame = (JFrame)getRootPane().getParent();
	popUp.show(e.getComponent(), e.getX(), e.getY());
}

});

		
		
		
		
		menuBar = new JMenuBar();
		
		
		 JMenuProgramNames.add("Table");
		JMenuProgramNames.add("Browser");
		JMenuProgramNames.add("TextEdit");
		JMenuProgramNames.add("Other");
		
		JMenuHelpNames.add("Shutdown");
		JMenuHelpNames.add("System");
		JMenuHelpNames.add("Update");
		JMenuHelpNames.add("Restore");
		JMenuHelpNames.add("Add Program");
		JMenuHelpNames.add("Remove Program");
		JMenuHelpNames.add("Help");
		

        menuPrograms = new JMenu("Programs");
        
        
         for (int i=0; i<JMenuProgramNames.size(); i++){
        	JMenuProgramItems.add(i, new JMenuItem(JMenuProgramNames.get(i)));
        	JMenuProgramItems.get(i).addActionListener(handler);
        	menuPrograms.add(JMenuProgramItems.get(i));
        }
        /*
        menuItemTable = new JMenuItem("Table");
        menuItemBrowser = new JMenuItem("Browser");
        menuItemJPanel = new JMenuItem("Other");
        
        
        menuItemTable.addActionListener(handler);
        menuItemBrowser.addActionListener(handler);
        menuItemJPanel.addActionListener(handler);
       
        menuPrograms.add(menuItemTable);
        menuPrograms.add(menuItemBrowser);
        menuPrograms.add(menuItemJPanel);
        */
        menuBar.add(menuPrograms);
        
        menuHelp = new JMenu("Help");
        
       
        for (int i=0; i<JMenuHelpNames.size(); i++){
        	JMenuHelpItems.add(i, new JMenuItem(JMenuHelpNames.get(i)));
        	JMenuHelpItems.get(i).addActionListener(handler);
        	menuHelp.add(JMenuHelpItems.get(i));
        }
		
        /*
        menuItemHelp = new JMenuItem("Help");
        menuItemSystem = new JMenuItem("System");
        menuItemUpdate = new JMenuItem("Update");
        
        
        menuItemHelp.addActionListener(handler);
        menuItemSystem.addActionListener(handler);
        menuItemUpdate.addActionListener(handler);
       
        menuHelp.add(menuItemHelp);
        menuHelp.add(menuItemSystem);
        menuHelp.add(menuItemUpdate);
        */
        menuBar.add(menuHelp);
        
        
        menuBar.add(menuHelp);
        
        
        this.setJMenuBar(menuBar);
		
		
		JPanel thePanel = new JPanel();
		
		
		//see page 1059 to add the server tool
		theDesktop.add(thePanel);
		add( theDesktop );
	}
/*
public class ClickHandler2<T> implements ActionListener{
	
	ArrayList <T> JMenuProgramsClasses = new ArrayList<T>();
	System theSystem = new System();
	JMenuProgramsClasses.add(theSystem);
	
	public void actionPerformed(ActionEvent event){
		
		for(int i=0; i<JMenuProgramNames.size(); i++){
			if(event.getActionCommand() == JMenuProgramNames.get(i)){
				
				displayElement(theSystem);
				
			
			}
		
	}
	}

	public void displayElement(T theInstance)
	{
		
		JFrame toDislay = (JFrame)theInstance;
		
		toDislay.setVisible(true);
		toDislay.setSize(theDesktop.getWidth(),theDesktop.getHeight());
		
		    theDesktop.add(toDislay);
	}
	
}
*/
	
	
public void paintComponent(Graphics g){
	super.paintComponents(g);
	/*picture = new ImageIcon("../../Res/DS.png");
	Image image = picture.getImage();
	Image newImage = image.getScaledInstance(1500, 1000, Image.SCALE_SMOOTH);
	g.drawImage(newImage, 0, 0, this);*/
	g.setColor(Color.black);
}



	
public class ClickHandler/*<T>*/ implements ActionListener{
	/*
	 * SEE LIST STUFF FURTHER UP 
	String b = "t";
	ArrayList<T> theList = new ArrayList<T>();
	theList.add(b);
	theList.add(new String("first"));
	theList.add(new System());
	*/
	
	private File fileName = new File("help.txt");
	
	//Controller controller = new Controller();
	JFrame outerFrame = (JFrame)getRootPane().getParent();
	
	public void actionPerformed ( ActionEvent event )
	{
		
		JOptionPane.showMessageDialog(theDesktop,  
				String.format("You Pressed: %s", event.getActionCommand()));
		
		switch(event.getActionCommand()){
		
		
		
		case "Table":
			
			
			// GET RID OF JInternaleFrame AS SOON AS POSSIBLE i think you shouldn't need it if you use Desktop
			JInternalFrame encloserTable = new JInternalFrame("Internal", true, true, true, true);
			
			LogFrame log = new LogFrame("David's Table View");
			log.setVisible(true);
			log.setSize(theDesktop.getWidth(),theDesktop.getHeight());
			
			encloserTable.add(log);
			//encloser.addImpl(log, BorderLayout.CENTER);
			encloserTable.pack();
			
			theDesktop.add(encloserTable);
			encloserTable.setVisible(true);
			
			 /*JOptionPane.showMessageDialog(My_Window.this, "Invalid Name", "Invalid Name", JOptionPane.ERROR_MESSAGE);*/
	    	   //fileChooser = new JFileChooser();
	    	   
	    	   //int result = fileChooser.showOpenDialog(outerFrame);
	    	   
	    	  // if (result == JFileChooser.CANCEL_OPTION)
	    		  // fileChooser.cancelSelection();
	    	   
	    	   //fileName = fileChooser.getSelectedFile();
	    	   
	    	   if((fileName == null)  || (fileName.getName().equals("")))
	    	   {
	    		   //JOptionPane.showMessageDialog(My_Window.this, "Invalid Name", "Invalid Name", JOptionPane.ERROR_MESSAGE);
	    		   
	    		  
	    		   
	    		   
	    	   }
	     	 
	    	   String PUTthisINTObrowser = fileName.getAbsolutePath();
	    	   
	   		//JOptionPane.showMessageDialog(My_Window.this,  
					//String.format("location is:" + PUTthisINTObrowser));
	   		
	   		
	   		
			break;
		 case "Browser": 
			
			 	JInternalFrame encloserBrowser = new JInternalFrame("Internal", true, true, true, true);
				
	    	  
			    My_Browser browse = new My_Browser("David's Browser View");
			    browse.setVisible(true);
			    browse.setSize(theDesktop.getWidth(),theDesktop.getHeight());
			    
			    encloserBrowser.add(browse);
				//encloser.addImpl(log, BorderLayout.CENTER);
				encloserBrowser.pack();
			    
			    
			    theDesktop.add(encloserBrowser);
				encloserBrowser.setVisible(true);
	    	   
	           //Controller.getInstance().setPickPanelB("server");
	    	   
	    	   //Controller.getInstance().reLoadView();
				
	    	   //controller.getInstance().pickPanelB = "server";
				
				//JOptionPane.showMessageDialog(My_Window.this,  
						//String.format("panelIs:"+controller.getInstance().pickPanelB,controller.getInstance().pickPanelB));

				
				
				/*pickPanelB = "server";
				outerFrame.setVisible(false);
				outerFrame.setVisible(true); */

				break;
		 case "TextEdit": 
				
			 	JFrameText myFrame = new JFrameText("Text");
			 	
			    //My_Browser browse = new My_Browser("David's Browser View");
				myFrame.setVisible(true);
				myFrame.setSize(theDesktop.getWidth(),theDesktop.getHeight());
			    
			    //encloserBrowser.add(browse);
				//encloser.addImpl(log, BorderLayout.CENTER);
				//encloserBrowser.pack();
			    
			    
			    //theDesktop.add(encloserBrowser);
				//encloserBrowser.setVisible(true);
	    	   
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
    	   TestFrame test = new TestFrame();
    	   test.setVisible(true);
    	   test.setSize(theDesktop.getWidth(),theDesktop.getHeight());
			JInternalFrame encloserOther = new JInternalFrame("Internal", true, true, true, true);
			theDesktop.add(test);
			
			/*
			My_Window tool = new My_Window("David's Window View");
			tool.setVisible(true);
			tool.setSize(theDesktop.getWidth(),theDesktop.getHeight());
			
				encloserOther.add(tool);
				//encloser.addImpl(log, BorderLayout.CENTER);
				encloserOther.pack();
			    
			    
			    theDesktop.add(encloserOther);
				encloserOther.setVisible(true);
				*/
    	   
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
      		case "System": 
			

      		System theSystem = new System();
      		theSystem.setVisible(true);
      		theSystem.setSize(theDesktop.getWidth(),theDesktop.getHeight());
			
			    theDesktop.add(theSystem);
			    
			
			
				//encloserOther.setVisible(true);
      			
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
        case "Help": 
			
        	Help theHelp = new Help("Help Section");
        	theHelp.setVisible(true);
        	theHelp.setSize(theDesktop.getWidth(),theDesktop.getHeight());
			
			    theDesktop.add(theHelp);

        	
        	//Controller.getInstance().setPickPanelB("entertainment");
     	   
     	   // Controller.getInstance().reLoadView();
			
			/*pickPanelB = "entertainment";
			outerFrame.setVisible(false);
			outerFrame.setVisible(true);*/

			break;	
			
            case "Shutdown": 
            	
            	java.lang.System.exit(0);
			
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
		
		case "Update": 
			Update newUpdate;
			ExecutorService newThread = Executors.newCachedThreadPool();
			newThread.execute(newUpdate = new Update());
			
			
			newUpdate.setSize(300, 200);
			newUpdate.setVisible(true);
			
			theDesktop.add(newUpdate);
			
			
			
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
		case "Restore": 
			 String message = "This will have to launch a restore class that will ";
			 message += "re-install all our software and ask about any extras. ";
			 message += "It must be able to keep all valid data"; 
			 
			 JOptionPane.showMessageDialog(theDesktop, message);

			 
			break;
		default: 
			//JOptionPane.showMessageDialog(My_Window.this,  
					//String.format("default"));	
			
			
			
			break;
		}
		
		
		
	}

	
}



}
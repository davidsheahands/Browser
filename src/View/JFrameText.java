/**
 * 
 */
package View;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;

/**
 * @author Dan
 *
 */
public class JFrameText extends JFrame {
	
	

	private ArrayList <String> JMenuProgramNames = new ArrayList <String>();
	private ArrayList <JMenuItem> JMenuProgramItems =  new ArrayList <JMenuItem>();
	
	private ArrayList <String> JMenuHelpNames = new ArrayList <String>();
	private ArrayList <JMenuItem> JMenuHelpItems =  new ArrayList <JMenuItem>();
	
	//private JMenuItem menuItemSave;
	
	private JTextArea theText;
	private String inputFromFile;

	/**
	 * 
	 */
	public JFrameText(String title){
		// TODO Auto-generated constructor stub
		
		


		super(title);
		
		
		JPanel myText = new JPanel();
	 	myText.setLayout(new BorderLayout());
	 	//myText.add(new TextArea());
	 	theText = new JTextArea(inputFromFile);
	 	myText.add(theText, BorderLayout.CENTER);
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(myText, BorderLayout.CENTER);
	  



			File textFile = new File("/Root/Text.dat");
			if(!textFile.exists()){
				try{
				textFile.createNewFile();
			       }catch(IOException e){};
				}
			





			JPopupMenu popUp = new JPopupMenu();
			popUp.add("one");
			
			theText.add(popUp);
			




	theText.addMouseListener(new MouseAdapter(){

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(theText, "Other stuff is to be added here");
			if(e.getSource().toString() == "*.jar")
			{
				JOptionPane.showMessageDialog(theText, "launch the Installer");
				
			}
			else if(e.getSource().toString() == "*.exe")
			{
				JOptionPane.showMessageDialog(theText, "launch the Installer");
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

			
		
			
			
			JMenuBar menuBar = new JMenuBar();
			
			
			
			JMenuProgramNames.add("Open");
			JMenuProgramNames.add("Save");
			JMenuProgramNames.add("b");
			JMenuProgramNames.add("c");
			
			JMenuHelpNames.add("Close");
			JMenuHelpNames.add("x");
			JMenuHelpNames.add("y");
			JMenuHelpNames.add("w");
			JMenuHelpNames.add("y");
			JMenuHelpNames.add("v");
			JMenuHelpNames.add("u");
			

	        JMenu menuPrograms = new JMenu("File");
	        ClickHandler handler = new ClickHandler();
	        
	        
	         for (int i=0; i<JMenuProgramNames.size(); i++){
	        	JMenuProgramItems.add(i, new JMenuItem(JMenuProgramNames.get(i)));
	        	JMenuProgramItems.get(i).addActionListener(handler);
	        	menuPrograms.add(JMenuProgramItems.get(i));
	        }
	       
	        //menuItemSave = new JMenuItem("Save");
	        //menuItemBrowser = new JMenuItem("Browser");
	        //menuItemJPanel = new JMenuItem("Other");
	        
	        
	        //menuItemSave.addActionListener(handler);
	        /*
	        menuItemBrowser.addActionListener(handler);
	        menuItemJPanel.addActionListener(handler);
	       
	        menuPrograms.add(menuItemTable);
	        menuPrograms.add(menuItemBrowser);
	        menuPrograms.add(menuItemJPanel);
	        */
	        menuBar.add(menuPrograms);
	        
	        JMenu menuHelp = new JMenu("Help");
	        
	       
	        for (int i=0; i<JMenuHelpNames.size(); i++){
	        	JMenuHelpItems.add(i, new JMenuItem(JMenuHelpNames.get(i)));
	        	JMenuHelpItems.get(i).addActionListener(handler);
	        	menuHelp.add(JMenuHelpItems.get(i));
	        }
			
	       
	        menuBar.add(menuHelp);
	        
	        
	        menuBar.add(menuHelp);
	        
	        
	        this.setJMenuBar(menuBar);
			
			

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
			
			JOptionPane.showMessageDialog(outerFrame,  
					String.format("You Pressed: %s", event.getActionCommand()));
			
			switch(event.getActionCommand()){
			
			
			
			case "Save":
				
				String fileName = JOptionPane.showInputDialog("Enter File Name");
				
				//"/Root/Text/"
				File thisFile = new File(fileName+".doc");  
				if(!thisFile.exists()){
					try{
					thisFile.createNewFile();
				       }catch(IOException ioe){};
					}
				
				try{
					FileReader reader = new FileReader(thisFile);
					BufferedReader bufReader = new BufferedReader(reader);
				}catch(FileNotFoundException fnfe){};
				
   		
				
				
				 /*JOptionPane.showMessageDialog(My_Window.this, "Invalid Name", "Invalid Name", JOptionPane.ERROR_MESSAGE);*/
		    	   //fileChooser = new JFileChooser();
		    	   
		    	   //int result = fileChooser.showOpenDialog(outerFrame);
		    	   
		    	  // if (result == JFileChooser.CANCEL_OPTION)
		    		  // fileChooser.cancelSelection();
		    	   
		    	   //fileName = fileChooser.getSelectedFile();
		    	   
		    	   //if((fileName == null)  || (fileName.getName().equals("")))
		    	  // {
		    		   //JOptionPane.showMessageDialog(My_Window.this, "Invalid Name", "Invalid Name", JOptionPane.ERROR_MESSAGE);
		    		   
		    		  
		    		   
		    		   
		    	 //  }
		     	 
		    	  // String PUTthisINTObrowser = fileName.getAbsolutePath();
		    	   
		   		
		   		
				break;
			 case "Open": 
				
				   File theFileName = new File("");
				 
		    	   JFileChooser fileChooser = new JFileChooser();
		    	   
		    	   int result = fileChooser.showOpenDialog(outerFrame);
		    	   
		    	   if (result == JFileChooser.CANCEL_OPTION)
		    		  // fileChooser.cancelSelection();
		    		   
		    		   theFileName = fileChooser.getSelectedFile();
		    	   
		    	   if((theFileName == null)  || (theFileName.getName().equals("")))
		    	   {
		    		   JOptionPane.showMessageDialog(outerFrame, "Invalid Name", "Invalid Name", JOptionPane.ERROR_MESSAGE);
		    		   
		    		  
		    		   
		    		   
		    	   }
		     	 
		    	   //String fileToOpen = theFileName.getAbsolutePath();
		    	   
		    	   
		    	   try{
						File theActualFile = new File(theFileName.getAbsolutePath());
						FileReader reader = new FileReader(theActualFile);
						BufferedReader bufReader = new BufferedReader(reader);
						
						String lineFromFile;
						//String inputFromFile;
						
						try{
							while(bufReader.readLine() !=null)
						{
								lineFromFile = bufReader.readLine();
								inputFromFile+=lineFromFile;
						}
						     }catch(IOException io){}
						outerFrame.repaint();
						
					}catch(FileNotFoundException fnfe){};
					
					
					
		    	   
		   		JOptionPane.showMessageDialog(outerFrame, 
						String.format("location is:" + theFileName.getAbsolutePath()));
		   		
		   		
				 
				 
				 
			 break;
			 case "TextEdit": 
					
				 	JFrameText myFrame = new JFrameText("Text");
				 	
				    //My_Browser browse = new My_Browser("David's Browser View");
					myFrame.setVisible(true);
					myFrame.setSize(outerFrame.getWidth(),outerFrame.getHeight());
				    
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


			case "Close": 
	    	   
				this.outerFrame = null;
			
				break;
	      		case "System": 
				

	      		System theSystem = new System();
	      		theSystem.setVisible(true);
	      		theSystem.setSize(outerFrame.getWidth(),outerFrame.getHeight());
				
				    outerFrame.add(theSystem);
				    
				
				
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
	        	theHelp.setSize(outerFrame.getWidth(),outerFrame.getHeight());
				
				    outerFrame.add(theHelp);

	        	
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
				
				outerFrame.add(newUpdate);
				
				
				
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
				 
				 JOptionPane.showMessageDialog(outerFrame, message);

				 
				break;
			default: 
				//JOptionPane.showMessageDialog(My_Window.this,  
						//String.format("default"));	
				
				
				
				break;
			}
		}

		
	}



	}

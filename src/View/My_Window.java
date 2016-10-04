package View;
/**
 * 
 */

/**
 * @author David
 *
 */

import java.awt.BorderLayout;

import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

//import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;


/*
import com.sun.javafx.collections.MappingChange.Map;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
*/

/*
import Business_Logic.Controller;
import Business_Logic.Messenger;
import Business_Logic.ReadServerFile;
*/
public class My_Window extends JFrame {
	
	 
    private JPanel mainPanel;
    private JPanel mainPanel2;
    private JPanel topPanel;
    private JPanel sideButtonPanel;
    private JPanel facePanel;
    //private ReadServerFile myBrowser;
    private JPanel serverPanel;
    private JPanel entertainmentPanel;
    private JPanel roomControlPanel;
    private JPanel viewSchedulePanel;
    private JPanel streamDataPanel;
    private JScrollPane trafFicScroll;
    private JMenuBar menuBar;
    private JMenu menuFile;
    private JMenuItem menuItemOpen;
    private JFileChooser fileChooser;
    
    private JLabel fileTitle;
    private JTextField inputText;
    private JComboBox fileChosen;
    private JComboBox positionText;
    
    private JButton loadButton;
    private JButton saveButton;
    private JButton viewFaceRecognitionButton;
    private JButton  viewFileConfigButton;
    private JButton viewTrafficButton;
    private JButton entertainmentButton;
    private JButton streamButton;
    private JButton roomControlButton;
    
    
    private Boolean face=true;
    private Boolean server=true;
    private Boolean traffic=true;
    private Boolean entertainment=true;
    private Boolean room=true;
    private Boolean view=true;
    private Boolean stream=true;
    
    //private Scene scene;
	//private Stage stage;
	
	private String pickPanelB;
	

	private ArrayList<String> fileNames;
	private ArrayList<String> position;
	private JPanel buttonPanel;
	
	
	
    
    public My_Window(String title){
        super(title);
        
        menuBar = new JMenuBar();
        menuFile = new JMenu("File");
        menuItemOpen = new JMenuItem("Open");
        
        ClickHandler handler = new ClickHandler();
        menuItemOpen.addActionListener(handler);
        
    	
	    	  
	 			
        
        menuFile.add(menuItemOpen);
        menuBar.add(menuFile);
        this.setJMenuBar(menuBar);
        
        
        this.getContentPane().add(createMainPanel());
        //this.mainPanel.add()
       
    }
   
    private JPanel createMainPanel(){
    	
    	//Controller controller = new Controller();
    	//pickPanelB = Controller.getInstance().getPickPanelB();
    	
    	this.mainPanel = new JPanel();
        this.mainPanel.setLayout((LayoutManager) new BorderLayout());
        
        
        this.mainPanel.add(createFaceRecognitionPanel(), BorderLayout.CENTER);
    	facePanel.setVisible(face);
    	this.setVisible(false);
    	this.setVisible(true);
        
        
        
        //this.getContentPane().add(this.mainPanel);
        
        //this.mainPanel.add(createTopSortPanel(), BorderLayout.NORTH);
        //this.mainPanel.add(createLeftSideButtonPanel(), BorderLayout.WEST);
        //this.mainPanel.add(createRightSideButtonPanel(), BorderLayout.EAST);
        //this.mainPanel.add(createFaceRecognitionPanel(), BorderLayout.CENTER);
        //this.mainPanel.add(createServerConfigPanel(), BorderLayout.CENTER);
        //this.mainPanel.add(createTrafficPanel(), BorderLayout.CENTER);
        
        //this.mainPanel.add(createEntertainmentHubPanel(), BorderLayout.CENTER);
        //this.mainPanel.add(createRoomControlPanel(), BorderLayout.CENTER);
        //this.mainPanel.add(createViewSchedulePanel(), BorderLayout.CENTER);
        //this.mainPanel.add(createStreamDataPanel(), BorderLayout.CENTER);
        
        
        
        //facePanel.setVisible(face);
        //myBrowser.setVisible(server);
        //trafFicScroll.setVisible(traffic);
        //entertainmentPanel.setVisible(entertainment);
        //roomControlPanel.setVisible(room);
        //viewSchedulePanel.setVisible(view);
        //streamDataPanel.setVisible(stream);
        
        
       /* 
        
       switch(pickPanelB){
        case "face":  
        	this.mainPanel.add(createFaceRecognitionPanel(), BorderLayout.CENTER);
        	//facePanel.setVisible(pickPanel.get("face"));
        	this.setVisible(false);
        	this.setVisible(true);
        	//this.revalidate();   add this in later 
      	    //this.repaint();
        	//also check the way the controller did it in the oop2 project 2
        	break;
        case "server":  
        	this.mainPanel.add(createServerConfigPanel(), BorderLayout.CENTER);
        	//myBrowser.setVisible(server);
        	this.setVisible(false);
        	this.setVisible(true);
        	break;
        case "traffic":  
        	this.mainPanel.add(createTrafficPanel(), BorderLayout.CENTER);
        	trafFicScroll.setVisible(traffic);
        	this.setVisible(false);
        	this.setVisible(true);
        	break;
        case "entertainment":  
        	this.mainPanel.add(createEntertainmentHubPanel(), BorderLayout.CENTER);
        	entertainmentPanel.setVisible(entertainment);
        	this.setVisible(false);
        	this.setVisible(true);
        	break;
        case "stream":  
        	this.mainPanel.add(createStreamDataPanel(), BorderLayout.CENTER);
        	streamDataPanel.setVisible(stream);
        	this.setVisible(false);
        	this.setVisible(true);
        	break;
        default: 
        
        	break;
        }
        
        
        */
        
        /*
        switch(pickPanelB){
        case "face":  
        	this.mainPanel.add(createFaceRecognitionPanel(), BorderLayout.CENTER);
        	facePanel.setVisible(face);
        	this.setVisible(false);
        	this.setVisible(true);
        	//this.revalidate();   add this in later 
      	    //this.repaint();
        	//also check the way the controller did it in the oop2 project 2
        	break;
        case "server":  
        	this.mainPanel.add(createServerConfigPanel(), BorderLayout.CENTER);
        	//myBrowser.setVisible(server);
        	this.setVisible(false);
        	this.setVisible(true);
        	break;
        case "traffic":  
        	this.mainPanel.add(createTrafficPanel(), BorderLayout.CENTER);
        	trafFicScroll.setVisible(traffic);
        	this.setVisible(false);
        	this.setVisible(true);
        	break;
        case "entertainment":  
        	this.mainPanel.add(createEntertainmentHubPanel(), BorderLayout.CENTER);
        	entertainmentPanel.setVisible(entertainment);
        	this.setVisible(false);
        	this.setVisible(true);
        	break;
        case "stream":  
        	this.mainPanel.add(createStreamDataPanel(), BorderLayout.CENTER);
        	streamDataPanel.setVisible(stream);
        	this.setVisible(false);
        	this.setVisible(true);
        	break;
        default: 
        
        	break;
        }
        
        */
    	
    	return mainPanel;
    }
    
    private JPanel createTopSortPanel(){
        JPanel topSortPanel = new JPanel();
        //default flowlayout
        fileTitle = new JLabel("Choose File");
        
        
        fileNames.add("specifiy other");
        fileNames.add("David_RSS.php");
        fileNames.add("welcome_message.html");
        fileNames.add("layout.css");
        fileNames.add("functionality.js");
        fileNames.add("config.java");
        fileNames.add("connection.xml");
        fileNames.add("access.sql");
        
        
        position.add("specifiy other");
        position.add("David_RSS.php");
        position.add("welcome_message.html");
        position.add("layout.css");
        position.add("functionality.js");
        position.add("config.java");
        position.add("connection.xml");
        position.add("access.sql");
        	   
        
        fileChosen = new JComboBox(fileNames.toArray());
        fileChosen.setEditable(true);
        positionText = new JComboBox(position.toArray());
        positionText.setEditable(true);
        inputText = new JTextField("Input Text");
        loadButton = new JButton("Load");
        
        ClickHandler handler = new ClickHandler();
        loadButton.addActionListener(handler);
        
        
        
        topSortPanel.add(fileTitle);
        topSortPanel.add(fileChosen);
        topSortPanel.add(positionText);
        topSortPanel.add(inputText);
        topSortPanel.add(loadButton);
        
        return topSortPanel;
        
    }
    
    private JPanel createLeftSideButtonPanel(){
        JPanel LeftButtonPanel = new JPanel();
        BoxLayout boxL = new BoxLayout(LeftButtonPanel, BoxLayout.Y_AXIS);
        LeftButtonPanel.setLayout(boxL);
        
        viewFaceRecognitionButton = new JButton("Face Recognition");
        viewFileConfigButton = new JButton("Server Config");
        viewTrafficButton = new JButton("Traffic Application");
        entertainmentButton = new JButton("Entertainment Hub");
        roomControlButton = new JButton("Room Control");
        
        ClickHandler handler = new ClickHandler();
        viewFaceRecognitionButton.addActionListener(handler);
        viewFileConfigButton.addActionListener(handler);
        viewTrafficButton.addActionListener(handler);
        entertainmentButton.addActionListener(handler);
        roomControlButton.addActionListener(handler);
        
        LeftButtonPanel.add(viewFaceRecognitionButton);
        LeftButtonPanel.add(viewFileConfigButton);
        LeftButtonPanel.add(viewTrafficButton);
        LeftButtonPanel.add(entertainmentButton);
        LeftButtonPanel.add(roomControlButton);
        
        
        return LeftButtonPanel;
    }
   
    private JPanel createRightSideButtonPanel(){
        JPanel RightButtonPanel = new JPanel();
        BoxLayout boxL = new BoxLayout(RightButtonPanel, BoxLayout.Y_AXIS);
        RightButtonPanel.setLayout(boxL);
        
        viewTrafficButton = new JButton("View Schedule");
        streamButton = new JButton("Stream Data");
        
        ClickHandler handler = new ClickHandler();
        
        streamButton.addActionListener(handler);
        
        RightButtonPanel.add(viewTrafficButton);
        RightButtonPanel.add(streamButton);
        
        
        return RightButtonPanel;
    }
    
    
    private JPanel createFaceRecognitionPanel(){
    	this.facePanel = new JPanel();
        this.facePanel.setLayout((LayoutManager) new BorderLayout());
        
        this.buttonPanel = new JPanel();
        this.buttonPanel.add(new JButton("Check"));
        
        this.facePanel.add(this.buttonPanel, BorderLayout.SOUTH);
        //this.getContentPane().add(this.facePanel);
        //facePanel.setVisible(true);
        facePanel.setOpaque(true);
        //facePanel.setBackground(Color.ORANGE);
        facePanel.setVisible(face);
        
       
        
        
        return facePanel;
    }
    
    private JPanel createServerConfigPanel(){
    	this.serverPanel = new JPanel();
        this.serverPanel.setLayout((LayoutManager) new BorderLayout());
       
 fileTitle = new JLabel("Choose File");
        
        
        fileNames.add("specifiy other");
        fileNames.add("David_RSS.php");
        fileNames.add("welcome_message.html");
        fileNames.add("layout.css");
        fileNames.add("functionality.js");
        fileNames.add("config.java");
        fileNames.add("connection.xml");
        fileNames.add("access.sql");
        
        
        position.add("specifiy other");
        position.add("David_RSS.php");
        position.add("welcome_message.html");
        position.add("layout.css");
        position.add("functionality.js");
        position.add("config.java");
        position.add("connection.xml");
        position.add("access.sql");
        	   
        
        fileChosen = new JComboBox(fileNames.toArray());
        fileChosen.setEditable(true);
        positionText = new JComboBox(position.toArray());
        positionText.setEditable(true);
        inputText = new JTextField("Input Text");
        loadButton = new JButton("Load");
        saveButton = new JButton("Save");
        
        ClickHandler handler = new ClickHandler();
        loadButton.addActionListener(handler);
        
        
        
        serverPanel.add(fileTitle);
        serverPanel.add(fileChosen);
        serverPanel.add(positionText);
        serverPanel.add(inputText);
        serverPanel.add(loadButton);
    
        //myBrowser = new ReadServerFile();
        
        //serverPanel.add(myBrowser);
        
        serverPanel.add(saveButton);
        
        return serverPanel;

    }
    
    
    private JScrollPane createTrafficPanel(){
       JTextArea textArea = new JTextArea(200, 400);
       textArea.setWrapStyleWord(true);
       textArea.setEditable(false);
	   
        
       trafFicScroll = new JScrollPane(textArea);
       trafFicScroll.setVisible(traffic);
       
       return trafFicScroll;
   }
    
    
    private JPanel createEntertainmentHubPanel(){
    	this.entertainmentPanel = new JPanel();
        this.entertainmentPanel.setLayout((LayoutManager) new BorderLayout());
        //this.getContentPane().add(this.facePanel);
        entertainmentPanel.setVisible(entertainment);
        
        return entertainmentPanel;
    }
    
    private JPanel createRoomControlPanel(){
    	this.roomControlPanel = new JPanel();
        this.roomControlPanel.setLayout((LayoutManager) new BorderLayout());
        //this.getContentPane().add(this.facePanel);
        roomControlPanel.setVisible(room);
        
        return roomControlPanel;
    }
    
    
    private JPanel createViewSchedulePanel(){
    	this.viewSchedulePanel = new JPanel();
        this.viewSchedulePanel.setLayout((LayoutManager) new BorderLayout());
        //this.getContentPane().add(this.facePanel);
        viewSchedulePanel.setVisible(view);
        
        return viewSchedulePanel;
    }
    
    
    private JPanel createStreamDataPanel(){
    	//streamDataPanel = new Messenger();
        //this.streamDataPanel.setLayout((LayoutManager) new BorderLayout());
        //this.getContentPane().add(this.facePanel);
       // streamDataPanel.setVisible(stream);
        
        return streamDataPanel;
    }
   
   
   public void hello2(){
	   JOptionPane.showMessageDialog(My_Window.this,  
				String.format("next time this will load the panel to run the face login software"));
	   
	  
       
	   //maybe try this inside another panel or check whether repaint paints the whole JFrame
	   this.removeAll();
	   traffic=false;
	   face=true;
	   //this.trafFicScroll.setVisible(traffic);
	   //this.facePanel.setVisible(face);
	   
       this.mainPanel.revalidate();
	   this.mainPanel.repaint();
	   this.getContentPane().add(mainPanel);
	   
	   this.revalidate();
	   this.repaint();
   }
   
   
   public void hello3(){
	   JOptionPane.showMessageDialog(My_Window.this,  
				String.format("this by-passed the face login"));
	   /*
	   this.getContentPane().removeAll();
	   this.mainPanel2 = new JPanel();
	   this.mainPanel2.setLayout((LayoutManager) new BorderLayout());
       this.getContentPane().add(this.mainPanel2);
       
       this.mainPanel2.add(createTopSortPanel(), BorderLayout.NORTH);
       this.mainPanel2.add(createLeftSideButtonPanel(), BorderLayout.WEST);
       this.mainPanel2.add(createRightSideButtonPanel(), BorderLayout.EAST);
       
       this.mainPanel2.add(createresultsTable(), BorderLayout.CENTER);
       
       
       
       this.getContentPane().add(this.mainPanel2);
	   
       */
	   this.removeAll();
	   traffic=true;
	   face=false;
	   //this.trafFicScroll.setVisible(traffic);
	   //this.facePanel.setVisible(face);
      
      
       
   	   //trafFicScroll.setVisible(true);
	   //maybe try this inside another panel or check whether repaint paints the whole JFrame
	   this.mainPanel.revalidate();
	   this.mainPanel.repaint();
	   this.getContentPane().add(mainPanel);
	   
	   this.revalidate();
	   this.repaint();
	   
	   
	   
	   
   }
   
   
   
   public void hello4(){
	   JOptionPane.showMessageDialog(My_Window.this,  
				String.format("This will load the web site the next time"));
	   
	   
	   //maybe try this inside another panel or check whether repaint paints the whole JFrame
	   this.removeAll();
	   traffic=false;
	   face=true;
	   
	   
	// create the scene
      /* stage.setTitle("Web View");
       scene = new Scene(new Browser(),750,500, Color.web("#666970"));
       stage.setScene(scene);
       scene.getStylesheets().add("webviewsample/BrowserToolbar.css");        
       stage.show(); */
	        //mainPanel.add(browser);
	       // this.mainPanel.add(stage.show(), BorderLayout.CENTER);
	   
	  
       
	  
	   //this.trafFicScroll.setVisible(traffic);
	   //this.facePanel.setVisible(face);
	   
       this.mainPanel.revalidate();
	   this.mainPanel.repaint();
	   this.getContentPane().add(mainPanel);
	   
	   this.revalidate();
	   this.repaint();
   }
   
   
   
   public void hello(){
	   JOptionPane.showMessageDialog(My_Window.this,  
				String.format("the controller hello"));
   }
   
public class ClickHandler implements ActionListener{
	
	
	private File fileName = new File("help.txt");
	
	//Controller controller = new Controller();
	JFrame outerFrame = (JFrame)getRootPane().getParent();
	
	public void actionPerformed ( ActionEvent event )
	{
		JOptionPane.showMessageDialog(My_Window.this,  
				String.format("You Pressed: %s", event.getActionCommand()));
		
		switch(event.getActionCommand()){
		
		
		
		case "Open":
			
			 /*JOptionPane.showMessageDialog(My_Window.this, "Invalid Name", "Invalid Name", JOptionPane.ERROR_MESSAGE);*/
	    	   fileChooser = new JFileChooser();
	    	   
	    	   int result = fileChooser.showOpenDialog(outerFrame);
	    	   
	    	   if (result == JFileChooser.CANCEL_OPTION)
	    		   fileChooser.cancelSelection();
	    	   
	    	   fileName = fileChooser.getSelectedFile();
	    	   
	    	   if((fileName == null)  || (fileName.getName().equals("")))
	    	   {
	    		   JOptionPane.showMessageDialog(My_Window.this, "Invalid Name", "Invalid Name", JOptionPane.ERROR_MESSAGE);
	    		   
	    		  
	    		   
	    		   
	    	   }
	     	 
	    	   String PUTthisINTObrowser = fileName.getAbsolutePath();
	    	   
	   		JOptionPane.showMessageDialog(My_Window.this,  
					String.format("location is:" + PUTthisINTObrowser));
	   		
	   		
	   		
			break;
		
		case "Face Recognition": 
    	   
    	   
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

			
			outerFrame.setVisible(false);
			outerFrame.setVisible(true);

			break;
       case "Server Config": 
    	   
    	   
          // Controller.getInstance().setPickPanelB("server");
    	   
    	   //Controller.getInstance().reLoadView();
			
    	   //controller.getInstance().pickPanelB = "server";
			
			//JOptionPane.showMessageDialog(My_Window.this,  
					//String.format("panelIs:"+controller.getInstance().pickPanelB,controller.getInstance().pickPanelB));

			
			
			/*pickPanelB = "server";
			outerFrame.setVisible(false);
			outerFrame.setVisible(true); */

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
         	   
         	  // Controller.getInstance().reLoadView();
			
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
	    	   
	    	  // Controller.getInstance().reLoadView();
	    	   
			
			JOptionPane.showMessageDialog(My_Window.this,  
					String.format("Controller choose Load"));	
			
			My_Window.this.position.add(fileName.toString());
	   		
	   		/* do parse get Name.toString() 
	   		My_Window.this.fileNames.add(parsedName);
	   		
	   		My_Window.this.files.put(key, fileName);
	   		
	   		*/
			
			JOptionPane.showMessageDialog(My_Window.this, "see button handler on code change");
			
			break;
			
		default: 
			JOptionPane.showMessageDialog(My_Window.this,  
					String.format("default"));	
			
			
			
			break;
		}
	}

	
}

public class Browser extends JEditorPane {
		 
	    //final WebView browser = new WebView();
	    //final WebEngine webEngine = browser.getEngine();
	     
	    public Browser() {
	        //apply the styles
	       // getStyleClass().add("browser");
	        // load the web page
	       // webEngine.load("http://www.oracle.com/products/index.html");
	        //add the web view to the scene
	      //getChildren().add(browser); 
	 
	    }

}

}
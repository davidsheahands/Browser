/**
 * 
 */
package Business_Logic;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.HyperlinkEvent;

//import com.sun.prism.Graphics;

//import javafx.scene.paint.Color;

/**
 * @author Dan
 *
 */
public class ReadServerFile extends JPanel 
{
	
private JTextField enterField;
private JEditorPane contentsArea;
private JScrollPane contentsScroller;
public String theUrl="";

	/**
	 * 
	 */
	public ReadServerFile() {
		// TODO Auto-generated constructor stub

		
		//create enterField and register its listener
		enterField = new JTextField("Enter File Url Here");
			
this.add( enterField, BorderLayout.NORTH);

contentsArea = new JEditorPane(); //create contentsArea


System.out.println("here");
System.out.println(contentsArea.getEditorKitForContentType(theUrl));
System.out.println(contentsArea.getDocument());
System.out.println("here");

//contentsArea.setDocument(wwwgoogleie.doc);

contentsArea.setSize( 400, 900 );
contentsArea.setVisible( true );
contentsArea.setEditable( true );
contentsArea.addKeyListener(
		new KeyListener()
		{
		
			
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {System.out.println("key pressed");
			// TODO Auto-generated method stub
			if(e.getKeyCode() == e.VK_ENTER) {
			      // Enter was pressed. Your code goes here.
				System.out.println("look here");
				//setDocument("www.google.ie");
				try{
					URL theURL = new URL(enterField.getText());
					getThePage(theURL);
				}catch(MalformedURLException mle){}
					
				
			   }
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
});


/* contentsArea.addHyperlinkListener(
		new HyperlinkListener()
		{
			//if user clicked hyperlink, go to specified page
			public void hyperlinkUpdate( HyperlinkEvent event )
			{
				if ( evnet.getEventType() ==
					HyperlinnkEvent.EventType.ACTIVATED )
					getThePage( event.getURL().toString() );
			}
		}
		); */

contentsScroller = new JScrollPane( contentsArea );
contentsScroller.setSize( 400, 900 );
contentsScroller.setVisible( true );  //show window
this.add( contentsScroller, BorderLayout.CENTER );
//setSize( 400, 300 ); //set size of window
//setVisible( true );  //show window
this.setOpaque(true);
//setBackground(Color.ORANGE);		
	
	} //end ReadServerFile constructor
	
	
	
	
	//load document
private void getThePage( URL location )
{
	try //load document and display location
	{
		contentsArea.setPage( location ); //set the page
		enterField.setText( location.toString() );  //set the text
	}   //end try
	catch ( IOException ioException )
	{
		JOptionPane.showMessageDialog( this, 
				"Error retrieving specified URL", "Bad URL",
				JOptionPane.ERROR_MESSAGE );
	}// end catch
}  //end method getThePage
} //end Class ReadServerFile

	

		
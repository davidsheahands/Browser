package Business_Logic;
/**
 * 
 */

import java.util.HashMap;
import java.util.jar.Manifest;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


import view.My_Window;
import view.Test;

/**
 * @author David
 *
 */





public class Controller {
	
	
	private My_Window Window;
	private Test myTest;
	private static Controller instance;
	public HashMap<String, Boolean> map;
	
	public String pickPanelB = "";
	   

	   public static Controller getInstance()
	   {
	      if(instance == null)
	      {
	         instance = new Controller();
	      }
	      return instance;
	   }
	   
	   public void setView(My_Window view){
		   this.Window = view;
		   
	   }
	   
	   public void reLoadView(){
		   
		   
		   if(this.Window != null){
			      // this.Window.setVisible(false);
				   //this.Window.hello();
				   //this.Window.hello();
				   this.Window.getDefaultCloseOperation();
			       this.Window.dispose();
			       this.Window = null;
			      // this.Window.removeAll();
			       //this.Window.revalidate();
			      // this.Window.repaint();
			      }
		   
		   
		   My_Window myApplication = new My_Window("Server Tools");
			myApplication.setSize(700, 300);
			myApplication.setVisible(true); //put in close funtion 
			
			this.setView(myApplication);
			
			
	   }
	
	   
	   public String getPickPanelB() {
		return pickPanelB;
	}

	public void setPickPanelB(String pickPanelB) {
		this.pickPanelB = pickPanelB;
	}

	public HashMap<String, Boolean> getMap() {
		return map;
	}

	public void setMap(HashMap<String, Boolean> map) {
		this.map = map;
	}

	public void configureView(HashMap<String, Boolean> map){
		   this.Window.revalidate(); 
		   this.Window.repaint();
	   }
	
  public void faceRecognition(JFrame outerFrame){
	        //this calls a method from the view it could also call a method from controller or model
			My_Window theWin = new My_Window("david");
			//this.Window = outerFrame;
			//outerFrame.hello();
			theWin.hello2();

		} 
	   
	   
   public void traffic(JFrame outerFrame){
		My_Window theWin = new My_Window("david");
		//this.Window = outerFrame;
		//outerFrame.hello();
		theWin.hello3();

	}
   
   public void entertainment(JFrame outerFrame){
		My_Window theWin = new My_Window("david");
		//this.Window = outerFrame;
		//outerFrame.hello();
		theWin.hello4();

	}
	
	/*public void commit(JFrame outerFrame){
		myTest test = myTest(outerFrame, "david");
		
	}*/
	
	
	

}

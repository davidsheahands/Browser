import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Dan
 *
 */
public class Buffer<T> {
	
	
	private ArrayList<T> theName;

	/**
	 * 
	 */
	public Buffer() {
		// TODO Auto-generated constructor stub
		
		theName = new ArrayList<T>(5);
		
		
		
	
	}
	
	public ArrayList<T> getArray(){
		return theName;
	}

}

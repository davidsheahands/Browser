/**
 * 
 */
package Business_Logic;



import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
//import model.Contact;

public class ContactTableModel extends DefaultTableModel 
{
	private static final int NO_OF_COLS = 2;
	
	//These are the indices of the table columns
	private static final int NAME_COL = 0;
	private static final int PHONE_NO_COL = 1;
	
	
	private ArrayList<String> contacts;
	
	public ContactTableModel(ArrayList<String> contacts)
	{
		super();
		this.contacts = contacts;
	}

	//We are overriding the getColumnCount() method from superclass
	public int getColumnCount()
	{
		return NO_OF_COLS;
	}
	//We are overriding the getColumnCount() method from superclass	
	public String getColumnName(int column)
	{
		if(column == NAME_COL)
		{
			return "Name";
		}
		else if(column == PHONE_NO_COL)
		{
			return "Phone Number";
		}
		else
		{
			return "";
		}
	}
	//We are overriding the getColumnCount() method from superclass	
	public int getRowCount()
	{
		if(this.contacts != null)
		{
			return this.contacts.size();
		}
		else
		{	
			return 0;
		}
	}
	
	/*
	public Object getValueAt(int row, int col)
	{
		
		Contact contactToGet = this.contacts.get(row);
		if(col == NAME_COL)
		{
			return contactToGet.getName();
		}
		else if(col == PHONE_NO_COL)
		{
			return contactToGet.getPhoneNumber();
		}
		
		else
		{
			return "";
		}
	}*/
	
}

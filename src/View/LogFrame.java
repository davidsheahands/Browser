package View;

		//package view;

		import java.awt.BorderLayout;
		import java.util.ArrayList;

		import javax.swing.Box;
		import javax.swing.BoxLayout;
		import javax.swing.JButton;
		import javax.swing.JFrame;
		import javax.swing.JOptionPane;
		import javax.swing.JPanel;
		import javax.swing.JScrollPane;
		import javax.swing.JTable;
		import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Business_Logic.ContactTableModel;

import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;
import java.lang.reflect.Array;





		//import Controller.LogController;
		//import model.DataModel;
		//import model.Contact;
		//import model.Call;

		/**
		 * @author David
		 *
		 */
		public class LogFrame extends JFrame {
			
			private JPanel mainPanel;
			private JPanel topPanel;
			private JPanel sideButtonPanel;
			private JTable resultsTable;
			
			private JTextField titleText;
			
			private JButton addContact;
			private JButton deleteContact;
			private JButton updateContact;
			private JButton addCall;
			private JButton viewCalls;
			
			private int selectedIndex;
			
			//private Contact toUpDate;
			//private Contact selectedContact;
			
			//private ContactTableModel myContactsTableModel;
			
			private JScrollPane scroll;
			
			//private ArrayList<Call> callsToDisplay;
			
			public LogFrame(String title){
				super(title);
				this.mainPanel = new JPanel();
				this.mainPanel.setLayout(new BorderLayout());
				this.getContentPane().add(this.mainPanel);
				this.mainPanel.add(createTopPanel(), BorderLayout.NORTH);
				this.mainPanel.add(createSideButtonPanel(), BorderLayout.WEST);
				//this.mainPanel.add(createResultsTable(LogController.getInstance().getContacts()), BorderLayout.CENTER);
				String [] theData = new String[5];
				theData[0]=("David");
				theData[1]=("Oscar");
				theData[2]=("Dan");
				this.mainPanel.add(createResultsTable(theData), BorderLayout.CENTER);
			}
			
		
			
			private JPanel createTopPanel(){
				topPanel = new JPanel();
				titleText = new JTextField("Log History");
				topPanel.add(titleText);
				
				return topPanel;
			}
			
			private JPanel createSideButtonPanel(){
				sideButtonPanel = new JPanel();
				BoxLayout boxL = new BoxLayout(sideButtonPanel, BoxLayout.Y_AXIS);
				sideButtonPanel.setLayout(boxL);
				
				addContact = new JButton("Add Contact   ");
				addContact.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
							JFrame outerFrame = (JFrame)getRootPane().getParent();
							//Launch the Add Competitor dialog
							//AddContactDialog addContactDialog = 
										//new AddContactDialog(outerFrame, "Add Contact");
							//addContactDialog.setSize(400, 250);
							//addContactDialog.setVisible(true);
						}});
				
				deleteContact = new JButton("Delete Contact ");
				deleteContact.addActionListener(new ActionListener(){
					
					public void actionPerformed(ActionEvent e){
						JFrame outerFrame = (JFrame)getRootPane().getParent();
						selectedIndex = resultsTable.getSelectedRow();
						if (selectedIndex>=0){
						//LogController.getInstance().deleteContact(selectedIndex);
					}
						else{
						JOptionPane.showMessageDialog(outerFrame, "You Must Select a Contact!");
					}
					}});
				updateContact = new JButton("Update Contact");
				updateContact.addActionListener(new ActionListener(){
					
					public void actionPerformed(ActionEvent e){
						JFrame outerFrame = (JFrame)getRootPane().getParent();
						selectedIndex = resultsTable.getSelectedRow();
						if(selectedIndex >=0)
						{	
							//toUpDate = LogController.getInstance().getContacts().get(selectedIndex);
							//Launch the Update Contact Dialog
							//UpdateContactDialog updateContactDialog = new UpdateContactDialog(outerFrame, "Update Contact", toUpDate);	
							//updateContactDialog.setSize(400, 250);
							//updateContactDialog.setVisible(true);
						}
						else {
							JOptionPane.showMessageDialog(outerFrame, "You Must Select a Contact!");
						}
					}});
				addCall = new JButton("Add Call     ");
				addCall.addActionListener(new ActionListener(){
					
					public void actionPerformed(ActionEvent e){
					JFrame outerFrame = (JFrame)getRootPane().getParent();
					
					
					selectedIndex = resultsTable.getSelectedRow();
					
					if(selectedIndex >=0)
					{
						//selectedContact = LogController.getInstance().getContacts().get(selectedIndex);
						//Launch the Add Call Dialog	
					//AddCallDialog addCallDialog = 
								//new AddCallDialog(outerFrame, "Add Call", selectedContact);
					//addCallDialog.setSize(400, 250);
					//addCallDialog.setVisible(true);
					
					}
				else{
					JOptionPane.showMessageDialog(outerFrame, "You Must Select a Contact!");
				}}});
				viewCalls = new JButton("View Calls  ");
				viewCalls.addActionListener(new ActionListener(){
									
						public void actionPerformed(ActionEvent e) {
							int selectedIndex = resultsTable.getSelectedRow();
							if(selectedIndex >=0)
							{
								//Contact selectedContact = 
								//LogController.getInstance().getContacts().get(selectedIndex);
								
								//callsToDisplay = selectedContact.getCalls();
								
								//for(Call c: callsToDisplay){
									//System.out.println(c);
								//}
								
								
							}
							else
							{
								JOptionPane.showMessageDialog((JFrame)getRootPane().getParent(), "You Must Select a Contact!");
							}
							
						}
					});
				
				//This sets the spacing between buttons
				sideButtonPanel.add(addContact);
				sideButtonPanel.add(Box.createVerticalStrut(5));
				sideButtonPanel.add(deleteContact);
				sideButtonPanel.add(Box.createVerticalStrut(5));
				sideButtonPanel.add(updateContact);
				sideButtonPanel.add(Box.createVerticalStrut(5));
				sideButtonPanel.add(addCall);
				sideButtonPanel.add(Box.createVerticalStrut(5));
				sideButtonPanel.add(viewCalls);
				
				return sideButtonPanel;
				
			}
			
				private JScrollPane createResultsTable(String [] Contacts){
					resultsTable = new JTable();
					//ContactTableModel myContactsTableModel = new ContactTableModel(Contacts);
					resultsTable.setModel(new DefaultTableModel(Contacts, 50));
					scroll = new JScrollPane(resultsTable);
					
					return scroll;	
					
					
				}
			
			public void refreshTable()
			{
				//this.myContactsTableModel.fireTableDataChanged();
			}
			
		}


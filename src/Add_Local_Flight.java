import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.regex.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JSpinner;
import javax.swing.JTable;

public class Add_Local_Flight extends JFrame {

	
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	// arraylist for storing information about Local flights
	private static ArrayList<Local> lst = new ArrayList<>();
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	double distance;
	int totalSeats;
	int currentSeats;
	double duration;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Local_Flight frame = new Add_Local_Flight();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Add_Local_Flight() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 918, 738);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// setting and adding the text fields and the labels to the content pane
		JLabel lblNewLabel_1 = new JLabel("Add Local Flight");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_1.setBounds(187, 43, 138, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("NPAFS");
		lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(226, 17, 64, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("Route");
		lblNewLabel.setBounds(413, 93, 49, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(404, 118, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Source");
		lblNewLabel_2.setBounds(27, 93, 49, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(27, 118, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(27, 174, 96, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Destination");
		lblNewLabel_3.setBounds(27, 149, 96, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Departure Time");
		lblNewLabel_4.setBounds(27, 205, 96, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(27, 231, 96, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Arrival Time");
		lblNewLabel_5.setBounds(27, 276, 96, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(27, 301, 96, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Distance");
		lblNewLabel_6.setBounds(241, 93, 73, 14);
		contentPane.add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		
		textField_5.setBounds(230, 118, 96, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Total Seats");
		lblNewLabel_7.setBounds(240, 149, 74, 14);
		contentPane.add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(230, 174, 96, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Current Seats Available");
		lblNewLabel_8.setBounds(230, 205, 143, 14);
		contentPane.add(lblNewLabel_8);
		
		textField_7 = new JTextField();
		textField_7.setBounds(230, 231, 96, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Flight Status Available (Yes/No)");
		lblNewLabel_9.setBounds(230, 276, 232, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Airplane ID");
		lblNewLabel_10.setBounds(404, 149, 96, 14);
		contentPane.add(lblNewLabel_10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(404, 174, 96, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Duration in Hours");
		lblNewLabel_11.setBounds(404, 205, 115, 14);
		contentPane.add(lblNewLabel_11);
		
		textField_10 = new JTextField();
		textField_10.setBounds(404, 231, 96, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		String column[]={"Source","Destination","Departure","Arrival","Total Seats","Current Seats Available", "Flight Available Status", "Airplane ID", "Distance", "Route", "Duration"};
		DefaultTableModel model = new DefaultTableModel(column,0);
		JTable table = new JTable(); // creating a new table
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				// getting the values of the cells of the selected row 
				String tf1 = model.getValueAt(table.getSelectedRow(), 0).toString();
				String tf2 = model.getValueAt(table.getSelectedRow(), 1).toString();
				String tf3= model.getValueAt(table.getSelectedRow(), 2).toString();
				String tf4= model.getValueAt(table.getSelectedRow(), 3).toString();
				String tf5= model.getValueAt(table.getSelectedRow(), 4).toString();
				String tf6= model.getValueAt(table.getSelectedRow(), 5).toString();
				String tf7= model.getValueAt(table.getSelectedRow(), 6).toString();
				String tf8= model.getValueAt(table.getSelectedRow(), 7).toString();
				String tf= model.getValueAt(table.getSelectedRow(), 8).toString();
				String tf9= model.getValueAt(table.getSelectedRow(), 9).toString();
				String tf10= model.getValueAt(table.getSelectedRow(), 10).toString();
				
				// setting the selected row cell values to the textFields
				textField_1.setText(tf1);
				textField_2.setText(tf2);
				textField_3.setText(tf3);
				textField_4.setText(tf4);
				textField_5.setText(tf);
				textField_6.setText(tf5);
				textField_7.setText(tf6);
				textField_8.setText(tf7);
				textField.setText(tf9);
				textField_9.setText(tf8);
				textField_10.setText(tf10);
				
			}
			
			
		});
		int row = table.getSelectedRow();
	    table.setModel(model);
	    table.setBounds(254, 467, -52, -31);
	    contentPane.add(table);
	    JScrollPane pane=new JScrollPane(table); 
	    pane.setBounds(39, 410, 799, 244);
	    contentPane.add(pane);
		
		
		
		
	
		// when button is clicked main menu frame is set to visible
		JButton btnNewButton_2 = new JButton("Main Menu");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				MainMenu obj = new MainMenu();
				obj.setVisible(true);
				dispose();
				
				
			}
		});
		btnNewButton_2.setBounds(27, 27, 111, 23);
		contentPane.add(btnNewButton_2);
		
		// when the button is clicked admin menu frame is called
		JButton btnNewButton_2_1 = new JButton("Admin Menu");
		btnNewButton_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Admin_Panel_2 obj = new Admin_Panel_2();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2_1.setBounds(408, 27, 111, 23);
		contentPane.add(btnNewButton_2_1);
		
		
		/* when the add button is clicked the entered values in the textFields
		 * are added to the arraylist of local flight class*/
		
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				
				
				
				
				// if the textFields are empty prompt to enter all the details
				if(textField.getText().isEmpty() || textField_1.getText().isEmpty() || textField_2.getText().isEmpty() || textField_3.getText().isEmpty() || textField_4.getText().isEmpty() || textField_5.getText().isEmpty() || textField_6.getText().isEmpty() || textField_7.getText().isEmpty() || textField_8.getText().isEmpty() || textField_9.getText().isEmpty() || textField_10.getText().isEmpty())
				{
					
					JOptionPane.showMessageDialog(null, "Please Enter all the details!");
					return;
					
				}
				
				// if the entered cities are not in the mentioned 5 cities then prompt to enter again
				if(!(textField_1.getText().equals("Islamabad") || textField_1.getText().equals("islamabad") || textField_1.getText().equals("Quetta") || textField_1.getText().equals("quetta") || textField_1.getText().equals("Lahore") || textField_1.getText().equals("lahore") || textField_1.getText().equals("Islamabad") ||textField_1.getText().equals("Peshawar") || textField_1.getText().equals("peshawar") || textField_1.getText().equals("Karachi") || textField_1.getText().equals("karachi") ))
				{
					
					JOptionPane.showMessageDialog(null, "Please Enter a Valid City!");
					return;
					
				}
				
				// if the entered cities are not in the mentioned 5 cities then prompt to enter again
				if(!(textField_2.getText().equals("Islamabad") || textField_2.getText().equals("islamabad") || textField_2.getText().equals("Quetta") || textField_2.getText().equals("quetta") || textField_2.getText().equals("Lahore") || textField_2.getText().equals("lahore") || textField_2.getText().equals("Islamabad") ||textField_2.getText().equals("Peshawar") || textField_2.getText().equals("peshawar") || textField_2.getText().equals("Karachi") || textField_2.getText().equals("karachi") ))
				{
					
					JOptionPane.showMessageDialog(null, "Please Enter a Valid City!");
					return;
					
				}
				
				// making sure that value entered into the textField are in double format
				String tf1 = textField_5.getText();
				try
				{
					Double.parseDouble(tf1);
					
				}
				
				catch(Exception e1){
			        
					JOptionPane.showMessageDialog(null, "Please Enter Correct details!");
					return;
			       
			    }
				
				// making sure that value entered into the textField are in integer format
				String tf2 = textField_6.getText();
				try
				{
					Integer.parseInt(tf2);
					
				}
				
				catch(Exception e1){
			        
					JOptionPane.showMessageDialog(null, "Please Enter Correct details!");
					return;
			       
			    }
				
				// making sure that value entered into the textField are in integer format
				
				String tf3 = textField_7.getText();
				try
				{
					Integer.parseInt(tf3);
					
				}
				
				catch(Exception e1){
			        
					JOptionPane.showMessageDialog(null, "Please Enter Correct details!");
					return;
			       
			    }
				
				// making sure that value entered into the textField are in double format
			    
				String tf4 = textField_10.getText();
				try
				{
					Double.parseDouble(tf4);
					
				}
				
				catch(Exception e1){
			        
					JOptionPane.showMessageDialog(null, "Please Enter Correct details!");
					return;
			       
			    }
			    
				 // checking to see if the entered details of the flight availability status is entered as yes or no 
				String tf8 = textField_8.getText();
				String tf81 = tf8.toLowerCase();
				if(!(tf81.contains("yes") || tf81.contains("no")))
				{
					JOptionPane.showMessageDialog(null, "Please Enter Yes or No !");
					return;
					
				}
				
			
			
				
				
				
				
				// converting the entered values into the textfields to integer and double in order to store in arraylist
				distance = Double.parseDouble(textField_5.getText());
				totalSeats = Integer.parseInt(textField_6.getText());
				currentSeats = Integer.parseInt(textField_7.getText());
				duration = Double.parseDouble(textField_10.getText());
				
				// if total seats greater then 60 then prompt to enter again
				if(totalSeats>60)
				{
					JOptionPane.showMessageDialog(null, "Seats cannot be more than 60!");
					return;
					
				}
				
                // if currentseats greater than total seats then prompt to enter again
				if(currentSeats>totalSeats)
				{
					JOptionPane.showMessageDialog(null, "Enter Correct Number of Seats!");
					return;
					
				}
				
				Airplane ap = new Airplane(textField_9.getText());
				
				
				// adding the entered values into the local class
				Local obj = new Local(textField_3.getText(),textField_4.getText(),distance,totalSeats,textField_8.getText(),currentSeats,ap,textField_2.getText(),textField.getText(),textField_1.getText(),duration);
				
				// adding the data into arraylist
				lst.add(obj);
				
				model.setRowCount(0);
				
				// adding the data into the table
				for(int i = 0; i<lst.size(); i++)
					
				{
					Object[] objs = {lst.get(i).getRoute(), lst.get(i).getSource(), lst.get(i).getDeparture_Time(), lst.get(i).getArrival_Time(), lst.get(i).getTotalSeats(), lst.get(i).getSeats_Available_current(), lst.get(i).isStatus(), lst.get(i).getid(), lst.get(i).getDistance(), lst.get(i).getDestination(), lst.get(i).getDuration_hours()};
					model.addRow(objs);
					
				}
				
				JOptionPane.showMessageDialog(null, "Flight Added Succesfully!");
				
				// clearing the text fields
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				
				
				JOptionPane.showMessageDialog(null, "Flight Added Succesfully!");
				
				
			}
		});
		btnNewButton.setBounds(85, 345, 89, 23);
		contentPane.add(btnNewButton);
		
		textField_8 = new JTextField();
		textField_8.setBounds(229, 301, 96, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
                // if the fields are empty prompt to enter again
				if(textField.getText().isEmpty() || textField_1.getText().isEmpty() || textField_2.getText().isEmpty() || textField_3.getText().isEmpty() || textField_4.getText().isEmpty() || textField_5.getText().isEmpty() || textField_6.getText().isEmpty() || textField_7.getText().isEmpty() || textField_8.getText().isEmpty() || textField_9.getText().isEmpty() || textField_10.getText().isEmpty())
				{
					
					JOptionPane.showMessageDialog(null, "Please Enter all the details!");
					return;
					
				}
				// if the entered cities are not in the mentioned 5 cities then prompt to enter again
				if(!(textField_1.getText().equals("Islamabad") || textField_1.getText().equals("islamabad") || textField_1.getText().equals("Quetta") || textField_1.getText().equals("quetta") || textField_1.getText().equals("Lahore") || textField_1.getText().equals("lahore") || textField_1.getText().equals("Islamabad") ||textField_1.getText().equals("Peshawar") || textField_1.getText().equals("peshawar") || textField_1.getText().equals("Karachi") || textField_1.getText().equals("karachi") ))
				{
					
					JOptionPane.showMessageDialog(null, "Please Enter a Valid City!");
					return;
					
				}
				
				// if the entered cities are not in the mentioned 5 cities then prompt to enter again
				if(!(textField_2.getText().equals("Islamabad") || textField_2.getText().equals("islamabad") || textField_2.getText().equals("Quetta") || textField_2.getText().equals("quetta") || textField_2.getText().equals("Lahore") || textField_2.getText().equals("lahore") || textField_2.getText().equals("Islamabad") ||textField_2.getText().equals("Peshawar") || textField_2.getText().equals("peshawar") || textField_2.getText().equals("Karachi") || textField_2.getText().equals("karachi") ))
				{
					
					JOptionPane.showMessageDialog(null, "Please Enter a Valid City!");
					return;
					
				}
				
				// making sure that value entered is in double format
				String tf1 = textField_5.getText();
				try
				{
					Double.parseDouble(tf1);
					
				}
				
				catch(Exception e1){
			        
					JOptionPane.showMessageDialog(null, "Please Enter Correct details!");
					return;
			       
			    }
				
				// making sure that value entered is in integer format
				String tf2 = textField_6.getText();
				try
				{
					Integer.parseInt(tf2);
					
				}
				
				catch(Exception e1){
			        
					JOptionPane.showMessageDialog(null, "Please Enter Correct details!");
					return;
			       
			    }
				
				// making sure that value entered is in integer format
				
				String tf3 = textField_7.getText();
				try
				{
					Integer.parseInt(tf3);
					
				}
				
				catch(Exception e1){
			        
					JOptionPane.showMessageDialog(null, "Please Enter Correct details!");
					return;
			       
			    }
			    
				// making sure that value entered is in double format
				String tf4 = textField_10.getText();
				try
				{
					Double.parseDouble(tf4);
					
				}
				
				catch(Exception e1){
			        
					JOptionPane.showMessageDialog(null, "Please Enter Correct details!");
					return;
			       
			    }
			    
				String tf8 = textField_8.getText();
				String tf81 = tf8.toLowerCase();
				// checking to see if the entered details of the flight availability status is entered as yes or no 
				if(!(tf81.contains("yes") || tf81.contains("no")))
				{
					JOptionPane.showMessageDialog(null, "Please Enter Yes or No !");
					return;
					
				}
				
				// conveting the entered text field values to integer and double to add to local class
			    
				distance = Double.parseDouble(textField_5.getText());
				totalSeats = Integer.parseInt(textField_6.getText());
				currentSeats = Integer.parseInt(textField_7.getText());
				duration = Double.parseDouble(textField_10.getText());
				
				
				if(totalSeats>60)
				{
					JOptionPane.showMessageDialog(null, "Seats cannot be more than 60!");
					return;
					
				}
				

				if(currentSeats>totalSeats)
				{
					JOptionPane.showMessageDialog(null, "Enter Correct Number of Seats!");
					return;
					
				}
				
				
				// setting the newly updated values in respective cells of the selected row
				String source = textField_1.getText();
				model.setValueAt(source, table.getSelectedRow(), 0);
				
				String destination = textField_2.getText();
				model.setValueAt(destination, table.getSelectedRow(), 1);
				
				String depTime = textField_3.getText();
				model.setValueAt(depTime, table.getSelectedRow(), 2);
				
				String arrivalTime = textField_4.getText();
				model.setValueAt(arrivalTime, table.getSelectedRow(), 3);
				
				double distance = Double.parseDouble(textField_5.getText());
				model.setValueAt(distance, table.getSelectedRow(), 8);
				
				int totalSeats = Integer.parseInt(textField_6.getText());
				model.setValueAt(totalSeats, table.getSelectedRow(), 4);
				
				int currentSeat = Integer.parseInt(textField_7.getText());
				model.setValueAt(currentSeat, table.getSelectedRow(), 5);
				
				String status = textField_8.getText();
				model.setValueAt(status, table.getSelectedRow(), 6);
				
				String route = textField.getText();
				model.setValueAt(route, table.getSelectedRow(), 9);
				
				String id = textField_9.getText();
				model.setValueAt(id, table.getSelectedRow(), 7);
				
				double duration = Double.parseDouble(textField_10.getText());
				model.setValueAt(duration, table.getSelectedRow(), 10);
				
				// updating the newly updated values in the arraylist
					
					lst.get(table.getSelectedRow()).route = source;
					lst.get(table.getSelectedRow()).destination = route;
					lst.get(table.getSelectedRow()).departure_Time = depTime;
					lst.get(table.getSelectedRow()).arrival_Time = arrivalTime;
					lst.get(table.getSelectedRow()).distance = distance;
					lst.get(table.getSelectedRow()).totalSeats = totalSeats;
					lst.get(table.getSelectedRow()).seats_Available_current= currentSeat;
					lst.get(table.getSelectedRow()).status = status;
					lst.get(table.getSelectedRow()).source = destination;
					
					lst.get(table.getSelectedRow()).duration_hours = duration;
				
					
					
					// clearing the text fields
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					
					textField_6.setText("");
					textField_7.setText("");
					textField_8.setText("");
					textField_9.setText("");
					textField_10.setText("");
					
					
					
					
					
					 
					JOptionPane.showMessageDialog(null, "Updated Succesfully!");
					
			}
		});
		
		btnNewButton_1.setBounds(184, 345, 89, 23);
		contentPane.add(btnNewButton_1);
		
		
		
		
		
	}
	
	// function for getting the arraylist of local 
	public static ArrayList<Local> getList() {
	       return lst;
	   }
}

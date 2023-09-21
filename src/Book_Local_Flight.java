import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Book_Local_Flight extends JFrame {

	private JPanel contentPane;
	// getting the arraylist of international class
	static ArrayList<Local> lst = Add_Local_Flight.getList();
	//getting the arraylist of passenger class
	static ArrayList<Passenger> lst1= PassengerRegistration.getList();
	JLabel lblNewLabel_3;
	JLabel lblNewLabel_2;
	JLabel lblNewLabel_5;
	JLabel lblNewLabel_4;
	JLabel lblNewLabel_6;
	JLabel lblNewLabel_8;
	 DefaultTableModel model;
	 JTable jt;
	
	private JTextField tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Book_Local_Flight frame = new Book_Local_Flight(lst);
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
	public Book_Local_Flight(ArrayList<Local> lst) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 861, 668);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// if the button is clicked main menu frame is called
		
		JButton btnNewButton_2 = new JButton("Main Menu");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				MainMenu obj = new MainMenu();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(10, 23, 111, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("NPAFS");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 17));
		lblNewLabel_1.setBounds(171, 54, 64, 14);
		contentPane.add(lblNewLabel_1);
		
		// if the button is clicked passenger menu frame is called
		JButton btnNewButton_2_1 = new JButton("Passenger Menu");
		btnNewButton_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Passenger_Panel2 obj = new Passenger_Panel2(lst1);
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2_1.setBounds(292, 23, 134, 23);
		contentPane.add(btnNewButton_2_1);
		
		JLabel lblBookLocalFlight = new JLabel("Book Local Flight");
		lblBookLocalFlight.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblBookLocalFlight.setBackground(Color.GRAY);
		lblBookLocalFlight.setBounds(142, 79, 189, 27);
		contentPane.add(lblBookLocalFlight);
		
		 String column[]={"Source","Destination","Departure Time","Arrival Time","Total Seats","Current Seats Available", "Flight Available Status", "Airplane ID", "Distance", "Route", "Duration"};        
		
		// getting the values from the international arraylist and setting them in the table
		String data[][]=new String [lst.size()][11];
	    for (int i = 0; i< lst.size(); i++) {
	    	   for (int j = 0; j<10; j++) {
	    		   data [i][0]= lst.get(i).getRoute();
	    		   data [i][1]= lst.get(i).getSource();
	    		   data [i][2]= lst.get(i).getDeparture_Time();
	    		   data [i][3]= lst.get(i).getArrival_Time();
	    		   data [i][4]= String.valueOf((lst.get(i).getTotalSeats()));
	    		   data [i][5]= String.valueOf(lst.get(i).getSeats_Available_current());
	    		   data [i][6]= lst.get(i).isStatus();
	    		   data [i][7]= lst.get(i).getid();
	    		   data [i][8]= String.valueOf(lst.get(i).getDistance());
	    		   data [i][9]= lst.get(i).getDestination();
	    		   data [i][10]= String.valueOf(lst.get(i).getDuration_hours());
	    		   
	    		   
	    		   
	    	   }
	    		  
	   		}
	    
	    JLabel lblNewLabel = new JLabel("Source");
	    lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
	    lblNewLabel.setBounds(171, 335, 74, 14);
	    contentPane.add(lblNewLabel);
	    
	    lblNewLabel_2 = new JLabel("New label");
	    lblNewLabel_2.setBounds(171, 363, 74, 14);
	    contentPane.add(lblNewLabel_2);
	   
	    JLabel lblDestination = new JLabel("Destination");
	    lblDestination.setFont(new Font("Tahoma", Font.BOLD, 11));
	    lblDestination.setBounds(245, 335, 74, 14);
	    contentPane.add(lblDestination);
	    
	    lblNewLabel_3 = new JLabel("New label");
	    lblNewLabel_3.setBounds(245, 363, 74, 14);
	    contentPane.add(lblNewLabel_3);
	    
	    JLabel lblDeparture = new JLabel("Departure");
	    lblDeparture.setFont(new Font("Tahoma", Font.BOLD, 11));
	    lblDeparture.setBounds(329, 335, 74, 14);
	    contentPane.add(lblDeparture);
	    
	    JLabel lblArrival = new JLabel("Arrival");
	    lblArrival.setFont(new Font("Tahoma", Font.BOLD, 11));
	    lblArrival.setBounds(399, 335, 74, 14);
	    contentPane.add(lblArrival);
	    
	     lblNewLabel_4 = new JLabel("New label");
	    lblNewLabel_4.setBounds(329, 363, 49, 14);
	    contentPane.add(lblNewLabel_4);
	    
	     lblNewLabel_5 = new JLabel("New label");
	    lblNewLabel_5.setBounds(399, 363, 49, 14);
	    contentPane.add(lblNewLabel_5);
	    
	    JLabel lblAirplaneId = new JLabel("Airplane ID");
	    lblAirplaneId.setFont(new Font("Tahoma", Font.BOLD, 11));
	    lblAirplaneId.setBounds(464, 335, 74, 14);
	    contentPane.add(lblAirplaneId);
	    
	    lblNewLabel_6 = new JLabel("New label");
	    lblNewLabel_6.setBounds(474, 363, 49, 14);
	    contentPane.add(lblNewLabel_6);
	    
	    JLabel lblDuration = new JLabel("Duration");
	    lblDuration.setFont(new Font("Tahoma", Font.BOLD, 11));
	    lblDuration.setBounds(560, 335, 74, 14);
	    contentPane.add(lblDuration);
	    
	     lblNewLabel_8 = new JLabel("New label");
	    lblNewLabel_8.setBounds(560, 363, 49, 14);
	    contentPane.add(lblNewLabel_8);
        
		
	    JLabel lbl9 = new JLabel("New label");
	    lbl9.setBounds(171, 458, 111, 14);
	    contentPane.add(lbl9);
	     model = new DefaultTableModel(data,column);
         jt=new JTable(); 

		int row = jt.getSelectedRow();
		
		
		// calling the function which will set the values of the selected row into the labels 
        jt.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		
        		jTable2MouseClicked(e);
        		
        		

				
				
        	}
        });
        
	    jt.setModel(model);
        jt.setBounds(254, 467, -52, -31);    
        contentPane.add(jt);
        JScrollPane pane=new JScrollPane(jt); 
	    pane.setBounds(10, 117, 827, 179);
	    contentPane.add(pane);
	    
	    JLabel lb = new JLabel("How many Seats: ");
	    lb.setBounds(10, 335, 124, 14);
	    contentPane.add(lb);
	    
	    tf = new JTextField();
	    tf.setBounds(10, 360, 102, 20);
	    contentPane.add(tf);
	    tf.setColumns(10);
	    
	    JButton btnNewButton = new JButton("Select");
	    btnNewButton.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		
	    		String tf2 = model.getValueAt(jt.getSelectedRow(), 6).toString();
	    		String tf21 = tf2.toLowerCase();
	    		
	    		// if the flight status is set to no, prompt the user to select another flight
	    		if(tf21.contains("no"))
	    		{
	    			JOptionPane.showMessageDialog(null, "Flight Not Available, Please Select Another Flight!");
					return;
			       
	    			
	    		}
	    		
	    		
	    		String tf1 = tf.getText();
	    		
	    		// making sure that value entered into the textfield is in integer format
	    		int tf12 = Integer.parseInt(tf1);
				try
				{
					Integer.parseInt(tf1);
					
				}
				
				catch(Exception e1){
			        
					JOptionPane.showMessageDialog(null, "Please Enter Correct Number of Seats !");
					return;
			       
			    }
				
	
				
				String current = model.getValueAt(jt.getSelectedRow(), 5).toString();
	    		int current1 = Integer.parseInt(current);
	    		
	    		// if the current seats are less than and equal to 0, prompt the user to select another flight
	    		if(current1<=0)
	    		{
	    			JOptionPane.showMessageDialog(null, "Flight Seats Not Available, Please Select Another Flight!");
					return;
	    			
	    		}
	    		
	    		// if the entered selected seats are greater than the current seats, then enter less amount of seats
	    		if(tf12>current1)
	    		{
	    			JOptionPane.showMessageDialog(null, "Select a Lower Amount of Seats!");
					return;
	    		}
	    		
				
				
				
				JOptionPane.showMessageDialog(null, "Number of Seats Selected!");
				
	    	}
	    });
	    btnNewButton.setBounds(10, 391, 89, 23);
	    contentPane.add(btnNewButton);
	    
	    JLabel lblNewLabel_7 = new JLabel("Total Amount:");
	    lblNewLabel_7.setBounds(171, 433, 124, 14);
	    contentPane.add(lblNewLabel_7);
	    
	  
	    
	    
	    // if the button is clicked then the flight will be booked
	    JButton btnNewButton_1 = new JButton("Book");
	    btnNewButton_1.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		
	    		String current = model.getValueAt(jt.getSelectedRow(), 5).toString();
	    		int current1 = Integer.parseInt(current);
	    		
	    		// if the current seats are greater than or equal to 0 then prompt to select another flight
	    		if(current1<=0)
	    		{
	    			JOptionPane.showMessageDialog(null, "Flight Seats Not Available, Please Select Another Flight!");
					return;
	    			
	    		}
	    		
	    		String tf1 = tf.getText();
	    		int tf12 = Integer.parseInt(tf1);
	    		
	    		// if the selected seats are greater than the current then prompt to enter lower seats
	    		if(tf12>current1)
	    		{
	    			JOptionPane.showMessageDialog(null, "Select a Lower Amount of Seats!");
					return;
	    		}
	    		
	    		
	    		
	    		String tf2 = model.getValueAt(jt.getSelectedRow(), 6).toString();
	    		String tf21 = tf2.toLowerCase();
	    		
	    		// if the flight availability status is set to no, then prompt user to select another flight
	    		if(tf21.contains("no"))
	    		{
	    			JOptionPane.showMessageDialog(null, "Flight Not Available, Please Select Another Flight!");
					return;
			       
	    			
	    		}
	    		
	    		// if no seats are selected then prompt to enter seats
	    		
	    		if(tf.getText().isBlank())
	    		{
	    			JOptionPane.showMessageDialog(null, "Please Select Seats!");
					return;
	    		}
	    		
	    		
	    	
	    	int noSeats = Integer.parseInt(tf.getText());
	    	double duration = Double.parseDouble(lblNewLabel_8.getText());
	    	
	    	Booking obj = new Booking();
	    	
	    	// caluclating the cost of the local flight
	    	obj.setNo_of_seats(noSeats);
	    	int cost = obj.getLocal_flight_cost();
	    	double tax = obj.getLocal_tax();
	    	int getSeats = obj.getNo_of_seats();
	    	obj.setDuration(duration);
	    	double duration1 = obj.getDuration();
	    	double totalTax = (cost*tax) + cost;
	    	double total = totalTax*getSeats*duration1;
	    	String total1 = String.valueOf(total);
	        lbl9.setText(total1);
	        
	        // updating the remaining current seats
	        String tf6= model.getValueAt(jt.getSelectedRow(), 5).toString();
	        int tf61 = Integer.parseInt(tf6);
	        int tf62 = tf61 - getSeats;
	        String tf63= String.valueOf(tf62);
	        model.setValueAt(tf63, jt.getSelectedRow(), 5);
	        
	        // adding the data to arraylist
	        
	        lst.get(jt.getSelectedRow()).seats_Available_current = tf62;
	        
	        
	        JOptionPane.showMessageDialog(null, "Your Total Amount is: "  + total);
	        
	        // creating a new frame to confirm the transaction 
	        JFrame frame = new JFrame();
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().setBackground(Color.WHITE);
	        frame.setSize(200,200);

	        JPanel panel = new JPanel(); 

	        JLabel label=new JLabel("Enter Account Details");
	        panel.add(label); 

	        JTextField jtf = new JTextField();
	       
	        panel.add(jtf); 
	        jtf.setColumns(10);
	        
	        JLabel label1=new JLabel("Enter CNIC: ");
	        panel.add(label1);
	        
	        JTextField jtf1 = new JTextField();
		       
	        panel.add(jtf1); 
	        jtf1.setColumns(10);
	        
	        // if the account no and the cnic entered match with passenger entered data then 
	        // the transaction is approved
	        
	        JButton Button = new JButton("Submit");
	        Button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					
		    		
					
					String tf0 = jtf.getText();
					String tf01 = jtf1.getText();
					for(int i=0 ;i<lst1.size();i++)
					{
						if(lst1.get(i).getAccountNo().equals(tf0) &&  lst1.get(i).getCNIC().equals(tf01))
						{
							JOptionPane.showMessageDialog(null, "Account Verified! Your Total Amount is " + total);
							frame.dispose();
							
						}
						
						
					}
					
				}
	        }); 
	        
	        panel.add(Button); 
	        
	        frame.getContentPane().add(panel); 
	        frame.setVisible(true);
	       
	        
	        
	        //--------------------------
	    	}
	    });
	    btnNewButton_1.setBounds(710, 597, 89, 23);
	    contentPane.add(btnNewButton_1);
	    
	    
	    
	}
	
	// function for getting the values of the cells of the selected rows and setting them to textfields
	 private void jTable2MouseClicked(MouseEvent evt)
	 {
		 
		 
		 
		 String tf1 = model.getValueAt(jt.getSelectedRow(), 0).toString();
			String tf2 = model.getValueAt(jt.getSelectedRow(), 1).toString();
			String tf3= model.getValueAt(jt.getSelectedRow(), 2).toString();
			String tf4= model.getValueAt(jt.getSelectedRow(), 3).toString();
			String tf5= model.getValueAt(jt.getSelectedRow(), 4).toString();
			String tf6= model.getValueAt(jt.getSelectedRow(), 5).toString();
			String tf7= model.getValueAt(jt.getSelectedRow(), 6).toString();
			String tf8= model.getValueAt(jt.getSelectedRow(), 7).toString();
			String tf= model.getValueAt(jt.getSelectedRow(), 8).toString();
			String tf9= model.getValueAt(jt.getSelectedRow(), 9).toString();
			String tf10= model.getValueAt(jt.getSelectedRow(), 10).toString();
			
			lblNewLabel_2.setText(tf1);
			lblNewLabel_3.setText(tf2);
			lblNewLabel_4.setText(tf3);
			lblNewLabel_5.setText(tf4);
			lblNewLabel_6.setText(tf8);
			
			lblNewLabel_8.setText(tf10);
		 
	 }
}

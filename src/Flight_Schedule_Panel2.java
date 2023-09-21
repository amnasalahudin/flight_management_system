import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class Flight_Schedule_Panel2 extends JFrame {

	private JPanel contentPane;
	// getting the international flight arraylist
	static ArrayList<International> lst = Add_International_Flight.getList();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Flight_Schedule_Panel2 frame = new Flight_Schedule_Panel2(lst);
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
	public Flight_Schedule_Panel2(ArrayList<International> lst) {
		
		/* getting the values from the international flight arraylist and setting 
		 * the values into the table */
		
		JFrame f;    
        
        f=new JFrame();    
        f.setTitle("International Flight Scedule");
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
	    
        String column[]={"Source","Destination","Deaparture Time","Arrival Time","Total Seats","Current Seats Available", "Flight Available Status", "Airplane ID", "Distance", "Route", "Duration"};        
        JTable jt=new JTable(data,column);    
        jt.setBounds(40,50,200,300);          
        JScrollPane sp=new JScrollPane(jt);    
        f.getContentPane().add(sp, BorderLayout.NORTH);
        f.setSize(848,462);    
        f.setVisible(true);  
        
		
		
	}

}

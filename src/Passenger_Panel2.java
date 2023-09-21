import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Passenger_Panel2 extends JFrame {

	private JPanel contentPane;
	
	// getting the local flight arraylist 
	static ArrayList<Local> lst = Add_Local_Flight.getList();
	// getting the local international arraylist 
	static ArrayList<International> lst1 = Add_International_Flight.getList();
	// getting the passenger arraylist 
	static ArrayList<Passenger> lst2 = PassengerRegistration.getList();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Passenger_Panel2 frame = new Passenger_Panel2(lst2);
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
	public Passenger_Panel2(ArrayList<Passenger> lst2) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// if the button is clicked then main menu frame  is opened 
		
		JButton btnNewButton_2 = new JButton("Main Menu");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MainMenu obj = new MainMenu();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(10, 11, 111, 23);
		contentPane.add(btnNewButton_2);
		
		
		// if the button is clicked then passenger panel frame  is opened 
		JButton btnNewButton_2_1 = new JButton("Passenger Panel");
		btnNewButton_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Passenger_Panel obj = new Passenger_Panel();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2_1.setBounds(302, 11, 134, 23);
		contentPane.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("NPAFS");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 17));
		lblNewLabel_1.setBounds(176, 55, 64, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPassengerMenu = new JLabel("Passenger Menu");
		lblPassengerMenu.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblPassengerMenu.setBackground(Color.GRAY);
		lblPassengerMenu.setBounds(144, 80, 148, 27);
		contentPane.add(lblPassengerMenu);
		
		// if the button is clicked then book local flight frame  is opened 
		JButton btnNewButton = new JButton("Book Local Flight");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Book_Local_Flight obj = new Book_Local_Flight(lst);
				obj.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBounds(32, 131, 208, 23);
		contentPane.add(btnNewButton);
		
		// if the button is clicked then book international frame  is opened 
		JButton btnBookInternationalFlight = new JButton("Book International Flight");
		btnBookInternationalFlight.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				 JFrame frame = new JFrame();
			        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        frame.getContentPane().setBackground(Color.WHITE);
			        frame.setSize(200,200);

			        JPanel panel = new JPanel(); 

			        JLabel label=new JLabel("Enter CNIC");
			        panel.add(label); 

			        JTextField jtf = new JTextField();
			       
			        panel.add(jtf); 
			        jtf.setColumns(10);
			        
			        // if the passenger has a visa passport then the passenger can book an international flight
			        
			        JButton Button = new JButton("Submit");
			        Button.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							
							String jtf0 = jtf.getText();
							
							// check if passport if local or visa
							if(passportCheck(jtf0) == true)
							{
								
								Book_International_Flights obj = new Book_International_Flights(lst1);
								obj.setVisible(true);
								dispose();
								
								
							}
							else
								return;
								
							
				    		
							
							
							
						}
			        }); 
			        
			        panel.add(Button); 
			        
			        frame.getContentPane().add(panel); 
			        frame.setVisible(true);
			       
			        
			        
				
				
				
				
				
				
				
			}
		});
		btnBookInternationalFlight.setBounds(32, 165, 208, 23);
		contentPane.add(btnBookInternationalFlight);
	}
	// check if passport if local or visa
	public boolean passportCheck(String cnic)
	{
		for(int i=0 ;i<lst2.size();i++)
		{
			if((lst2.get(i).getPassport().contains("visa") || lst2.get(i).getPassport().contains("Visa") || lst2.get(i).getPassport().contains("VISA")) && lst2.get(i).getCNIC().equals(cnic))
			{
				
				return true;
				
			}
			
			
		}
		
		JOptionPane.showMessageDialog(null, "You cannot Book an International Flight!");
		return false;
		
	}

}

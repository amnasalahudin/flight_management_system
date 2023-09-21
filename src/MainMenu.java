import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class MainMenu extends JFrame {

	private JPanel contentPane;
	// getting the arraylist of local flight class
	static ArrayList<Local> lst = Add_Local_Flight.getList();
	// getting the arraylist of international flight class
	static ArrayList<International> lst1 = Add_International_Flight.getList();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("NPAFS");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 19));
		lblNewLabel_1.setBounds(121, 37, 77, 19);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Main Menu");
		lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(105, 67, 125, 22);
		contentPane.add(lblNewLabel_1_1);
		
		// if button is pressed then admin panel frame is opened 
		JButton btnNewButton = new JButton("Admin Panel");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Admin_Panel obj = new Admin_Panel();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(51, 121, 205, 37);
		contentPane.add(btnNewButton);
		
		// if button is pressed then passenger panel frame is opened 
		
		JButton btnPassengerPanel = new JButton("Passenger Panel");
		btnPassengerPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Passenger_Panel obj = new Passenger_Panel();
				obj.setVisible(true);
				dispose();
			}
		});
		btnPassengerPanel.setBounds(51, 169, 205, 37);
		contentPane.add(btnPassengerPanel);
		
		// if button is pressed then local flight schedule  frame is opened 
		
		JButton btnInformationAboutNpfas = new JButton("Local Flight Schedule");
		btnInformationAboutNpfas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Flight_Schedule_Panel obj = new Flight_Schedule_Panel(lst);
				obj.setVisible(true);
				
			}
		});
		btnInformationAboutNpfas.setBounds(51, 217, 205, 37);
		contentPane.add(btnInformationAboutNpfas);
		
		// if button is pressed then international flight schedule frame is opened 
		JButton btnNewButton_1 = new JButton("International Flight Schedule");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Flight_Schedule_Panel2 obj = new Flight_Schedule_Panel2(lst1);
				obj.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(51, 265, 205, 37);
		contentPane.add(btnNewButton_1);
	}
}

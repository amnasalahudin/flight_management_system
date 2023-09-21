import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class PassengerLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	// getting the arraylist of passenger Class
	static ArrayList<Passenger> lst = PassengerRegistration.getList();
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					PassengerLogin frame = new PassengerLogin(lst);
					frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * 
	 */
	
	
	public PassengerLogin(ArrayList<Passenger> lst ) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("NPAFS");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 17));
		lblNewLabel_1.setBounds(171, 35, 64, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPassengerLogin = new JLabel("Passenger Login");
		lblPassengerLogin.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblPassengerLogin.setBackground(Color.GRAY);
		lblPassengerLogin.setBounds(139, 60, 148, 27);
		contentPane.add(lblPassengerLogin);

		// when button is clicked main menu frame is called
		JButton btnNewButton = new JButton("Main Menu");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				MainMenu obj = new MainMenu();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(10, 11, 97, 38);
		contentPane.add(btnNewButton);
		

		// when button is clicked passenger panel  frame is called
		JButton btnNewButton_1 = new JButton("Passenger Panel");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Passenger_Panel obj = new Passenger_Panel();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(322, 11, 132, 38);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Email:");
		lblNewLabel.setBounds(167, 109, 86, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(139, 137, 148, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password:");
		lblNewLabel_2.setBounds(150, 185, 74, 14);
		contentPane.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(139, 230, 148, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton_2 = new JButton("Login");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				// iterating through the passenger arraylist 
				// if the entered email and password matches the data stored in 
				// the arraylist then login is successful and passenger menu is opened 
				
				if(loginCheck() == true)
				{
					Passenger_Panel2 obj = new Passenger_Panel2(lst);
					obj.setVisible(true);
					dispose();
					
				}
				
				else
					return;
			
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(146, 280, 89, 23);
		contentPane.add(btnNewButton_2);
		
		
	}
	
	// function for iterating through the passenger arraylist 
	// if the entered email and password matches the data stored in 
	// the arraylist then login is successful and passenger menu is opened 
	
	public boolean loginCheck()
	{
		
		String email = textField.getText();
		String password = passwordField.getText();
		
		
		
		for(int i=0 ;i<lst.size();i++)
		{
			if(lst.get(i).getEmail().equals(email)  && lst.get(i).getPassword().equals(password))
			{
				return true;
				
				
			}
			
			
		}
		
		
		passwordField.setText("");
	    
	    JOptionPane.showMessageDialog(null,
	            "Wrong username or password.\n\n"
	            + "Please reenter details.\n\n",
	            "Passenger Authorization Failed",
	            JOptionPane.ERROR_MESSAGE);
	    return false ;
		
		
		
	}
}

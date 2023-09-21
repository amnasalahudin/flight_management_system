import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Admin_Registration extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	// arraylist for admin class
	private static ArrayList<Admin> lst = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Registration frame = new Admin_Registration();
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
	public Admin_Registration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("NPAFS");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 17));
		lblNewLabel_1.setBounds(165, 52, 64, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPassengerRegistration = new JLabel("Admin Registration");
		lblPassengerRegistration.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblPassengerRegistration.setBackground(Color.GRAY);
		lblPassengerRegistration.setBounds(126, 77, 183, 27);
		contentPane.add(lblPassengerRegistration);
		
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
		
		JButton btnNewButton_1 = new JButton("Admin Panel");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Admin_Panel obj = new Admin_Panel();
				obj.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1.setBounds(294, 11, 132, 38);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(21, 125, 49, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(11, 144, 176, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setBounds(10, 185, 49, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(11, 210, 176, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setBounds(10, 253, 79, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Re - enter Password");
		lblNewLabel_4.setBounds(10, 339, 144, 14);
		contentPane.add(lblNewLabel_4);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(10, 291, 177, 20);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(10, 367, 177, 20);
		contentPane.add(passwordField_1);
		
		// if button is clicked then admin is registered 
		JButton btnNewButton_2 = new JButton("Register");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				// if text field is empty prompt to enter details
				if(textField.getText().isEmpty() || textField_1.getText().isEmpty() || passwordField.getText().isEmpty() || passwordField_1.getText().isEmpty() )
				{
					
					JOptionPane.showMessageDialog(null, "Please Enter all the details!");
					return;
					
				}
				
				String email = textField_1.getText();
				
				//regex for correct email 
				String regexEmail = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
				        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
				
				boolean validEmail1 = emailValidation(email,regexEmail);
				
				// if email is incorrect prompt to enter again
				if(!validEmail1)
				{
					JOptionPane.showMessageDialog(null, "Please Enter Correct Email!");
					return;
				}
				
				// if the admin already exists inform the user
				if(!(checkExist(textField_1.getText())))
				{
					JOptionPane.showMessageDialog(null, "Admin is already Registered!");
					return;
					
				}
				
				
				
				
				
				
				String password = passwordField.getText();
				String password2 = passwordField_1.getText();
				
				//regex for checking if the password is correct
				String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,8}$";
				
				
				
				boolean validPassword1 = passwordValidation(password,regex);
				
				// if password is incorrect enter again
				if(!validPassword1)
				{
					JOptionPane.showMessageDialog(null, "Please Enter Correct Password!");
					return;
				}
				
				
				
				boolean passRentercheck = passRenterCheck(password, password2);
				
				// if re entered password is incorrect enter again 
				if(!passRentercheck)
				{
					JOptionPane.showMessageDialog(null, "Re - Entered Password Incorrect!");
					return;
				}
				
				// add data to admin arraylist
				Admin obj = new Admin(textField.getText(),textField_1.getText(),passwordField.getText(),passwordField_1.getText());
				lst.add(obj);
				
				JOptionPane.showMessageDialog(null, "Account Created Succesfully!");
			}
		});
		btnNewButton_2.setBounds(220, 404, 89, 23);
		contentPane.add(btnNewButton_2);
	}
	
	// function for getting admin arraylist 
	public static ArrayList<Admin> getList() {
	       return lst;
	   }
	
	//function for checking correct password 
	public boolean passwordValidation(String password, String regex)
	{
		Pattern pattern = Pattern.compile(regex);
     Matcher matcher = pattern.matcher(password);
     return matcher.matches();
	}
	
	// function for checking correct email 
	public boolean emailValidation(String password, String regex)
	{
		Pattern pattern = Pattern.compile(regex);
     Matcher matcher = pattern.matcher(password);
     return matcher.matches();
	}
	

	// function for checking exisiting email 
	public boolean checkExist(String email)
	{
		for(int i=0 ;i<lst.size();i++)
		{
			if(lst.get(i).getEmail().equals(email))
			{
				return false;
			}

		}
		return true;
	}
	
	// function for checking if password and renter password are equal 
	public boolean passRenterCheck(String pass1, String pass2)
	{
		if(!(pass2.equals(pass1)))
		{
			return false;
		}
		return true;
	}

}

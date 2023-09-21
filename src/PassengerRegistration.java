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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PassengerRegistration extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_2;
	// arraylist for passenger class
	private static ArrayList<Passenger> lst = new ArrayList<>();
	private JTextField textField_3;
	private JTextField textField_4;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PassengerRegistration frame = new PassengerRegistration();
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
	public PassengerRegistration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("NPAFS");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 17));
		lblNewLabel_1.setBounds(165, 52, 64, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPassengerRegistration = new JLabel("Passenger Registration");
		lblPassengerRegistration.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblPassengerRegistration.setBackground(Color.GRAY);
		lblPassengerRegistration.setBounds(126, 77, 183, 27);
		contentPane.add(lblPassengerRegistration);
		
		JButton btnNewButton = new JButton("Main Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
		
		JButton btnNewButton_1 = new JButton("Passenger Panel");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Passenger_Panel obj = new Passenger_Panel();
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
		passwordField_1.setBounds(10, 382, 177, 20);
		contentPane.add(passwordField_1);
		
		JLabel lblNewLabel_5 = new JLabel("CNIC");
		lblNewLabel_5.setBounds(254, 125, 49, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(232, 144, 194, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		// if button is clicked then passenger is registered 
		JButton btnNewButton_2 = new JButton("Register");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				// if text field is empty prompt to enter details
				if(textField.getText().isEmpty() || textField_1.getText().isEmpty() || passwordField.getText().isEmpty() || passwordField_1.getText().isEmpty() || textField_2.getText().isEmpty() || textField_3.getText().isEmpty() || textField_4.getText().isEmpty() )
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
				
				boolean checkEmail1 = checkEmailExist(email);
				// if email already exists prompt to enter again
				if(!checkEmail1)
				{
					JOptionPane.showMessageDialog(null, "Please Enter Another Email!");
					return;
				}
				
				
				
				
				
				// if the passenger already exists inform the user
				if(!(checkExist(textField_2.getText())))
				{
					JOptionPane.showMessageDialog(null, "Passenger is already Registered!");
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
				
				String CNIC = textField_2.getText();
				boolean cnicValid = cnicValidation(CNIC);
				
				// if cnic is invalid enter again 
				if(!cnicValid)
				{
					JOptionPane.showMessageDialog(null, "Please Enter CNIC of 13 characters!");
					return;
				}
				
				String passport = textField_3.getText();
				boolean passCheck = passportCheck(passport);
				// if passport detail is invalid, enter again 
				if(!passCheck)
				{
					JOptionPane.showMessageDialog(null, "Please Enter Valid Passport Details!");
					return;
				}
				
				
				
				// add data to passenger arraylist
				Passenger obj = new Passenger(textField.getText(),textField_1.getText(),passwordField.getText(),passwordField_1.getText(),textField_2.getText(),textField_3.getText(), textField_4.getText());
				lst.add(obj);
				
				JOptionPane.showMessageDialog(null, "Account Created Succesfully!");
				
				
				
			}
			
			
		});
		
		
		btnNewButton_2.setBounds(220, 404, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_6 = new JLabel("Passport ( Local or VISA)");
		lblNewLabel_6.setBounds(242, 185, 176, 14);
		contentPane.add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setBounds(232, 210, 194, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(232, 291, 194, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Account Number");
		lblNewLabel_7.setBounds(232, 253, 125, 14);
		contentPane.add(lblNewLabel_7);
		
		
		
		
	}
	
	// function for getting passenger arraylist 
	public static ArrayList<Passenger> getList() {
	       return lst;
	   }
	
	// function for password validation
	public boolean passwordValidation(String password, String regex)
	{
		Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
	}
	
	// function for email validation
	
	public boolean emailValidation(String password, String regex)
	{
		Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
	}
	
	// function for cnic validation
	public boolean cnicValidation(String CNIC)
	{
		int maxLength = 13;
		
		boolean e = true;
		if ((CNIC.length() > maxLength  ) || ( CNIC.length() < maxLength))
		{
			e = false;
		}
		
		return e;
	}
	
	// function for checking if cnic already exits
	public boolean checkExist(String CNIC)
	{
		for(int i=0 ;i<lst.size();i++)
		{
			if(lst.get(i).getCNIC().equals(CNIC))
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
	
	// function for checking if passport is local or visa 
	public boolean passportCheck(String passport)
	{
		String pass = passport.toLowerCase();
		if(!(pass.contains("local") || pass.contains("visa")))
{
			return false;
	
}
		return true;
	}
	
	// function for checking exisiting email 
	public boolean checkEmailExist(String email)
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
}


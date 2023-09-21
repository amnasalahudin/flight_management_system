import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Admin_Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	// getting the arraylist of Admin Class
	ArrayList<Admin> lst = Admin_Registration.getList();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Login frame = new Admin_Login();
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
	public Admin_Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("NPAFS");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 17));
		lblNewLabel_1.setBounds(157, 53, 64, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblAdminLogin = new JLabel("Admin Login");
		lblAdminLogin.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblAdminLogin.setBackground(Color.GRAY);
		lblAdminLogin.setBounds(144, 78, 148, 27);
		contentPane.add(lblAdminLogin);
		
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
		
		// when button is clicked admin panel frame is called
		
		JButton btnNewButton_1 = new JButton("Admin Panel");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Admin_Panel obj = new Admin_Panel();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(281, 11, 132, 38);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Email:");
		lblNewLabel.setBounds(157, 116, 86, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(157, 141, 135, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password:");
		lblNewLabel_2.setBounds(157, 188, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(157, 213, 135, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton_2 = new JButton("Login");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String email = textField.getText();
				String password = passwordField.getText();
				
				
				// iterating through the admin arraylist 
				// if the entered email and password matches the data stored in 
				// the arraylist then login is successful and admin menu is opened 
				
				for(int i=0 ;i<lst.size();i++)
				{
					if(lst.get(i).getEmail().equals(email)  && lst.get(i).getPassword().equals(password))
					{
						Admin_Panel_2 obj = new Admin_Panel_2();
						obj.setVisible(true);
						dispose();
						
					}
				}
			}
		});
		btnNewButton_2.setBounds(178, 261, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}

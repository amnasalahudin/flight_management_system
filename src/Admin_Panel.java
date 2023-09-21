import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Admin_Panel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Panel frame = new Admin_Panel();
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
	public Admin_Panel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("NPAFS");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 17));
		lblNewLabel_1.setBounds(170, 49, 64, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblAdminPanel = new JLabel("Admin Panel");
		lblAdminPanel.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblAdminPanel.setBackground(Color.GRAY);
		lblAdminPanel.setBounds(155, 74, 148, 27);
		contentPane.add(lblAdminPanel);
		
		// if the button is pressed then main menu frame is opened 
		JButton btnNewButton_2 = new JButton("Main Menu");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				MainMenu obj = new MainMenu();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(10, 22, 111, 23);
		contentPane.add(btnNewButton_2);
		
		// if the button is pressed then admin login frame is opened 
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Admin_Login obj = new Admin_Login();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(83, 145, 89, 23);
		contentPane.add(btnNewButton);
		
		// if the button is pressed then admin registration frame is opened 
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Admin_Registration obj = new Admin_Registration();
				obj.setVisible(true);
				dispose();
				
				
			}
		});
		btnNewButton_1.setBounds(214, 145, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}

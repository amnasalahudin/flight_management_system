import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Admin_Panel_2 extends JFrame {

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
					Admin_Panel_2 frame = new Admin_Panel_2();
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
	public Admin_Panel_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("NPAFS");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 17));
		lblNewLabel_1.setBounds(166, 26, 64, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblAdminMenu = new JLabel("Admin Menu");
		lblAdminMenu.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblAdminMenu.setBackground(Color.GRAY);
		lblAdminMenu.setBounds(150, 51, 148, 27);
		contentPane.add(lblAdminMenu);
		
		// if the button is pressed then add local flight frame is opened 
		JButton btnNewButton = new JButton("Add/Change Local Flight");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Add_Local_Flight obj = new Add_Local_Flight();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(65, 143, 260, 23);
		contentPane.add(btnNewButton);
		
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
		btnNewButton_2.setBounds(10, 25, 111, 23);
		contentPane.add(btnNewButton_2);
		
		// if the button is pressed then admin panel frame is opened 
		JButton btnNewButton_1_1 = new JButton("Admin Panel");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Admin_Panel obj = new Admin_Panel();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setBounds(282, 17, 132, 38);
		contentPane.add(btnNewButton_1_1);
		
		// if the button is pressed then add international flight frame is opened 
		JButton btnNewButton_3 = new JButton("Add/Change International Flight");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Add_International_Flight obj = new Add_International_Flight();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBounds(65, 177, 260, 23);
		contentPane.add(btnNewButton_3);
	}
}

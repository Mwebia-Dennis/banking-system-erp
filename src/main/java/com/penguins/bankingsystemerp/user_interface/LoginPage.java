package com.penguins.bankingsystemerp.user_interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.SwingConstants;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;

import com.penguins.bankingsystemerp.Exceptions.AuthenticationException;
import com.penguins.bankingsystemerp.Facade.AdminFacade;
import com.penguins.bankingsystemerp.Facade.CustomerFacade;
import com.penguins.bankingsystemerp.utilities.UserRoles;

import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class LoginPage {

	private JFrame frame;
	private JTextField user_credential_textField;
	private JPasswordField passwordField;
	private static String userRole;
	
	/**
	 * Launch the application.
	 */
	public void openLoginPage(String user_Role) {
		LoginPage.userRole = user_Role;
		System.out.println(LoginPage.userRole);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		JPanel container_panel = new JPanel();
		container_panel.setBackground(Color.WHITE);
		frame.getContentPane().add(container_panel);
		container_panel.setLayout(null);
		
		JPanel left_panel = new JPanel();
		left_panel.setBorder(null);
		left_panel.setBackground(new Color(0, 0, 0));
		left_panel.setBounds(0, 0, 335, 461);
		left_panel.setLayout(null);
		container_panel.add(left_panel);
		
		JPanel login_form_panel = new JPanel();
		login_form_panel.setForeground(new Color(255, 255, 255));
		login_form_panel.setBorder(null);
		login_form_panel.setBackground(new Color(26, 26, 26));
		login_form_panel.setBackground(new Color(13, 13, 13));
		
		JLabel logo_label = new JLabel("<html><p style=\"text-align:center;\">CORPORATE BANK </p></html>");
		logo_label.setHorizontalTextPosition(SwingConstants.CENTER);
		logo_label.setFont(new Font("Times New Roman", Font.BOLD, 25));
		logo_label.setForeground(new Color(255, 255, 255));
		logo_label.setHorizontalAlignment(SwingConstants.CENTER);
		logo_label.setBounds(10, 219, 315, 83);
		left_panel.add(logo_label);
		
		JLabel horizontal_line_lbl = new JLabel("New label");
		horizontal_line_lbl.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		horizontal_line_lbl.setBounds(10, 301, 315, 1);
		left_panel.add(horizontal_line_lbl);
		
		JLabel company_logo_lbl = new JLabel("New label");
		company_logo_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		company_logo_lbl.setIcon(new ImageIcon("D:\\dennis gitonga\\java projects\\BankingSystemERP\\images\\logo.jpg"));
		company_logo_lbl.setBounds(102, 45, 154, 163);
		left_panel.add(company_logo_lbl);
		
		JLabel company_motto_lbl = new JLabel("YOUR LEADING BUSINESS PARTNER");
		company_motto_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		company_motto_lbl.setForeground(new Color(240, 248, 255));
		company_motto_lbl.setFont(new Font("SansSerif", Font.BOLD, 10));
		company_motto_lbl.setBounds(10, 313, 315, 27);
		left_panel.add(company_motto_lbl);
		login_form_panel.setBounds(331, 0, 453, 461);
		container_panel.add(login_form_panel);
		login_form_panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sign In");
		lblNewLabel.setBorder(new EmptyBorder(5, 5, 5, 5));
		lblNewLabel.setBounds(10, 11, 433, 64);
		lblNewLabel.setPreferredSize(new Dimension(86, 100));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		login_form_panel.add(lblNewLabel);
		
		user_credential_textField = new JTextField();
		user_credential_textField.setMargin(new Insets(8, 2, 8, 2));
		user_credential_textField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		user_credential_textField.setBackground(new Color(16, 16, 16));
		user_credential_textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		user_credential_textField.setForeground(new Color(255, 255, 255));
		user_credential_textField.setHorizontalAlignment(SwingConstants.LEFT);
		user_credential_textField.setBounds(79, 147, 315, 32);
		login_form_panel.add(user_credential_textField);
		user_credential_textField.setColumns(10);
		
		JLabel user_credential_lbl = new JLabel("Email or Phone Number or Id number");
		user_credential_lbl.setBackground(new Color(255, 255, 255));
		user_credential_lbl.setLabelFor(user_credential_textField);
		user_credential_lbl.setBorder(new EmptyBorder(10, 4, 10, 4));
		user_credential_lbl.setForeground(new Color(255, 255, 255));
		user_credential_lbl.setFont(new Font("Tahoma", Font.PLAIN, 11));
		user_credential_lbl.setBounds(79, 122, 315, 14);
		login_form_panel.add(user_credential_lbl);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBorder(new EmptyBorder(10, 4, 10, 4));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(79, 190, 315, 14);
		login_form_panel.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		lblNewLabel_2.setLabelFor(passwordField);
		passwordField.setMargin(new Insets(10, 2, 10, 2));
		passwordField.setBounds(79, 215, 315, 32);
		passwordField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		passwordField.setBackground(new Color(16, 16, 16));
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordField.setForeground(new Color(255, 255, 255));
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		login_form_panel.add(passwordField);
		
		JButton btnNewButton = new JButton("FORGOT PASSWORD?");
		btnNewButton.setOpaque(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(16,16,16));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(79, 286, 315, 23);
		login_form_panel.add(btnNewButton);
		
		JButton signInBtn = new JButton("Sign In");
		signInBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		signInBtn.setBorder(new LineBorder(new Color(0, 0, 128), 3, true));
		signInBtn.setBackground(new Color(0, 0, 128));
		signInBtn.setForeground(new Color(255, 255, 255));
		signInBtn.setBounds(173, 320, 125, 43);
		login_form_panel.add(signInBtn);
		signInBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				

				System.out.println("asjkdbdbjusdbuysdh");
				System.out.println(userRole);
				// login the user
				//check if all inputs are not null
				String user_credential = user_credential_textField.getText();
				String password = new String(passwordField.getPassword());
				
				if(user_credential.trim().equals("") || password.trim().equals("")) {
					
					JOptionPane.showMessageDialog(frame, "Sorry, All fields are required");
				}else {

					if(userRole == UserRoles.ADMIN) {
						
						if(new AdminFacade(user_credential, "").authenticate(password)) {
							
							frame.setVisible(false);
							new HomeAdmin().openHomePage();
							
						}else {
							JOptionPane.showMessageDialog(frame, "wrong user credentials");
						}
						
					}else if(userRole == UserRoles.CUSTOMER) {
						try {
							if(new CustomerFacade(user_credential, "").authenticate(password)) {
								
								frame.setVisible(false);
								new HomeAdmin().openHomePage();
								
							}else {
								JOptionPane.showMessageDialog(frame, "wrong user credentials");
							}
						} catch (HeadlessException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (AuthenticationException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				
				
			}
			
		});
		
		frame.setLocationRelativeTo(null);
	}
}

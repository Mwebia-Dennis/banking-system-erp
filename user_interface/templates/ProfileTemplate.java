package com.penguins.bankingsystemerp.user_interface.templates;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class ProfileTemplate {
	
	private JPanel panel = new JPanel();
	private JPanel sub_container = new JPanel();
	
	public ProfileTemplate(JPanel parent_panel) {
		
		panel.setBackground(new Color(255, 255, 255));
		parent_panel.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		sub_container.setBackground(new Color(255, 255, 255));
		sub_container.setBounds(0, 55, 853, 497);
		panel.add(sub_container);
		sub_container.setLayout(null);
		loadTopBar();
		loadMainBody();
		
	}
	
	private void loadTopBar() {
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EmptyBorder(8, 20, 8, 0));
		panel_3.setBackground(new Color(0, 0, 0));
		panel_3.setBounds(10, 11, 833, 39);
		panel.add(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.X_AXIS));
		

		JLabel lblNewLabel_15 = new JLabel("Hi Dennis, Welcome Back");
		lblNewLabel_15.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setForeground(Color.WHITE);
		panel_3.add(lblNewLabel_15);
	}
	
	private void loadMainBody() {

		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(105, 58, 646, 352);
		sub_container.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setBorder(new EmptyBorder(0, 8, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(289, 39, 102, 25);
		panel_1.add(lblNewLabel_1);
		
		JLabel name_lbl = new JLabel("Dennis Gitonga");
		name_lbl.setBorder(new EmptyBorder(0, 7, 0, 0));
		name_lbl.setFont(new Font("Tahoma", Font.BOLD, 12));
		name_lbl.setBounds(401, 39, 235, 25);
		panel_1.add(name_lbl);
		
		JLabel lblNewLabel_1_1 = new JLabel("Id Number");
		lblNewLabel_1_1.setBorder(new EmptyBorder(0, 8, 0, 0));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(289, 75, 102, 25);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Phone Number");
		lblNewLabel_1_1_1.setBorder(new EmptyBorder(0, 8, 0, 0));
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(289, 111, 102, 25);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Email:");
		lblNewLabel_1_1_1_1.setBorder(new EmptyBorder(0, 8, 0, 0));
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(289, 147, 102, 25);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_12_1 = new JLabel("121231331221");
		lblNewLabel_12_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_12_1.setBorder(new EmptyBorder(0, 7, 0, 0));
		lblNewLabel_12_1.setBounds(401, 75, 235, 25);
		panel_1.add(lblNewLabel_12_1);
		
		JLabel lblNewLabel_12_1_1 = new JLabel("0987654321");
		lblNewLabel_12_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_12_1_1.setBorder(new EmptyBorder(0, 7, 0, 0));
		lblNewLabel_12_1_1.setBounds(401, 111, 235, 25);
		panel_1.add(lblNewLabel_12_1_1);
		
		JLabel lblNewLabel_12_1_1_1 = new JLabel("sdfs@asdf.com");
		lblNewLabel_12_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_12_1_1_1.setBorder(new EmptyBorder(0, 7, 0, 0));
		lblNewLabel_12_1_1_1.setBounds(401, 147, 235, 25);
		panel_1.add(lblNewLabel_12_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Role:");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1.setBorder(new EmptyBorder(0, 8, 0, 0));
		lblNewLabel_1_1_1_1_1.setBounds(289, 183, 102, 25);
		panel_1.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_12_1_1_1_1 = new JLabel("Admin");
		lblNewLabel_12_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_12_1_1_1_1.setBorder(new EmptyBorder(0, 7, 0, 0));
		lblNewLabel_12_1_1_1_1.setBounds(401, 183, 235, 25);
		panel_1.add(lblNewLabel_12_1_1_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("D:\\dennis gitonga\\java projects\\BankingSystemERP\\images\\businessman-64.png"));
		lblNewLabel.setBounds(10, 11, 269, 330);
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Edit Profile");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 128)));
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(289, 272, 347, 36);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Account Number");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1.setBorder(new EmptyBorder(0, 8, 0, 0));
		lblNewLabel_1_1_1_1_1_1.setBounds(289, 220, 102, 25);
		panel_1.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_12_1_1_1_1_1 = new JLabel("ASASAS-123123-SD");
		lblNewLabel_12_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_12_1_1_1_1_1.setBorder(new EmptyBorder(0, 7, 0, 0));
		lblNewLabel_12_1_1_1_1_1.setBounds(401, 219, 235, 25);
		panel_1.add(lblNewLabel_12_1_1_1_1_1);

		
	}
}

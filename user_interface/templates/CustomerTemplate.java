package com.penguins.bankingsystemerp.user_interface.templates;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.JTableHeader;

public class CustomerTemplate extends BaseTemplateController{

	

	/**
	 *loads and controls the customer page template
	 * @author dgitonga
	 */
	
	JPanel panel = new JPanel();
	JMenuBar menuBar = new JMenuBar();
	JPanel new_customer_form = new JPanel();
	JPanel sub_container = new JPanel();
	
	public CustomerTemplate(JPanel parent_jpanel ) {
		
		
		//load the main panel
		panel.setBackground(new Color(255, 255, 255));
		parent_jpanel.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		//load the menu
		loadMenuTemplate();
		
		sub_container.setBackground(new Color(255, 255, 255));
		sub_container.setBounds(0, 44, 853, 497);
		panel.add(sub_container);
		sub_container.setLayout(null);
		
		//initially load the all customers template
		//loadAllCustomersTemplate();
	}
	
	public void loadMenuTemplate() {

		ArrayList<JMenuItem> listOfMenuItems = new ArrayList<>();

		JMenuItem mnNewMenu_1 = new JMenuItem("All Users");
		mnNewMenu_1.setMargin(new Insets(2, 2, 2, 10));
		mnNewMenu_1.setBackground(new Color(102, 102, 102));
		mnNewMenu_1.setOpaque(true);
		mnNewMenu_1.setHorizontalTextPosition(SwingConstants.LEFT);
		mnNewMenu_1.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu_1.setMaximumSize(new Dimension(150, 66));
		mnNewMenu_1.setForeground(new Color(255, 255, 255));
		mnNewMenu_1.setBorder(new LineBorder(new Color(102, 102, 102), 5, true));
		setMenuItemMouseListener(mnNewMenu_1);
		mnNewMenu_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				loadAllCustomersTemplate();
				
			}
			
		});
		listOfMenuItems.add(mnNewMenu_1);
		
		JMenuItem mnNewMenu = new JMenuItem("Register New User");
		mnNewMenu.setBackground(new Color(102, 102, 102));
		mnNewMenu.setOpaque(true);
		mnNewMenu.setHorizontalTextPosition(SwingConstants.LEFT);
		mnNewMenu.setMaximumSize(new Dimension(150, 66));
		mnNewMenu.setForeground(new Color(255, 255, 255));
		mnNewMenu.setBorder(new LineBorder(new Color(102, 102, 102), 5, true));
		mnNewMenu.setHorizontalAlignment(SwingConstants.LEFT);
		setMenuItemMouseListener(mnNewMenu);
		mnNewMenu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				loadRegisterCustomerTemplate();
				
			}
			
		});
		listOfMenuItems.add(mnNewMenu);

		JMenuBar menu_bar = setTopBarMenu(listOfMenuItems);
		
		JTextField search_transaction_input = new JTextField();
		search_transaction_input.setText("Enter id number or phone or email");
		search_transaction_input.setBorder(new EmptyBorder(4, 6, 4, 6));
		search_transaction_input.setForeground(new Color(0, 0, 0));
		search_transaction_input.setFont(new Font("Tahoma", Font.PLAIN, 11));
		search_transaction_input.setMaximumSize(new Dimension(300, 48));
		search_transaction_input.setColumns(10);
		menu_bar.add(search_transaction_input);
		
		JButton btnNewButton = new JButton("Search User");
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setMaximumSize(new Dimension(150, 48));
		menu_bar.add(btnNewButton);
		
		panel.add(menu_bar);
	}
	
	public void loadAllCustomersTemplate() {
		

		removePanel(sub_container);		
		String [] column_names = {"#", "First Name", "Last Name", "Email", "National ID", "Phone No"};
		String[][] data = {{"1", "dsd", "wdswe", "sas@sfsd.com", "121212123", "0987654321"},
				{"1", "dsd", "wdswe", "sas@sfsd.com", "121212123", "0987654321"},
				{"1", "dsd", "wdswe", "sas@sfsd.com", "121212123", "0987654321"},
				{"1", "dsd", "wdswe", "sas@sfsd.com", "121212123", "0987654321"}};

		sub_container.add(setTable(column_names,data));
		
	}
	
	public void loadRegisterCustomerTemplate() {
		
		removePanel(sub_container);
		new_customer_form.setBounds(116, 11, 639, 441);
		sub_container.add(new_customer_form);
		new_customer_form.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Register New Customer");
		lblNewLabel.setBorder(new EmptyBorder(16, 0, 15, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		new_customer_form.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel reg_customer_form = new JPanel();
		new_customer_form.add(reg_customer_form, BorderLayout.CENTER);
		reg_customer_form.setLayout(null);
		
		JLabel f_name_lbl = new JLabel("First Name");
		f_name_lbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		f_name_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		f_name_lbl.setBounds(10, 13, 110, 29);
		reg_customer_form.add(f_name_lbl);
		
		JTextField f_name_textField = new JTextField();
		f_name_textField.setBounds(130, 14, 182, 31);
		reg_customer_form.add(f_name_textField);
		f_name_textField.setColumns(10);
		
		JLabel l_name_lbl = new JLabel("Last Name");
		l_name_lbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l_name_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		l_name_lbl.setBounds(316, 13, 76, 29);
		reg_customer_form.add(l_name_lbl);
		
		JTextField l_name_textField = new JTextField();
		l_name_textField.setColumns(10);
		l_name_textField.setBounds(395, 13, 182, 31);
		reg_customer_form.add(l_name_textField);
		
		JLabel email_lbl = new JLabel("Email Address");
		email_lbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		email_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		email_lbl.setBounds(10, 64, 110, 29);
		reg_customer_form.add(email_lbl);
		
		JTextField email_textField = new JTextField();
		email_textField.setBounds(130, 64, 447, 29);
		reg_customer_form.add(email_textField);
		email_textField.setColumns(10);
		
		JLabel id_no_lbl = new JLabel("ID Number");
		id_no_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		id_no_lbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		id_no_lbl.setBounds(10, 104, 110, 29);
		reg_customer_form.add(id_no_lbl);
		
		JTextField id_no_textField = new JTextField();
		id_no_textField.setColumns(10);
		id_no_textField.setBounds(130, 104, 447, 29);
		reg_customer_form.add(id_no_textField);
		
		JLabel pass_lbl = new JLabel("Password");
		pass_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		pass_lbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		pass_lbl.setBounds(10, 144, 110, 29);
		reg_customer_form.add(pass_lbl);
		
		JLabel phone_lbl = new JLabel("Phone Number");
		phone_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		phone_lbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		phone_lbl.setBounds(10, 184, 110, 29);
		reg_customer_form.add(phone_lbl);
		
		JTextField phone_textField = new JTextField();
		phone_textField.setColumns(10);
		phone_textField.setBounds(130, 186, 195, 29);
		reg_customer_form.add(phone_textField);
		
		JLabel user_role_lbl = new JLabel("User Role");
		user_role_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		user_role_lbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		user_role_lbl.setBounds(335, 186, 93, 29);
		reg_customer_form.add(user_role_lbl);
		
		String[] user_roles = {"CUSTOMER", "ADMIN"};
		JComboBox customer_comboBox = new JComboBox(user_roles);
		customer_comboBox.setBounds(427, 188, 150, 24);
		reg_customer_form.add(customer_comboBox);
		
		JButton register_customer_btn = new JButton("Register Customer");
		register_customer_btn.setBorder(new LineBorder(new Color(0, 0, 128), 2, true));
		register_customer_btn.setBackground(new Color(0, 0, 128));
		register_customer_btn.setForeground(new Color(255, 255, 255));
		register_customer_btn.setFont(new Font("Tahoma", Font.BOLD, 14));
		register_customer_btn.setBounds(262, 273, 182, 36);
		reg_customer_form.add(register_customer_btn);
		
		JPasswordField password_textField = new JPasswordField();
		password_textField.setBounds(130, 144, 447, 26);
		reg_customer_form.add(password_textField);
	}
	
	
	
	
	
}

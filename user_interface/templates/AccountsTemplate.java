package com.penguins.bankingsystemerp.user_interface.templates;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class AccountsTemplate extends BaseTemplateController {
	

	/**
	 *loads and controls the customer page template
	 * @author dgitonga
	 */
	
	JPanel panel = new JPanel();
	JMenuBar menuBar = new JMenuBar();
	JPanel new_customer_form = new JPanel();
	JPanel sub_container = new JPanel();
	
	public AccountsTemplate(JPanel parent_panel) {
		panel.setLayout(null);
		parent_panel.add(panel, BorderLayout.CENTER);
		sub_container.setBackground(new Color(255, 255, 255));
		sub_container.setBounds(0, 44, 853, 497);
		panel.add(sub_container);
		sub_container.setLayout(null);
		setTopBarMenu();
	}

	private void setTopBarMenu() {
		
		ArrayList<JMenuItem> listOfMenuItems = new ArrayList<>();
		
		JMenuItem mnNewMenu_1 = new JMenuItem("All Accounts");
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
				setAllAccounts();
			}
			
		});
		listOfMenuItems.add(mnNewMenu_1);
		
		JMenuItem mnNewMenu = new JMenuItem("New Account");
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
				setNewAccountTemplate();
			}
			
		});
		listOfMenuItems.add(mnNewMenu);
		
		JMenuItem mnNewMenu_2 = new JMenuItem("User Account");
		mnNewMenu_2.setBackground(new Color(102, 102, 102));
		mnNewMenu_2.setOpaque(true);
		mnNewMenu_2.setHorizontalTextPosition(SwingConstants.LEFT);
		mnNewMenu_2.setMaximumSize(new Dimension(150, 66));
		mnNewMenu_2.setForeground(new Color(255, 255, 255));
		mnNewMenu_2.setBorder(new LineBorder(new Color(102, 102, 102), 5, true));
		mnNewMenu_2.setHorizontalAlignment(SwingConstants.LEFT);
		setMenuItemMouseListener(mnNewMenu_2);
		mnNewMenu_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
			
		});
		listOfMenuItems.add(mnNewMenu_2);
		
		
		JMenuBar menu_bar = setTopBarMenu(listOfMenuItems);
		
		JTextField search_transaction_input = new JTextField();
		search_transaction_input.setText("Enter Account Number");
		search_transaction_input.setBorder(new EmptyBorder(4, 6, 4, 6));
		search_transaction_input.setForeground(new Color(0, 0, 0));
		search_transaction_input.setFont(new Font("Tahoma", Font.PLAIN, 11));
		search_transaction_input.setMaximumSize(new Dimension(300, 48));
		search_transaction_input.setColumns(10);
		menu_bar.add(search_transaction_input);
		
		JButton btnNewButton = new JButton("Search Account");
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setMaximumSize(new Dimension(150, 48));
		menu_bar.add(btnNewButton);
		
		panel.add(menu_bar);
		
		
	}

	public void setAllAccounts() {
		removePanel(sub_container);
		String [] column_names = {"#", "User Name", "id number", "Account No", "Account Type", "Balance", "Branch", "Status", "Date"};
		String[][] data = {
				{"1", "dsd","1231312323", "sddfs-32323", "LOAN", "30000", "nanyuki", "ACTIVE", "12/03/2020"},
				{"1", "dsd","1231312323", "sddfs-32323", "LOAN", "30000", "nanyuki", "ACTIVE", "12/03/2020"},
				{"1", "dsd","1231312323", "sddfs-32323", "LOAN", "30000", "nanyuki", "ACTIVE", "12/03/2020"},
				{"1", "dsd","1231312323", "sddfs-32323", "LOAN", "30000", "nanyuki", "ACTIVE", "12/03/2020"},
				{"1", "dsd","1231312323", "sddfs-32323", "LOAN", "30000", "nanyuki", "ACTIVE", "12/03/2020"},
				{"1", "dsd","1231312323", "sddfs-32323", "LOAN", "30000", "nanyuki", "ACTIVE", "12/03/2020"},
				{"1", "dsd","1231312323", "sddfs-32323", "LOAN", "30000", "nanyuki", "ACTIVE", "12/03/2020"},
				{"1", "dsd","1231312323", "sddfs-32323", "LOAN", "30000", "nanyuki", "ACTIVE", "12/03/2020"}
		};

		sub_container.add(setTable(column_names,data));
		
	}

	public void setNewAccountTemplate() {
		removePanel(sub_container);
		JPanel new_transaction_form = new JPanel();
		new_transaction_form.setBounds(116, 11, 639, 441);
		sub_container.add(new_transaction_form);
		new_transaction_form.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel("New Account");
		lblNewLabel.setBorder(new EmptyBorder(16, 0, 15, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		new_transaction_form.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel transaction_form = new JPanel();
		new_transaction_form.add(transaction_form, BorderLayout.CENTER);
		transaction_form.setLayout(null);
		
		JLabel f_name_lbl = new JLabel("First Name");
		f_name_lbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		f_name_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		f_name_lbl.setBounds(10, 13, 110, 29);
		transaction_form.add(f_name_lbl);
		
		JTextField f_name_textField = new JTextField();
		f_name_textField.setBounds(130, 14, 182, 31);
		f_name_textField.setBackground(new Color(191, 191, 191));
		f_name_textField.setBorder(new LineBorder(new Color(191, 191, 191), 2, true));
		f_name_textField.setEnabled(false);
		transaction_form.add(f_name_textField);
		f_name_textField.setColumns(10);
		
		JLabel l_name_lbl = new JLabel("Last Name");
		l_name_lbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l_name_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		l_name_lbl.setBounds(316, 13, 76, 29);
		transaction_form.add(l_name_lbl);
		
		JTextField l_name_textField = new JTextField();
		l_name_textField.setColumns(10);
		l_name_textField.setBounds(395, 13, 182, 31);
		l_name_textField.setBackground(new Color(191, 191, 191));
		l_name_textField.setBorder(new LineBorder(new Color(191, 191, 191), 2, true));
		l_name_textField.setEnabled(false);
		transaction_form.add(l_name_textField);
		
		JLabel id_lbl = new JLabel("Id Number");
		id_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		id_lbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		id_lbl.setBounds(10, 64, 110, 29);
		transaction_form.add(id_lbl);
		
		JTextField id_textField = new JTextField();
		id_textField.setColumns(10);
		id_textField.setBounds(130, 64, 447, 29);
		transaction_form.add(id_textField);
		
		JLabel branch_lbl = new JLabel("Branch");
		branch_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		branch_lbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		branch_lbl.setBounds(10, 104, 110, 29);
		transaction_form.add(branch_lbl);

		final String[] branch_type = { "NAIROBI", "MERU", "KIAMBU"};
		JComboBox branch_comboBox = new JComboBox(branch_type);
		branch_comboBox.setBounds(130, 104, 447, 29);//
		transaction_form.add(branch_comboBox);
		
		JLabel account_type_lbl = new JLabel("Account Type");
		account_type_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		account_type_lbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		account_type_lbl.setBounds(10, 144, 110, 29);//
		transaction_form.add(account_type_lbl);
		
		final String[] account_types = { "SAVINGS", "LOAN"};
		JComboBox account_types_comboBox = new JComboBox(account_types);
		account_types_comboBox.setBounds(130, 144, 447, 26);//setBounds(427, 188, 150, 24);
		transaction_form.add(account_types_comboBox);
		
		
		
		JButton submit_account_btn = new JButton("Submit");
		submit_account_btn.setBorder(new LineBorder(new Color(0, 0, 128), 2, true));
		submit_account_btn.setBackground(new Color(0, 0, 128));
		submit_account_btn.setForeground(new Color(255, 255, 255));
		submit_account_btn.setFont(new Font("Tahoma", Font.BOLD, 14));
		submit_account_btn.setBounds(262, 186, 182, 36);
		transaction_form.add(submit_account_btn);
		
	}
}

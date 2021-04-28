package com.penguins.bankingsystemerp.user_interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.table.JTableHeader;

import com.penguins.bankingsystemerp.user_interface.templates.AccountsTemplate;
import com.penguins.bankingsystemerp.user_interface.templates.CustomerTemplate;
import com.penguins.bankingsystemerp.user_interface.templates.HomeTemplate;
import com.penguins.bankingsystemerp.user_interface.templates.ProfileTemplate;
import com.penguins.bankingsystemerp.user_interface.templates.TransactionsTemplate;

import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Dimension;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;
import java.awt.Insets;
import javax.swing.JTable;
import java.awt.CardLayout;
import javax.swing.border.BevelBorder;
import javax.swing.JSpinner;

public class HomeAdmin {

	private JFrame frame;
	private final JPanel container_panel = new JPanel();
	private JPanel work_station_panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public void openHomePage() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeAdmin window = new HomeAdmin();
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
	public HomeAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1093, 580);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		container_panel.setBounds(0, 0, 1077, 541);
		frame.getContentPane().add(container_panel);
		container_panel.setLayout(null);
		
		JPanel menu_panel = new JPanel();
		menu_panel.setBackground(new Color(0, 0, 0));
		menu_panel.setBounds(0, 0, 225, 541);
		container_panel.add(menu_panel);
		menu_panel.setLayout(null);
		
		JLabel logo_lbl = new JLabel("");
		logo_lbl.setIcon(new ImageIcon("D:\\dennis gitonga\\java projects\\BankingSystemERP\\images\\logo.jpg"));
		logo_lbl.setForeground(new Color(255, 255, 255));
		logo_lbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		logo_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		logo_lbl.setBounds(46, 28, 116, 82);
		menu_panel.add(logo_lbl);
		
		JLabel bank_name_lbl = new JLabel("CORPORATE BANK");
		bank_name_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		bank_name_lbl.setForeground(new Color(255, 255, 255));
		bank_name_lbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		bank_name_lbl.setBounds(10, 121, 191, 28);
		menu_panel.add(bank_name_lbl);
		
		JPanel menu_bar_panel = new JPanel();
		menu_bar_panel.setBorder(new MatteBorder(1, 0, 0, 0, (Color) Color.LIGHT_GRAY));
		menu_bar_panel.setOpaque(false);
		menu_bar_panel.setBounds(0, 171, 225, 340);
		menu_panel.add(menu_bar_panel);
		menu_bar_panel.setLayout(null);
		
		JPanel home_menu = new JPanel();
		home_menu.setBackground(new Color(0, 0, 0));
		home_menu.setBounds(0, 0, 225, 48);
		menu_bar_panel.add(home_menu);
		home_menu.setBorder(new MatteBorder(0, 0, 1, 0, new Color(77, 77, 77)));
		home_menu.setLayout(new BorderLayout(0, 0));
		addHoverListener(home_menu, "HOME");
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBorder(new EmptyBorder(0, 13, 0, 10));
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon("D:\\dennis gitonga\\java projects\\BankingSystemERP\\images\\house-24.png"));
		home_menu.add(lblNewLabel_2, BorderLayout.WEST);
		
		JLabel lblNewLabel_3 = new JLabel("HOME");
		lblNewLabel_3.setBorder(new EmptyBorder(0, 10, 0, 0));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.LEFT);
		home_menu.add(lblNewLabel_3, BorderLayout.CENTER);
		
		JPanel users_menu = new JPanel();
		users_menu.setBackground(new Color(0, 0, 0));
		users_menu.setBorder(new MatteBorder(0, 0, 1, 0, new Color(77, 77, 77)));
		users_menu.setBounds(0, 48, 225, 48);
		menu_bar_panel.add(users_menu);
		users_menu.setLayout(new BorderLayout(0, 0));
		addHoverListener(users_menu, "USERS");
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBorder(new EmptyBorder(0, 13, 0, 10));
		lblNewLabel_4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(new ImageIcon("D:\\dennis gitonga\\java projects\\BankingSystemERP\\images\\conference-24.png"));
		users_menu.add(lblNewLabel_4, BorderLayout.WEST);
		
		JLabel lblNewLabel_5 = new JLabel("USERS");
		lblNewLabel_5.setBorder(new EmptyBorder(0, 10, 0, 0));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setHorizontalTextPosition(SwingConstants.LEFT);
		users_menu.add(lblNewLabel_5, BorderLayout.CENTER);
		
		JPanel transactions_menu = new JPanel();
		transactions_menu.setBackground(new Color(0, 0, 0));
		transactions_menu.setBorder(new MatteBorder(0, 0, 1, 0, new Color(77, 77, 77)));
		transactions_menu.setBounds(0, 142, 225, 48);
		menu_bar_panel.add(transactions_menu);
		transactions_menu.setLayout(new BorderLayout(0, 0));
		addHoverListener(transactions_menu, "TRANSACTIONS" );
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBorder(new EmptyBorder(0, 13, 0, 10));
		lblNewLabel_6.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setIcon(new ImageIcon("D:\\dennis gitonga\\java projects\\BankingSystemERP\\images\\banknotes-24.png"));
		transactions_menu.add(lblNewLabel_6, BorderLayout.WEST);
		
		JLabel lblNewLabel_7 = new JLabel("TRANSACTIONS");
		lblNewLabel_7.setBorder(new EmptyBorder(0, 10, 0, 0));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setHorizontalTextPosition(SwingConstants.LEFT);
		transactions_menu.add(lblNewLabel_7, BorderLayout.CENTER);
		
		JPanel accounts_menu = new JPanel();
		accounts_menu.setBackground(new Color(0, 0, 0));
		accounts_menu.setBorder(new MatteBorder(0, 0, 1, 0, new Color(77, 77, 77)));
		accounts_menu.setBounds(0, 96, 225, 48);
		menu_bar_panel.add(accounts_menu);
		accounts_menu.setLayout(new BorderLayout(0, 0));
		addHoverListener(accounts_menu, "ACCOUNTS");
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBorder(new EmptyBorder(0, 13, 0, 10));
		lblNewLabel_8.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setIcon(new ImageIcon("D:\\dennis gitonga\\java projects\\BankingSystemERP\\images\\dollar-2-24.png"));
		accounts_menu.add(lblNewLabel_8, BorderLayout.WEST);
		
		JLabel lblNewLabel_9 = new JLabel("ACCOUNTS");
		lblNewLabel_9.setBorder(new EmptyBorder(0, 10, 0, 0));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setHorizontalTextPosition(SwingConstants.LEFT);
		accounts_menu.add(lblNewLabel_9, BorderLayout.CENTER);
		
		JPanel profile_menu = new JPanel();
		profile_menu.setBackground(new Color(0, 0, 0));
		profile_menu.setBorder(new MatteBorder(0, 0, 1, 0, new Color(77, 77, 77)));
		profile_menu.setBounds(0, 190, 225, 48);
		menu_bar_panel.add(profile_menu);
		profile_menu.setLayout(new BorderLayout(0, 0));
		addHoverListener(profile_menu, "PROFILE");
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBorder(new EmptyBorder(0, 13, 0, 10));
		lblNewLabel_10.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setIcon(new ImageIcon("D:\\dennis gitonga\\java projects\\BankingSystemERP\\images\\user-24.png"));
		profile_menu.add(lblNewLabel_10, BorderLayout.WEST);
		
		JLabel lblNewLabel_11 = new JLabel("MY PROFILE");
		lblNewLabel_11.setBorder(new EmptyBorder(0, 10, 0, 0));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setHorizontalTextPosition(SwingConstants.LEFT);
		profile_menu.add(lblNewLabel_11, BorderLayout.CENTER);
		
		JPanel logout_menu = new JPanel();
		logout_menu.setBackground(new Color(0, 0, 0));
		logout_menu.setBorder(new MatteBorder(0, 0, 1, 0, new Color(77, 77, 77)));
		logout_menu.setBounds(0, 238, 225, 48);
		menu_bar_panel.add(logout_menu);
		logout_menu.setLayout(new BorderLayout(0, 0));
		addHoverListener(logout_menu, "LOGOUT");
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setBorder(new EmptyBorder(0, 13, 0, 10));
		lblNewLabel_12.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setIcon(new ImageIcon("D:\\dennis gitonga\\java projects\\BankingSystemERP\\images\\logout-24.png"));
		logout_menu.add(lblNewLabel_12, BorderLayout.WEST);
		
		JLabel lblNewLabel_13 = new JLabel("LOGOUT");
		lblNewLabel_13.setBorder(new EmptyBorder(0, 10, 0, 0));
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_13.setForeground(Color.WHITE);
		lblNewLabel_13.setHorizontalTextPosition(SwingConstants.LEFT);
		logout_menu.add(lblNewLabel_13, BorderLayout.CENTER);
		
		JLabel copyright_lbl = new JLabel("\u00a9 2021 Penguins technologies ");
		copyright_lbl.setBorder(new EmptyBorder(5, 0, 0, 0));
		copyright_lbl.setFont(new Font("Tahoma", Font.PLAIN, 10));
		copyright_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		copyright_lbl.setForeground(new Color(0, 204, 255));
		copyright_lbl.setBounds(0, 304, 225, 25);
		menu_bar_panel.add(copyright_lbl);
		
		
		work_station_panel.setForeground(new Color(0, 153, 204));
		work_station_panel.setBackground(new Color(255, 255, 255));		
		work_station_panel.setBounds(224, 0, 853, 541);
		container_panel.add(work_station_panel);
		work_station_panel.setLayout(new BorderLayout(0, 0));
			
		//load home page initially

		new HomeTemplate(work_station_panel).loadHomePage();

	}
	
	//MAIN MENU HOVER LISTENERS
	public void addHoverListener(JPanel jPanel, String template ) {
		jPanel.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				//clear the workstation then add data;
				work_station_panel.removeAll();
				work_station_panel.revalidate();
				work_station_panel.repaint();
				
				switch(template) {
					
					case "HOME":
						
						//load home page
						new HomeTemplate(work_station_panel).loadHomePage();
						break;
					
					case "USERS":
						
						//load customer template
						new CustomerTemplate(work_station_panel).loadAllCustomersTemplate();
						break;
						
					case "ACCOUNTS":

						//load accounts template						
						new AccountsTemplate(work_station_panel).setAllAccounts();
						break;

					case "TRANSACTIONS":

						//load Transactions template
						new TransactionsTemplate(work_station_panel).setAllTransactions();
						break;

					case "PROFILE":

						//load profile						
						new ProfileTemplate(work_station_panel);
						break;

					case "LOGOUT":
						
						break;

					default:
						
						break;
						
				}
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				jPanel.setBackground(new Color(77, 77, 77));
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				jPanel.setBackground(new Color(0,0,0));
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
}

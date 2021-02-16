package com.penguins.bankingsystemerp.user_interface;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.border.LineBorder;
import java.awt.CardLayout;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.border.EmptyBorder;

public class OnlineBankingUserInterface {

	private JFrame frame;
	private JTextField start_page_text_view;
	private JTextField txtYourLeadingPartner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OnlineBankingUserInterface window = new OnlineBankingUserInterface();
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
	public OnlineBankingUserInterface() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setBackground(new Color(51, 51, 51));
		frame.setResizable(false);
		
		JPanel bg_panel = new JPanel();
		bg_panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(bg_panel);
		bg_panel.setLayout(null);
		
		JPanel logo_panel = new JPanel();
		logo_panel.setBackground(new Color(0, 0, 0));
		logo_panel.setBounds(0, 0, 878, 127);
		bg_panel.add(logo_panel);
		logo_panel.setLayout(null);
		
		JLabel logoLabel = new JLabel("CORPORATE BANK");
		logoLabel.setFont(new Font("Verdana", Font.BOLD, 28));
		logoLabel.setForeground(Color.WHITE);
		logoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		logoLabel.setBounds(252, 11, 390, 87);
		logo_panel.add(logoLabel);
		
		txtYourLeadingPartner = new JTextField();
		txtYourLeadingPartner.setBorder(null);
		txtYourLeadingPartner.setBackground(new Color(0, 0, 0));
		txtYourLeadingPartner.setForeground(Color.WHITE);
		txtYourLeadingPartner.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtYourLeadingPartner.setText("YOUR LEADING BUSINESS PARTNER");
		txtYourLeadingPartner.setHorizontalAlignment(SwingConstants.CENTER);
		txtYourLeadingPartner.setEditable(false);
		txtYourLeadingPartner.setBounds(252, 96, 390, 20);
		logo_panel.add(txtYourLeadingPartner);
		txtYourLeadingPartner.setColumns(10);
		
		JPanel container_panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(requestImage(), 0, 0, null);
            }
        };
		container_panel.setBounds(0, 126, 878, 432);
		bg_panel.add(container_panel);
		container_panel.setLayout(null);
		
		JPanel action_panel = new JPanel();
		action_panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		action_panel.setBackground(new Color(245, 255, 250));
		action_panel.setBounds(289, 73, 322, 285);
		container_panel.add(action_panel);
		action_panel.setLayout(new BorderLayout(0, 0));
		
		start_page_text_view = new JTextField();
		start_page_text_view.setEditable(false);
		start_page_text_view.setBorder(new EmptyBorder(0, 10, 10, 10));
		start_page_text_view.setBackground(new Color(245, 255, 250));
		start_page_text_view.setFont(new Font("Tahoma", Font.BOLD, 15));
		start_page_text_view.setHorizontalAlignment(SwingConstants.CENTER);
		start_page_text_view.setText("Select Account To Continue..");
		action_panel.add(start_page_text_view, BorderLayout.CENTER);
		start_page_text_view.setColumns(10);
		
		JPanel action_btn_panel = new JPanel();
		action_btn_panel.setOpaque(false);
		action_btn_panel.setPreferredSize(new Dimension(10, 40));
		action_panel.add(action_btn_panel, BorderLayout.SOUTH);
		action_btn_panel.setLayout(new GridLayout(1, 2, 25, 0));
		
		JButton customer_start_btn = new JButton("Customer");
		customer_start_btn.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		customer_start_btn.setBackground(new Color(0, 0, 0));
		customer_start_btn.setForeground(new Color(255, 255, 255));
		customer_start_btn.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

				customer_start_btn.setBackground(new Color(0, 0, 153));
				customer_start_btn.setBorder(new LineBorder(new Color(0, 0, 153), 1, true));
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

				customer_start_btn.setBackground(new Color(0, 0, 0));
				customer_start_btn.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
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
		action_btn_panel.add(customer_start_btn);
		
		JButton admin_start_btn = new JButton("Admin");
		admin_start_btn.setForeground(Color.WHITE);
		admin_start_btn.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		admin_start_btn.setBackground(new Color(0, 0, 0));
		admin_start_btn.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

				admin_start_btn.setBackground(new Color(0, 0, 153));
				admin_start_btn.setBorder(new LineBorder(new Color(0, 0, 153), 1, true));
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

				admin_start_btn.setBackground(new Color(0, 0, 0));
				admin_start_btn.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
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
		action_btn_panel.add(admin_start_btn);
	
		
				
		
		
		frame.setBounds(100, 100, 894, 597);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
	
	private Image requestImage() {
        Image image = null;

        try {
            image = ImageIO.read(new File("D:\\dennis gitonga\\java projects\\BankingSystemERP\\images\\corporate.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;
    }
}

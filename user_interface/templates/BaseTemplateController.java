package com.penguins.bankingsystemerp.user_interface.templates;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.table.JTableHeader;

public class BaseTemplateController {
	
	
	public JMenuBar setTopBarMenu(ArrayList<JMenuItem> listOfMenuItems ) {
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(new EmptyBorder(8, 6, 8, 3));
		menuBar.setBackground(new Color(0,0,16));
		menuBar.setBounds(0, 0, 853, 46);
		
		for (JMenuItem menu_item : listOfMenuItems) {
			//add menu item then add a space after each menu item
			menuBar.add(menu_item);
			
			JMenu spacer = new JMenu();
			spacer.setEnabled(false);
			spacer.setMinimumSize(new Dimension(5, 1));
			spacer.setPreferredSize(new Dimension(5, 1));
			spacer.setMaximumSize(new Dimension(5, 1));
			menuBar.add(spacer);
		}
		
		return menuBar;
	}
	
	public JPanel setTable(String[] column_names, String[][] data) {

		JPanel container_panel = new JPanel();
		container_panel.setBounds(70, 11, 728, 473);
		container_panel.setLayout(new BorderLayout(0, 0));
 		JTable table = new JTable(data, column_names);
 		table.setBackground(new Color(240, 240, 240));
 		table.setRowHeight(25);
 		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
 		JTableHeader header = table.getTableHeader();
 		header.setBackground(new Color(0, 0, 16));
 		header.setForeground(new Color(255,255,255));
 		header.setFont(new Font("Tahoma", Font.PLAIN, 12));
 		JScrollPane table_scrollPane = new JScrollPane(table);
 		table_scrollPane.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
 		    @Override
 		    protected void configureScrollBarColors() {
 		        this.thumbColor = Color.darkGray;
 		    }
 		});
		container_panel.add(table_scrollPane, BorderLayout.CENTER);
		
		return container_panel;
	}
	
	public void setMenuItemMouseListener(JMenuItem menu_item) {
		
		menu_item.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {

				menu_item.setBackground(new Color(26, 26, 26));
				menu_item.setBorder(new LineBorder(new Color(102, 102, 102), 2, true));
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {

				menu_item.setBackground(new Color(102, 102, 102));
				menu_item.setBorder(new LineBorder(new Color(102, 102, 102), 5, true));
				
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
	

	public void removePanel(JPanel sub_container) {
		sub_container.removeAll();
		sub_container.revalidate();
		sub_container.repaint();
	}
}

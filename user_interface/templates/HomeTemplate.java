package com.penguins.bankingsystemerp.user_interface.templates;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.lang.reflect.InvocationTargetException;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class HomeTemplate {
	

	JPanel panel = new JPanel();
	public HomeTemplate(JPanel parent_panel) {
		
		panel.setBackground(Color.LIGHT_GRAY);
		parent_panel.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
	}
	
	public void loadHomePage() {
		loadWelcomeBar();
		loadTopBar();
		loadHomeBody();
	}
	private void loadWelcomeBar() {

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
	private void loadTopBar() {
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 61, 833, 139);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(179, 0, 0));
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(179, 0, 0), null, new Color(179, 0, 0), null));
		panel_2.setBounds(20, 11, 246, 109);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("2000");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(88, 11, 148, 47);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New Users");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(88, 69, 148, 32);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setBackground(new Color(204, 0, 0));
		lblNewLabel_13.setOpaque(true);
		lblNewLabel_13.setIcon(new ImageIcon("D:\\dennis gitonga\\java projects\\BankingSystemERP\\images\\conference-24.png"));
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setBounds(0, 0, 78, 109);
		panel_2.add(lblNewLabel_13);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 153, 230), null, new Color(0, 153, 230), null));
		panel_2_1.setBackground(new Color(0, 153, 230));
		panel_2_1.setBounds(281, 11, 246, 109);
		panel_1.add(panel_2_1);
		
		JLabel lblNewLabel_12 = new JLabel("500,000");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setForeground(Color.WHITE);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblNewLabel_12.setBounds(88, 11, 148, 47);
		panel_2_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_1_1 = new JLabel("Total Transactions");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_1_1.setBounds(88, 69, 148, 32);
		panel_2_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_13_1 = new JLabel("");
		lblNewLabel_13_1.setIcon(new ImageIcon("D:\\dennis gitonga\\java projects\\BankingSystemERP\\images\\banknotes-24.png"));
		lblNewLabel_13_1.setOpaque(true);
		lblNewLabel_13_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13_1.setBackground(new Color(77, 195, 255));
		lblNewLabel_13_1.setBounds(0, 0, 78, 109);
		panel_2_1.add(lblNewLabel_13_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 102, 102), null, new Color(0, 102, 102), null));
		panel_2_2.setBackground(new Color(0, 102, 102));
		panel_2_2.setBounds(548, 11, 246, 109);
		panel_1.add(panel_2_2);
		
		JLabel lblNewLabel_14 = new JLabel("2000");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setForeground(Color.WHITE);
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblNewLabel_14.setBounds(88, 11, 148, 47);
		panel_2_2.add(lblNewLabel_14);
		
		JLabel lblNewLabel_1_2 = new JLabel("New Accounts");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_1_2.setBounds(88, 69, 148, 32);
		panel_2_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_13_2 = new JLabel("");
		lblNewLabel_13_2.setIcon(new ImageIcon("D:\\dennis gitonga\\java projects\\BankingSystemERP\\images\\dollar-2-24.png"));
		lblNewLabel_13_2.setOpaque(true);
		lblNewLabel_13_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13_2.setBackground(new Color(0, 179, 179));
		lblNewLabel_13_2.setBounds(0, 0, 78, 109);
		panel_2_2.add(lblNewLabel_13_2);
		
	}

	private void loadHomeBody() {
		JPanel transactions_chart_panel = new JPanel();
		transactions_chart_panel.setBackground(Color.WHITE);
		transactions_chart_panel.setBorder(new EmptyBorder(7, 7, 7, 7));
		transactions_chart_panel.setBounds(10, 211, 464, 319);
		panel.add(transactions_chart_panel);
		transactions_chart_panel.setLayout(new BorderLayout(0, 0));
		new Thread(new Runnable() {

			@Override
			public void run() {
				new HomeTemplate.TransactionsLineChart(transactions_chart_panel);			
				
			}
			
		}).start();
		
		JPanel pie_chart_panel = new JPanel();
		pie_chart_panel.setBackground(Color.WHITE);
		pie_chart_panel.setBounds(484, 211, 359, 319);
		panel.add(pie_chart_panel);
		pie_chart_panel.setLayout(new BorderLayout(0, 0));
		new Thread(new Runnable() {

			@Override
			public void run() {
				new HomeTemplate.TransactionsSummaryPieChart(pie_chart_panel);	
				
			}
			
		}).start();
	}

	
	public static class TransactionsLineChart {
		
		public TransactionsLineChart (JPanel parent_panel) {
			try {
				SwingUtilities.invokeAndWait(()->{
					
					JPanel chartPanel = createLineChartPanel();
					parent_panel.add(chartPanel, BorderLayout.CENTER);
					parent_panel.validate();
						
					
				});
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		private JPanel createLineChartPanel() {
			
			String chartTitle = "Daily Total Transactions";
			String x_axisLabel = "Week-Days";
			String y_axisLabel = "Total Amount";
			
			JFreeChart chart = ChartFactory.createLineChart(chartTitle,
					x_axisLabel, y_axisLabel, createDataSet());

			//customizing our graph
			CategoryPlot plot = chart.getCategoryPlot();
			plot.setBackgroundPaint(new Color(217, 217, 217));
			LineAndShapeRenderer renderer = new LineAndShapeRenderer();
			renderer.setSeriesPaint(0, new Color(26, 117, 255));
			plot.setRenderer(renderer);
			
			//render chat to j-panel
			ChartPanel chartPanel = new ChartPanel(chart);
			chartPanel.setMouseWheelEnabled(true);
			return chartPanel;
			
		}
		
		private CategoryDataset createDataSet() {
			DefaultCategoryDataset  dataset = new DefaultCategoryDataset ();
			String series = "Transaction Amount";
			String[] week_days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
			dataset.addValue(5000, series, week_days[0]);
			dataset.addValue(10000, series, week_days[1]);
			dataset.addValue(8300, series, week_days[2]);
			dataset.addValue(7200, series, week_days[3]);
			dataset.addValue(3752, series, week_days[4]);
			dataset.addValue(5300, series, week_days[5]);
			dataset.addValue(5000, series, week_days[6]);
			
			return dataset;
		}
	}
	
	
	public static class TransactionsSummaryPieChart {
		
		public TransactionsSummaryPieChart(JPanel parent_panel) {
			
			try {
				SwingUtilities.invokeAndWait(()->{
					
					parent_panel.add(createPieChart(), BorderLayout.CENTER);
					parent_panel.validate();
						
					
				});
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		private PieDataset createDataSet() {
			DefaultPieDataset dataset = new DefaultPieDataset( );
		    dataset.setValue( "Total Deposited Amount" , 1000);  
		    dataset.setValue( "Total Withdrawn Amount" , 5000);  
		    return dataset;  
		}
		
		private JPanel createPieChart() {
			
			String chart_title = "Transactions Summary";
			JFreeChart chart = ChartFactory.createPieChart(      
					chart_title,   // chart title 
			         createDataSet(),          // data    
			         true,             // include legend   
			         true, 
			         false);
			PiePlot plot = (PiePlot) chart.getPlot();
			plot.setBackgroundPaint(new Color(255, 255, 255));
			ChartPanel chartPanel = new ChartPanel(chart);
			chartPanel.setBounds(0,0,320,300);
			return chartPanel;
		}
		
		
	}
}

package Graphics;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JToolBar;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.imageio.ImageIO;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.ListSelectionModel;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;

import Graphics.recruitment;
import initialTables.initialTables;

import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;


public class first_window extends initialTables{

	private JFrame frame;

	private  Connection con;
	
	String [] array=new String[3];
	String katast=new String();
	String synolMistou=new String();
	String newDate=new String();
	recruitment obj;
    int ole=0;
    String[] id1=new String[50];
	/**
	 * Create the application.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
    
  //grafika gia to first window

	public first_window() throws ClassNotFoundException, SQLException {
		this.con=con; 
		initialize();
		
	//	recruitment frame = new recruitment(this);
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	
	private void initialize() throws ClassNotFoundException, SQLException {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(224, 255, 255));
		 
	//	JLabel background=new JLabel(new ImageIcon(this.getClass().getResource("/personal.png")));
		//frame.add(background);
		frame.setContentPane(new JLabel(new ImageIcon(this.getClass().getResource("/Mainframe.png"))));
		frame.getContentPane().setLayout(new FlowLayout()); 
		frame.setResizable(false);
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		JButton btnNewButton = new JButton("");
		btnNewButton.setOpaque(false);
		btnNewButton.setContentAreaFilled(false);
		//btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 16));
		//btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
	//	btnNewButton.setBackground(SystemColor.textHighlight);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj=new recruitment(first_window.this);

				
			//	obj.setContentPane(new JLabel(new ImageIcon(this.getClass().getResource("/singre.png"))));
			
			}
		});
		btnNewButton.setBounds(990, 15, 135, 45);
		frame.getContentPane().add(btnNewButton);
		
		
		
		JButton btnNeaSymbash = new JButton("Sign up admin");
		btnNeaSymbash.setBackground(SystemColor.textHighlight);
		btnNeaSymbash.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNeaSymbash.setOpaque(false);
		btnNeaSymbash.setContentAreaFilled(false);
		btnNeaSymbash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}

		});
		btnNeaSymbash.setBounds(990, 60, 135, 20);
		frame.getContentPane().add(btnNeaSymbash);
		
		JButton btnAllaghStoixeion = new JButton("Gerani Palace");
		btnAllaghStoixeion.setBackground(SystemColor.textHighlight);
		btnAllaghStoixeion.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAllaghStoixeion.setOpaque(false);
		btnAllaghStoixeion.setContentAreaFilled(false);
		btnAllaghStoixeion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Change_data obj6=new Change_data();
				obj6.setContentPane(new JLabel(new ImageIcon(this.getClass().getResource("/estia.png"))));
			
				obj6.setVisible(true);
			}
		});
		btnAllaghStoixeion.setBounds(25, 445, 520, 71);
		frame.getContentPane().add(btnAllaghStoixeion);
		
		
		JButton btnNewButton_1 = new JButton("111111111111");
		btnNewButton_1.setBorder(new LineBorder(new Color(255, 255, 0), 2, true));
		btnNewButton_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(632, 172, 466, 57);
	
		
		JButton btnNewButton_1_2 = new JButton("2222222222222");
		btnNewButton_1_2.setBorder(new LineBorder(new Color(255, 255, 0), 2, true));
		btnNewButton_1_2.setBackground(SystemColor.textHighlight);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1_2.setBounds(632, 330, 466, 57);
		
		
		JButton btnNewButton_1_1 = new JButton("333333333333");
		btnNewButton_1_1.setBorder(new LineBorder(new Color(255, 255, 0), 2, true));
		btnNewButton_1_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_1.setBounds(632, 242, 142, 57);
		
		
		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.setBorder(new LineBorder(new Color(255, 255, 0), 2, true));
		btnNewButton_1_1_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_1_1.setBounds(794, 242, 142, 57);
	
		
		JButton btnNewButton_1_1_2 = new JButton("5");
		btnNewButton_1_1_2.setBorder(new LineBorder(new Color(255, 255, 0), 2, true));
		btnNewButton_1_1_2.setBackground(SystemColor.textHighlight);
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_1_2.setBounds(957, 242, 142, 57);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.BOLD, 15));
		comboBox.setBackground(Color.LIGHT_GRAY);
	
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBorder(new LineBorder(new Color(255, 255, 0), 2, true));
		btnNewButton_2.setBackground(SystemColor.textHighlight);
	
		
		JButton btnNewButton_2_1 = new JButton("");
		btnNewButton_2_1.setBorder(new LineBorder(new Color(255, 255, 0), 2, true));
		btnNewButton_2_1.setBackground(SystemColor.textHighlight);
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
	
		btnNewButton_2_1.setBounds(645, 529, 452, 70);
		
		frame.setBounds(100, 100, 1144, 769);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		frame.setBounds(100, 100, 1164, 780);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame f;  
				    f=new JFrame();  
			}
		});
		
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame f;  
				    f=new JFrame();  
			}
		});
		
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame f;  
				    f=new JFrame();  
			}
		});
		
		
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame f;  
				    f=new JFrame();  
			}
		});
	}
	public String department1(JComboBox comboBox) {
		
		String department=comboBox.getSelectedItem().toString();
		return department;
	}
}
	

	
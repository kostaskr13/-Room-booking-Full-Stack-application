package Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.RootPaneContainer;
import javax.swing.JComboBox;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import initialTables.initialTables;
import Graphics.first_window;


public class recruitment extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private final first_window first;

	int misthos1[]=new int[50];
	String[] id=new String[50];

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	
	//grafika gia to recruitment
	
	public recruitment(first_window first) {

		 
		this.first=first;
		id=first.id1;
		setBounds(100, 100, 637, 827);
		contentPane = new JPanel();


		BufferedImage backgroundImage;
			try {
				backgroundImage = ImageIO.read(new File("singre.jpg"));
			//	contentPane.add(backgroundImage);
			} catch (IOException e) {
				e.printStackTrace();
			}

			 
			 
	
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		JLabel lblName =new JLabel("name");// new JLabel("\u039F\u03BD\u03BF\u03BC\u03B1:");
		lblName.setFont(new Font("Arial", Font.BOLD, 16));
		lblName.setBounds(12, 23, 70, 48);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(75, 31, 172, 34);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel userName =new JLabel("username");// new JLabel("\u039F\u03BD\u03BF\u03BC\u03B1:");
		userName.setFont(new Font("Arial", Font.BOLD, 16));
		userName.setBounds(12, 100, 70, 48);
		contentPane.add(userName);
		
		textField1 = new JTextField();
		textField1.setBounds(75, 100, 172, 34);
		contentPane.add(textField1);
		textField1.setColumns(10);
	
	
	
		
		JLabel lblAdress = new JLabel("email");
		lblAdress.setFont(new Font("Arial", Font.BOLD, 16));
		lblAdress.setBounds(12, 150, 90, 48);
		lblAdress.setVisible(true);
		contentPane.add(lblAdress);
		setVisible(true);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(98, 150, 225, 34);
		contentPane.add(textField_2);
		
		JLabel lblPhoneNumber = new JLabel("phone");
		lblPhoneNumber.setFont(new Font("Arial", Font.BOLD, 16));
		lblPhoneNumber.setBounds(10, 200, 90, 48);
		contentPane.add(lblPhoneNumber);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(98, 200, 188, 34);
		contentPane.add(textField_3);
		
		JLabel lblIban = new JLabel("password");
		lblIban.setFont(new Font("Arial", Font.BOLD, 16));
		lblIban.setBounds(12, 300, 50, 48);
		contentPane.add(lblIban);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(59, 300, 225, 34);
		contentPane.add(textField_4);
		
		JLabel lblBank = new JLabel("verify password");
		lblBank.setFont(new Font("Arial", Font.BOLD, 16));
		lblBank.setBounds(12, 350, 73, 48);
		contentPane.add(lblBank);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(86, 350, 225, 34);
		contentPane.add(textField_5);
		
		
		
		JButton btnNewButton = new JButton("eggrafi");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 16));
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(12, 708, 607, 60);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame f;  
			    f=new JFrame();  
			    
			    
			    JOptionPane.showMessageDialog(f,"Success","singing user",JOptionPane.INFORMATION_MESSAGE);  
		
				
			}
		});
		
		
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
			
			  public void actionPerformed(ActionEvent e) {
						String nameString=textField.getText();
						String usernameString=textField1.getText();
						String passString=textField_4.getText();
						String emailString=textField_2.getText();
						String phoneNumberString=textField_3.getText();
						
						
						String vpassString=textField_5.getText();
						/*String ageString=comboBox.getSelectedItem().toString();
						String employTypeString=comboBox_1.getSelectedItem().toString();
						String yearString=comboBox_2.getSelectedItem().toString();
						String monthString=comboBox_3.getSelectedItem().toString();
						String dayString=comboBox_4.getSelectedItem().toString();
						String kids=comboBox_5.getSelectedItem().toString();
						String ages=textField_6.getText();*/
						String JSON;
						Boolean mar;
						
					
						JSON = "INSERT IGNORE INTO user(name,username,password,email,phone)"
				        		+ " VALUES ('"+nameString+"','"+ usernameString+"','"+passString+"','"+emailString+"','"+phoneNumberString+"')";
				
								try {
									stelios(JSON);
								} catch (ClassNotFoundException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								} catch (SQLException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							
						

			  }
		});
		setVisible(true);
		
	}
	
	//sunartisi gia conection
	public void stelios(String JSON)throws SQLException, ClassNotFoundException {
		System.out.println("started  :");
		Connection con= initialTables.getConnection();
      Statement stmt = con.createStatement();
      stmt.executeUpdate(JSON);
      
      stmt.close();
      con.close();
			
	}
	
	
	
	

	
}

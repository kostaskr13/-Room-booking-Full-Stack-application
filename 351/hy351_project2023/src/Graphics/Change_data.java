package Graphics;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Change_data extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Change_data() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1145, 771);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(58, 23, 255, 49);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("\u039F\u03BD\u03BF\u03BC\u03B1:");
		lblName.setFont(new Font("Arial", Font.BOLD, 16));
		lblName.setBounds(0, 26, 57, 41);
		
		
		JButton btnNewButton = new JButton("\u0395\u03A0\u039F\u039C\u0395\u039D\u039F");
	//	btnNewButton.setIcon(new ImageIcon(Change_data.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-enter-button.png")));
		btnNewButton.setBorder(new LineBorder(new Color(255, 0, 0), 3));
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNewButton.setBounds(315, 23, 210, 49);
		
	}

}

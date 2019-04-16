import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;

public class signUpWindow {

	JFrame signUpframe;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception {
		
		UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signUpWindow window = new signUpWindow();
					window.signUpframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public signUpWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		signUpframe = new JFrame();
		signUpframe.setTitle("SIGN UP");
		signUpframe.setResizable(false);
		signUpframe.setBounds(100, 100, 663, 506);
		signUpframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		signUpframe.getContentPane().setLayout(null);
		Image img=new ImageIcon(this.getClass().getResource("/Library2.jpg")).getImage();
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				signUpframe.dispose();
				MainWindow mw  = new MainWindow();
				mw.MainWindow.setVisible(true);
					
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack.setBackground(Color.DARK_GRAY);
		btnBack.setForeground(Color.WHITE);
		btnBack.setBounds(482, 11, 155, 34);
		signUpframe.getContentPane().add(btnBack);
		
		JLabel lblUsername = new JLabel("FIRST NAME");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUsername.setBounds(10, 84, 108, 27);
		signUpframe.getContentPane().add(lblUsername);
		
		JLabel lblNewLabel = new JLabel("LAST NAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 133, 84, 27);
		signUpframe.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPassword.setBounds(10, 236, 84, 14);
		signUpframe.getContentPane().add(lblPassword);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEmail.setBounds(10, 184, 64, 21);
		signUpframe.getContentPane().add(lblEmail);
		
		JLabel lblCell = new JLabel("CELL#");
		lblCell.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCell.setBounds(10, 334, 64, 14);
		signUpframe.getContentPane().add(lblCell);
		
		JLabel lblAddress = new JLabel("ADDRESS");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAddress.setBounds(10, 285, 64, 14);
		signUpframe.getContentPane().add(lblAddress);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField.setForeground(Color.WHITE);
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(110, 83, 240, 29);
		signUpframe.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setForeground(Color.WHITE);
		textField_1.setBounds(110, 132, 240, 29);
		signUpframe.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setBounds(110, 180, 240, 29);
		signUpframe.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(Color.LIGHT_GRAY);
		passwordField.setBounds(110, 229, 240, 29);
		signUpframe.getContentPane().add(passwordField);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setBounds(110, 278, 240, 29);
		signUpframe.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBackground(Color.LIGHT_GRAY);
		formattedTextField.setBounds(110, 327, 240, 29);
		signUpframe.getContentPane().add(formattedTextField);
		
		JLabel imglabel = new JLabel("");
		imglabel.setForeground(Color.DARK_GRAY);
		imglabel.setBackground(Color.DARK_GRAY);
		imglabel.setIcon(new ImageIcon(img));
		imglabel.setBounds(0, 0, 660, 484);
		signUpframe.getContentPane().add(imglabel);
	}
}

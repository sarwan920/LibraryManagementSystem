import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.sql.Connection;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow {

	private JFrame MainWindow;

	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws Exception{
		UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.MainWindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	Connection con=null;
	public MainWindow() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		MainWindow = new JFrame();
		MainWindow.setTitle("WELCOME TO  LIBRARY");
		MainWindow.getContentPane().setBackground(SystemColor.activeCaption);
		MainWindow.getContentPane().setForeground(SystemColor.activeCaption);
		MainWindow.setForeground(SystemColor.activeCaption);
		MainWindow.setBounds(100, 100, 471, 389);
		MainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainWindow.getContentPane().setLayout(null);
		
		JButton btnSignUp = new JButton("SIGN UP");
		btnSignUp.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				MainWindow.dispose();
				signUpWindow sw = new signUpWindow();
				sw.signUpframe.setVisible(true);
				
			
			}
		});
		btnSignUp.setBackground(Color.BLACK);
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.setBounds(28, 96, 155, 34);
		MainWindow.getContentPane().add(btnSignUp);
		
		JButton btnLogIn = new JButton("LOG IN");
		btnLogIn.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogIn.setForeground(Color.WHITE);
		btnLogIn.setBackground(Color.BLACK);
		btnLogIn.setBounds(28, 218, 155, 34);
		MainWindow.getContentPane().add(btnLogIn);
		
		JLabel lblWelcomeToOur = new JLabel("Welcome  To Our Library Management System");
		lblWelcomeToOur.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		lblWelcomeToOur.setBounds(28, 24, 393, 34);
		lblWelcomeToOur.setForeground(new Color(0, 51, 204));
		lblWelcomeToOur.setHorizontalAlignment(SwingConstants.CENTER);
		MainWindow.getContentPane().add(lblWelcomeToOur);
		JLabel lblAllRightsReserved = new JLabel("All Rights Reserved to Sarwan Softwear Systems 2019");
		lblAllRightsReserved.setForeground(new Color(255, 255, 255));
		lblAllRightsReserved.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 8));
		lblAllRightsReserved.setHorizontalAlignment(SwingConstants.LEFT);
		lblAllRightsReserved.setBounds(0, 350, 309, 14);
		MainWindow.getContentPane().add(lblAllRightsReserved);
		
		JLabel imgLabel = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/library1.jpg")).getImage();
		imgLabel.setIcon(new ImageIcon(img));
		imgLabel.setBounds(0, -33, 466, 397);
		MainWindow.getContentPane().add(imgLabel);
		MainWindow.setResizable(false);
	}
}

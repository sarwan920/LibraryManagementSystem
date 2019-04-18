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
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class MainWindow {

	JFrame MainWindow;

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
		MainWindow.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\Library Management System\\App Icon.png"));
		MainWindow.setTitle("WELCOME TO  LIBRARY");
		MainWindow.getContentPane().setBackground(SystemColor.activeCaption);
		MainWindow.getContentPane().setForeground(SystemColor.activeCaption);
		MainWindow.setForeground(SystemColor.activeCaption);
		MainWindow.setBounds(100, 100, 471, 389);
		MainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainWindow.getContentPane().setLayout(null);
		
		JButton btnSignUp = new JButton("SIGN UP");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainWindow.dispose();
				signUpWindow sw = new signUpWindow();
				sw.signUpframe.setVisible(true);
				
			}
		});
		
		btnSignUp.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		btnSignUp.setBackground(Color.BLACK);
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.setBounds(10, 89, 155, 34);
		MainWindow.getContentPane().add(btnSignUp);
		
		JButton btnLogIn = new JButton("LOG IN");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainWindow.dispose();
				logInWindow lw = new logInWindow();
				lw.frmLogIn.setVisible(true);
			}
		});
		
				btnLogIn.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogIn.setForeground(Color.WHITE);
		btnLogIn.setBackground(Color.BLACK);
		btnLogIn.setBounds(10, 141, 155, 34);
		MainWindow.getContentPane().add(btnLogIn);
		
		JLabel lblWelcomeToOur = new JLabel("Welcome  To Our Library");
		lblWelcomeToOur.setBackground(new Color(51, 204, 204));
		lblWelcomeToOur.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		lblWelcomeToOur.setBounds(22, 11, 238, 34);
		lblWelcomeToOur.setForeground(Color.BLUE);
		lblWelcomeToOur.setHorizontalAlignment(SwingConstants.LEFT);
		MainWindow.getContentPane().add(lblWelcomeToOur);
		JLabel lblAllRightsReserved = new JLabel("All Rights Reserved to Sarwan Softwear Systems 2019");
		lblAllRightsReserved.setForeground(Color.BLACK);
		lblAllRightsReserved.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 8));
		lblAllRightsReserved.setHorizontalAlignment(SwingConstants.LEFT);
		lblAllRightsReserved.setBounds(0, 350, 309, 14);
		MainWindow.getContentPane().add(lblAllRightsReserved);
		Image img=new ImageIcon(this.getClass().getResource("/Library1.jpg")).getImage();
		
		JLabel lblManagmentSystem = new JLabel("Managment System");
		lblManagmentSystem.setFont(new Font("Trajan Pro", Font.BOLD, 14));
		lblManagmentSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblManagmentSystem.setBounds(32, 39, 177, 39);
		MainWindow.getContentPane().add(lblManagmentSystem);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("\"A TRUELY GREAT LIBRARY CONTAINS");
		lblNewJgoodiesLabel.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblNewJgoodiesLabel.setForeground(new Color(128, 128, 128));
		lblNewJgoodiesLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewJgoodiesLabel.setBounds(10, 210, 231, 21);
		MainWindow.getContentPane().add(lblNewJgoodiesLabel);
		
		JLabel lblInIt = new JLabel("SOMETHING");
		lblInIt.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblInIt.setForeground(new Color(128, 128, 128));
		lblInIt.setHorizontalAlignment(SwingConstants.CENTER);
		lblInIt.setBounds(67, 230, 92, 14);
		MainWindow.getContentPane().add(lblInIt);
		
		JLabel lblNewLabel = new JLabel("IN IT THAT OFFENDS EVERYONE.\"");
		lblNewLabel.setForeground(new Color(128, 128, 128));
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(3, 242, 238, 27);
		MainWindow.getContentPane().add(lblNewLabel);
		
		JLabel lblmaryJoGodwin = new JLabel("-MARY JO GODWIN");
		lblmaryJoGodwin.setFont(new Font("Chaparral Pro Light", Font.BOLD, 12));
		lblmaryJoGodwin.setHorizontalAlignment(SwingConstants.CENTER);
		lblmaryJoGodwin.setForeground(new Color(0, 0, 0));
		lblmaryJoGodwin.setBounds(167, 269, 106, 21);
		MainWindow.getContentPane().add(lblmaryJoGodwin);
		
		JLabel imgLabel = new JLabel("");
		imgLabel.setIcon(new ImageIcon(img));
		imgLabel.setBounds(0, -33, 466, 397);
		MainWindow.getContentPane().add(imgLabel);
		MainWindow.setResizable(false);
	}
}

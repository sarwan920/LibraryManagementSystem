import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.Toolkit;

public class logInWindow {

	JFrame frmLogIn;
	private JTextField ETF;
	private JPasswordField PTF;
	//protected Object frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					logInWindow window = new logInWindow();
					window.frmLogIn.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Connection con = null;

	/**
	 * Create the application.
	 */
	public logInWindow() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		con = sqlConnection.sqlConnector();
		frmLogIn = new JFrame();
		frmLogIn.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\Library Management System\\App Icon.png"));
		frmLogIn.setTitle("LOG IN");
		frmLogIn.setBounds(100, 100, 663, 506);
		frmLogIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogIn.getContentPane().setLayout(null);
		frmLogIn.setResizable(false);
		Image img=new ImageIcon(this.getClass().getResource("/Library2.jpg")).getImage();
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLogIn.dispose();
				MainWindow mw = new MainWindow();
				mw.MainWindow.setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(482, 11, 155, 34);
		frmLogIn.getContentPane().add(btnNewButton);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBackground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEmail.setBounds(32, 137, 91, 41);
		frmLogIn.getContentPane().add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setVerticalAlignment(SwingConstants.BOTTOM);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(32, 200, 91, 34);
		frmLogIn.getContentPane().add(lblPassword);
		
		ETF = new JTextField();
		ETF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ETF.setForeground(Color.WHITE);
		ETF.setBackground(Color.LIGHT_GRAY);
		ETF.setBounds(133, 142, 240, 29);
		frmLogIn.getContentPane().add(ETF);
		ETF.setColumns(10);
		
		PTF = new JPasswordField();
		PTF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		PTF.setForeground(Color.WHITE);
		PTF.setBackground(Color.LIGHT_GRAY);
		PTF.setBounds(133, 212, 240, 29);
		frmLogIn.getContentPane().add(PTF);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					String query="select EMAIL,PASS_WORD from AccountData where EMAIL=? and PASS_WORD=?";
					
					int count=0;
						
					PreparedStatement st =con.prepareStatement(query);
					
					st.setString(1,ETF.getText());
					st.setString(2,PTF.getText());
					ResultSet rs = st.executeQuery();
					while (rs.next())
					{
						count++;
					}
					
					if(count==1)
					{
						
						frmLogIn.dispose();
						AfterLoginWindow afl = new AfterLoginWindow();
						afl.frame.setVisible(true);
						
					}
					else
					{
						ETF.setText("");
						PTF.setText("");
						JOptionPane.showMessageDialog(null,"Username or  Password is incorrect");
					}
				
				
				}
				
				catch (Exception e)
				{
					JOptionPane.showMessageDialog(null, e);
				}
				
				
				
			}
				
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogin.setBackground(Color.DARK_GRAY);
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBounds(133, 296, 155, 34);
		frmLogIn.getContentPane().add(btnLogin);
		
		JLabel lblLoginToYour = new JLabel("LOGIN TO YOUR");
		lblLoginToYour.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblLoginToYour.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginToYour.setBounds(49, 29, 341, 46);
		frmLogIn.getContentPane().add(lblLoginToYour);
		
		JLabel lblAccount = new JLabel("ACCOUNT");
		lblAccount.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		lblAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccount.setForeground(Color.RED);
		lblAccount.setBounds(154, 75, 124, 14);
		frmLogIn.getContentPane().add(lblAccount);
		
		JLabel imgLabel = new JLabel("");
		imgLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		imgLabel.setForeground(Color.WHITE);
		imgLabel.setBackground(Color.DARK_GRAY);
		imgLabel.setIcon(new ImageIcon(img));
		imgLabel.setBounds(0, 0, 660, 484);
		frmLogIn.getContentPane().add(imgLabel);
	}
}

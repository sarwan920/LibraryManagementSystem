import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class LogIn {

	JFrame frmLogin;
	JTextField LUTF;
	String u;
	private JPasswordField LPTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception{
		//UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
				//UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
				//UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
						//UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
						//it good
						//UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
					//UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
						//UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
						
					UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
						//UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn window = new LogIn();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LogIn() throws Exception {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws Exception{
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String uname="SYSTEM";
		String pass="1234";
		Connection con= DriverManager.getConnection(url,uname,pass);
		
		
	
		
		frmLogin = new JFrame();
		frmLogin.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\sarwa\\Desktop\\iconfinder_application-pgp-signature_24736.png"));
		frmLogin.setTitle("LOGIN");
		frmLogin.getContentPane().setBackground(Color.WHITE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblLogIn = new JLabel("LOGIN FORM");
		lblLogIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogIn.setForeground(Color.WHITE);
		lblLogIn.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblLogIn.setBounds(75, 11, 320, 33);
		frmLogin.getContentPane().add(lblLogIn);
		
		JLabel UTF = new JLabel("Username");
		UTF.setForeground(Color.WHITE);
		UTF.setFont(new Font("Tahoma", Font.BOLD, 12));
		UTF.setBounds(41, 80, 63, 14);
		frmLogin.getContentPane().add(UTF);
		
		JLabel PTF = new JLabel("Password");
		PTF.setForeground(Color.WHITE);
		PTF.setFont(new Font("Tahoma", Font.BOLD, 12));
		PTF.setBounds(41, 118, 67, 14);
		frmLogin.getContentPane().add(PTF);
		
		LUTF = new JTextField();
		LUTF.setBounds(139, 79, 150, 20);
		frmLogin.getContentPane().add(LUTF);
		LUTF.setColumns(10);
		
		LPTF = new JPasswordField();
		LPTF.setBounds(139, 116, 150, 20);
		frmLogin.getContentPane().add(LPTF);
		
		JButton btnLogin = new JButton("Log In");
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				try {
				String query="select uname,pass from AccountData where uname=? and pass=?";
				
				int count=0;
					
				PreparedStatement st =con.prepareStatement(query);
				
				st.setString(1,LUTF.getText());
				st.setString(2, LPTF.getText());
				ResultSet rs = st.executeQuery();
				while (rs.next())
				{
					count++;
				}
				
				if(count==1)
				{
					
					frmLogin.setVisible(false);
					afterLogin afl = new afterLogin();
					afl.frmTestpage.setVisible(true);
					
				}
				else
				{
					//LUTF.setText("");
					//LPTF.setText("");
					JOptionPane.showMessageDialog(null,"Username or  Password is incorrect");
				}
				
				
				
				
						
				}
				
				catch (Exception e1)
				{
					JOptionPane.showMessageDialog(null,e);
				}
				
			}
		});
	
				btnLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogin.setBackground(Color.LIGHT_GRAY);
		btnLogin.setBounds(41, 169, 130, 23);
		frmLogin.getContentPane().add(btnLogin);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Frame mainFrame = new Frame();
					mainFrame.frmSignUp.setVisible(true);
					frmLogin.dispose();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnBack.setBounds(194, 169, 130, 23);
		frmLogin.getContentPane().add(btnBack);
		
		JLabel imgVar = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/test.jpg")).getImage();
		imgVar.setIcon(new ImageIcon(img));
		imgVar.setBounds(0, 0, 475, 271);
		frmLogin.getContentPane().add(imgVar);
		frmLogin.setBounds(100, 100, 481, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.setResizable(false);
	}
}

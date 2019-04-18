import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Window;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import javax.swing.DropMode;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.Toolkit;

public class signUpWindow {

	JFrame signUpframe;
	private JTextField FNTF;
	private JTextField LNTF;
	private JTextField ETF;
	private JPasswordField PTF;
	private JTextField ATF;
	private JLabel u_imgLabel;
	

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
	
	Connection con=null;
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
		con = sqlConnection.sqlConnector();
		signUpframe = new JFrame();
		signUpframe.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\Library Management System\\App Icon.png"));
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
		
		JLabel u_imgLabel = new JLabel("");
		u_imgLabel.setForeground(Color.BLACK);
		u_imgLabel.setBackground(Color.MAGENTA);
		u_imgLabel.setBounds(458, 116, 165, 121);
		signUpframe.getContentPane().add(u_imgLabel);
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
		
		FNTF = new JTextField();
		FNTF.setFont(new Font("Tahoma", Font.BOLD, 11));
		FNTF.setForeground(Color.WHITE);
		FNTF.setBackground(Color.LIGHT_GRAY);
		FNTF.setBounds(110, 83, 240, 29);
		signUpframe.getContentPane().add(FNTF);
		FNTF.setColumns(10);
		
		LNTF = new JTextField();
		LNTF.setBackground(Color.LIGHT_GRAY);
		LNTF.setForeground(Color.WHITE);
		LNTF.setBounds(110, 132, 240, 29);
		signUpframe.getContentPane().add(LNTF);
		LNTF.setColumns(10);
		
		ETF = new JTextField();
		ETF.setBackground(Color.LIGHT_GRAY);
		ETF.setBounds(110, 180, 240, 29);
		signUpframe.getContentPane().add(ETF);
		ETF.setColumns(10);
		
		PTF = new JPasswordField();
		PTF.setBackground(Color.LIGHT_GRAY);
		PTF.setBounds(110, 229, 240, 29);
		signUpframe.getContentPane().add(PTF);
		
		ATF = new JTextField();
		ATF.setBackground(Color.LIGHT_GRAY);
		ATF.setBounds(110, 278, 240, 29);
		signUpframe.getContentPane().add(ATF);
		ATF.setColumns(10);
		
		JFormattedTextField CTF = new JFormattedTextField();
		CTF.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char c=evt.getKeyChar();
				if(!Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c ==KeyEvent.VK_DELETE)
				{	
					evt.consume();
				}
				
			}
		});
		CTF.setBackground(Color.LIGHT_GRAY);
		CTF.setBounds(110, 327, 240, 29);
		signUpframe.getContentPane().add(CTF);
		
		JButton btnCreateAccount = new JButton("CREATE ACCOUNT");
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					String query="insert into AccountData values (?,?,?,?,?,?)";
					int check=0;
					String check1="";
					if(PTF.getText().length() >=6)
					{
					if( LNTF.getText().equals(check1) || ATF.getText().equals(check1) || FNTF.getText().equals(check1)  || ETF.getText().equals(check1) || PTF.getText().equals(check1) || CTF.getText().equals(check1) )
					{
						check++;
					}
					
					if(check==0)
					{
					PreparedStatement st = con.prepareStatement(query);
					st.setString(1,FNTF.getText());
					st.setString(2, LNTF.getText());
					st.setString(3, ETF.getText());
					st.setString(4, PTF.getText());
					st.setString(5, ATF.getText());
					st.setString(6, CTF.getText());
					
					JOptionPane.showMessageDialog(null,"Your Account Has been Created");
						FNTF.setText("");
						LNTF.setText("");
						ETF.setText("");
						PTF.setText("");
						ATF.setText("");
						CTF.setText("");
						st.executeUpdate();
						st.close();
						con.close();
					
					}
					
					else
					{
						JOptionPane.showMessageDialog(null , "You can not leave any field empty");
					}
					
					
				}
					else
					{
						JOptionPane.showMessageDialog(null , "Password length must be 6 character or more");
					}
				}
				
				
				
				catch (SQLException e) {
					// TODO Auto-generated catch block
					
					JOptionPane.showMessageDialog(null,e);
					
					e.printStackTrace();
				}
				
			}
		});
		btnCreateAccount.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCreateAccount.setBackground(Color.DARK_GRAY);
		btnCreateAccount.setForeground(Color.WHITE);
		btnCreateAccount.setBounds(10, 391, 155, 34);
		signUpframe.getContentPane().add(btnCreateAccount);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				signUpframe.dispose();
				logInWindow ln = new logInWindow();
				ln.frmLogIn.setVisible(true);
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		btnLogin.setBackground(Color.DARK_GRAY);
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBounds(195, 391, 155, 34);
		signUpframe.getContentPane().add(btnLogin);
		
		JLabel lblSignUp = new JLabel("SIGN UP");
		lblSignUp.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSignUp.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignUp.setBounds(58, 21, 256, 34);
		signUpframe.getContentPane().add(lblSignUp);
		
		
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f=chooser.getSelectedFile();
				u_imgLabel.setIcon(new ImageIcon(f.toString()));
			}
		});
		
		
		btnUpload.setBackground(Color.DARK_GRAY);
		btnUpload.setForeground(Color.WHITE);
		btnUpload.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnUpload.setBounds(550, 251, 87, 34);
		signUpframe.getContentPane().add(btnUpload);
		
		JLabel lblUploadImage = new JLabel("UPLOAD IMAGE");
		lblUploadImage.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUploadImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblUploadImage.setForeground(Color.BLACK);
		lblUploadImage.setBackground(Color.WHITE);
		lblUploadImage.setBounds(492, 66, 125, 29);
		signUpframe.getContentPane().add(lblUploadImage);
		
		JButton btnRemove = new JButton("REMOVE");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				u_imgLabel.setIcon(null);
			}
		});
		btnRemove.setForeground(Color.WHITE);
		btnRemove.setBackground(Color.DARK_GRAY);
		btnRemove.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRemove.setBounds(453, 251, 87, 34);
		signUpframe.getContentPane().add(btnRemove);
		
		JLabel imglabel = new JLabel("");
		imglabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		imglabel.setForeground(Color.DARK_GRAY);
		imglabel.setBackground(Color.DARK_GRAY);
		imglabel.setIcon(new ImageIcon(img));
		imglabel.setBounds(0, 0, 660, 484);
		signUpframe.getContentPane().add(imglabel);
	}
}

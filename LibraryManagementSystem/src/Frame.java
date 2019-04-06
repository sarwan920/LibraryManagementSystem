import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JSplitPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.sql.*;
import java.awt.Window.Type;
import java.awt.Toolkit;
public class Frame {

	JFrame frmSignUp;
	private JTextField ETF;
	private JPasswordField PTF;
	private JTextField UTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception {
		//UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		//UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
		//UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
				//UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
				//it good
				//UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
			//UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
				//UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
		//UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
			UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
				//UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
		//UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		//UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
	//UIManager.setLookAndFeel("com.jgoodies.looks.window.WindowLookAndFeel");
			
		Class.forName("oracle.jdbc.OracleDriver");	
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					Frame window = new Frame();
					window.frmSignUp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame() throws Exception {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws Exception  {
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String uname="SYSTEM";
		String pass="1234";
		Connection con= DriverManager.getConnection(url,uname,pass);
		
		frmSignUp = new JFrame();
		frmSignUp.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\sarwa\\Desktop\\icons8-login-64.png"));
		frmSignUp.getContentPane().setBackground(Color.WHITE);
		frmSignUp.setTitle("SIGN UP");
		frmSignUp.setBounds(100, 100, 481, 300);
		frmSignUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSignUp.getContentPane().setLayout(null);
		frmSignUp.setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 475, 271);
		panel.setBackground(new Color(176, 224, 230));
		panel.setForeground(UIManager.getColor("Button.darkShadow"));
		frmSignUp.getContentPane().add(panel);
		panel.setLayout(null);
		
		ETF = new JTextField();
		ETF.setBounds(139, 110, 150, 20);
		panel.add(ETF);
		ETF.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(41, 112, 46, 14);
		panel.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassword.setBounds(41, 143, 89, 14);
		panel.add(lblPassword);
		
		PTF = new JPasswordField();
		PTF.setBounds(139, 141, 150, 20);
		panel.add(PTF);
		
		JButton btnSignIn = new JButton("Create Account");
		btnSignIn.setForeground(Color.BLACK);
		btnSignIn.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSignIn.setToolTipText("Create Account");
		
		btnSignIn.setBackground(Color.LIGHT_GRAY);
		btnSignIn.setBounds(41, 189, 130, 23);
		panel.add(btnSignIn);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUsername.setBounds(41, 80, 63, 14);
		panel.add(lblUsername);
		
		UTF = new JTextField();
		UTF.setBounds(139, 79, 150, 20);
		panel.add(UTF);
		UTF.setColumns(10);
		
		JLabel lblSignUpForm = DefaultComponentFactory.getInstance().createTitle("SIGN UP FORM");
		lblSignUpForm.setForeground(new Color(255, 255, 255));
		lblSignUpForm.setBackground(new Color(0, 0, 102));
		lblSignUpForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignUpForm.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblSignUpForm.setBounds(75, 11, 320, 33);
		panel.add(lblSignUpForm);
		Image img=new ImageIcon(this.getClass().getResource("/test.jpg")).getImage();
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogIn.setBackground(Color.LIGHT_GRAY);
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				frmSignUp.dispose();
				LogIn frame2;
				try {
					frame2 = new LogIn();
					frame2.frmLogin.setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				}
				
				catch (Exception e)
				{
					System.out.println(e);
				}
				
				
			}
		});
		btnLogIn.setBounds(182, 189, 130, 23);
		panel.add(btnLogIn);
		
		JLabel imgVar = new JLabel("");
		imgVar.setIcon(new ImageIcon(img));
		imgVar.setBounds(0, 0, 475, 271);
		panel.add(imgVar);
		
		btnSignIn.addActionListener(new ActionListener()  {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0)  {
				String query="insert into AccountData values (?,?,?)";
				
				
				try {
					int check=0;
					String check1="";
					if(UTF.getText().equals(check1)  || ETF.getText().equals(check1) || PTF.getText().equals(check1))
					{
						check++;
					}
					
					if(check==0)
					{
					PreparedStatement st = con.prepareStatement(query);
					st.setString(1,UTF.getText());
					st.setString(2, ETF.getText());
					st.setString(3, PTF.getText());
					JOptionPane.showMessageDialog(null,"Your Account Has been Created");
					UTF.setText("");
					ETF.setText("");
					PTF.setText("");
						st.executeUpdate();
						st.close();
						con.close();
					
					}
					
					else
					{
						JOptionPane.showMessageDialog(null, "You can not leave any field emptey");
					}
					
					
					} 
				catch (SQLException e) {
					// TODO Auto-generated catch block
					
					JOptionPane.showMessageDialog(null,e);
					
					e.printStackTrace();
				}
				
				
			}
		});
		
		
		
	}
}

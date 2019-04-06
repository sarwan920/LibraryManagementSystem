import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JTextField;

public class afterLogin {

	JFrame frmTestpage;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception{
		UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					afterLogin window = new afterLogin();
					window.frmTestpage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public afterLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTestpage = new JFrame();
		frmTestpage.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\sarwa\\Desktop\\iconfinder_application-pgp-signature_24736.png"));
		frmTestpage.getContentPane().setBackground(Color.WHITE);
		frmTestpage.setResizable(false);
		frmTestpage.setTitle("TestPage");
		frmTestpage.setBounds(100, 100, 481, 300);
		frmTestpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTestpage.getContentPane().setLayout(null);
		Image img=new ImageIcon(this.getClass().getResource("/test.jpg")).getImage();
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					frmTestpage.setVisible(false);
					LogIn frameL= new LogIn();
					frameL.frmLogin.setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnLogout.setBackground(Color.LIGHT_GRAY);
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogout.setBounds(188, 186, 89, 23);
		frmTestpage.getContentPane().add(btnLogout);
		
		JLabel lblThankYouFor = new JLabel("Thank You for Loging In");
		lblThankYouFor.setHorizontalAlignment(SwingConstants.CENTER);
		lblThankYouFor.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblThankYouFor.setForeground(Color.WHITE);
		lblThankYouFor.setBounds(32, 67, 421, 52);
		frmTestpage.getContentPane().add(lblThankYouFor);
		
		JLabel lblThisPageIs = new JLabel("This Page is Under Construction");
		lblThisPageIs.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblThisPageIs.setHorizontalAlignment(SwingConstants.CENTER);
		lblThisPageIs.setForeground(Color.RED);
		lblThisPageIs.setBounds(68, 130, 343, 45);
		frmTestpage.getContentPane().add(lblThisPageIs);
		
		
		
		
		
		
		
		
		JLabel imgVar = new JLabel("");
		imgVar.setIcon(new ImageIcon(img));
		imgVar.setBounds(0, 0, 475, 271);
		frmTestpage.getContentPane().add(imgVar);
	}
}

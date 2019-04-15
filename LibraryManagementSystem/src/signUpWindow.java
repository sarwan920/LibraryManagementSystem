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

public class signUpWindow {

	JFrame signUpframe;

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
		
		JLabel imglabel = new JLabel("");
		imglabel.setForeground(Color.DARK_GRAY);
		imglabel.setBackground(Color.DARK_GRAY);
		imglabel.setIcon(new ImageIcon(img));
		imglabel.setBounds(0, 0, 660, 484);
		signUpframe.getContentPane().add(imglabel);
	}
}

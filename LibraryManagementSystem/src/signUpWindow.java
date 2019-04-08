import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JLabel;

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
		signUpframe.setResizable(false);
		signUpframe.setBounds(100, 100, 663, 506);
		signUpframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		signUpframe.getContentPane().setLayout(null);
		
		JLabel imglabel = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/library2.jpg")).getImage();
		imglabel.setIcon(new ImageIcon(img));
		imglabel.setBounds(0, 0, 660, 484);
		signUpframe.getContentPane().add(imglabel);
	}
}

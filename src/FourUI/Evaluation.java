package FourUI;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Evaluation {

	private JFrame frame;
	static String path = System.getProperty("user.dir") + "\\src\\image\\";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Evaluation window = new Evaluation();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Evaluation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 765, 447);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

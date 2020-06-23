package 리자;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class M_usedHistory {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					M_usedHistory window = new M_usedHistory();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public M_usedHistory() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 892, 563);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 892, 563);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lbl_graph = new JLabel("");
		lbl_graph.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_graph.setBounds(32, 87, 813, 329);
		panel_2.add(lbl_graph);
		
		String path = "C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\07 관리자 사용현황그래프.png";
		Image image = new ImageIcon(path).getImage();
		panel_2.setLayout(null);
		
		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(881, 542, Image.SCALE_SMOOTH)));
		lbl_image.setBounds(0, 0, 875, 523);
		panel_2.add(lbl_image);
	}

}

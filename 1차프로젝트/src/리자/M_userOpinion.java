package 리자;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class M_userOpinion {

	private JFrame frame;
	Image[] list = new Image[4];

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					M_userOpinion window = new M_userOpinion();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public M_userOpinion() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 892, 563);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 892, 563);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel btn_left = new JLabel("");
		list[0] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\왼쪽2.png").getImage();
		list[1] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\왼쪽1.png").getImage();

		btn_left.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_left.setIcon(new ImageIcon(list[0]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_left.setIcon(new ImageIcon(list[1]));

			}
			
		});
		btn_left.setBounds(396, 495, 26, 26);
		panel_1.add(btn_left);
		
		JLabel btn_right = new JLabel("");
		list[2] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\오른쪽2.png").getImage();
		list[3] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\오른쪽1.png").getImage();

		btn_right.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_right.setIcon(new ImageIcon(list[2]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_right.setIcon(new ImageIcon(list[3]));

			}
			
		});
		btn_right.setBounds(457, 495, 26, 26);
		panel_1.add(btn_right);
		
		String path = "C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\05 관리자 사용자평가.png";
		Image image = new ImageIcon(path).getImage();
		panel_1.setLayout(null);
		
		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(881, 542, Image.SCALE_SMOOTH)));
		lbl_image.setBounds(0, 0, 875, 523);
		panel_1.add(lbl_image);
		
		JLabel lbl_userInput1 = new JLabel("");
		lbl_userInput1.setBounds(38, 159, 613, 61);
		panel_1.add(lbl_userInput1);
		
		JLabel lbl_userInput2 = new JLabel("");
		lbl_userInput2.setBounds(38, 240, 613, 61);
		panel_1.add(lbl_userInput2);
		
		JLabel lbl_userInput3 = new JLabel("");
		lbl_userInput3.setBounds(38, 322, 613, 61);
		panel_1.add(lbl_userInput3);
		
		JLabel lbl_userInput4 = new JLabel("");
		lbl_userInput4.setBounds(38, 402, 613, 61);
		panel_1.add(lbl_userInput4);
		
		JLabel lbl_non = new JLabel("");
		lbl_non.setBounds(681, 160, 164, 60);
		panel_1.add(lbl_non);
		
		JLabel lbl_non_1 = new JLabel("");
		lbl_non_1.setBounds(681, 240, 164, 60);
		panel_1.add(lbl_non_1);
		
		JLabel lbl_non_2 = new JLabel("");
		lbl_non_2.setBounds(681, 322, 164, 60);
		panel_1.add(lbl_non_2);
		
		JLabel lbl_non_3 = new JLabel("");
		lbl_non_3.setBounds(681, 403, 164, 60);
		panel_1.add(lbl_non_3);
		
	}
}

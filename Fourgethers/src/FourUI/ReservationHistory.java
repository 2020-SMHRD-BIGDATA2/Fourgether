package FourUI;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ReservationHistory {

	private JFrame frame;
	Image[] list = new Image[14];

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReservationHistory window = new ReservationHistory();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ReservationHistory() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 886, 552);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();

		panel.setBounds(0, 0, 875, 513);
		frame.getContentPane().add(panel);

	
		
		JLabel btn_left1 = new JLabel("");
		btn_left1.setBounds(397, 204, 25, 26);
		list[0] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\왼쪽2.png").getImage();
		list[1] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\왼쪽1.png").getImage();

		btn_left1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_left1.setIcon(new ImageIcon(list[0]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_left1.setIcon(new ImageIcon(list[1]));

			}
		});
		panel.add(btn_left1);
		
		JLabel btn_right1 = new JLabel("");
		btn_right1.setBounds(453, 203, 25, 26);
		list[2] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\오른쪽2.png").getImage();
		list[3] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\오른쪽1.png").getImage();

		btn_right1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_right1.setIcon(new ImageIcon(list[2]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_right1.setIcon(new ImageIcon(list[3]));

			}
		});
		panel.add(btn_right1);
		
		JLabel btn_left2 = new JLabel("");
		btn_left2.setBounds(397, 354, 25, 26);
		list[0] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\왼쪽2.png").getImage();
		list[1] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\왼쪽1.png").getImage();

		btn_left2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_left2.setIcon(new ImageIcon(list[0]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_left2.setIcon(new ImageIcon(list[1]));

			}
		});
		panel.add(btn_left2);
		
		JLabel btn_right2 = new JLabel("");
		btn_right2.setBounds(452, 351, 25, 29);
		list[2] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\오른쪽2.png").getImage();
		list[3] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\오른쪽1.png").getImage();

		btn_right2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_right2.setIcon(new ImageIcon(list[2]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_right2.setIcon(new ImageIcon(list[3]));

			}
		});
		panel.add(btn_right2);
		
		JLabel btn_left3 = new JLabel("");
		btn_left3.setBounds(397, 483, 25, 29);
		list[0] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\왼쪽2.png").getImage();
		list[1] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\왼쪽1.png").getImage();

		btn_left3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_left3.setIcon(new ImageIcon(list[0]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_left3.setIcon(new ImageIcon(list[1]));

			}
		});
		panel.add(btn_left3);
		
		JLabel btn_right3 = new JLabel("");
		btn_right3.setBounds(451, 481, 25, 29);
		list[2] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\오른쪽2.png").getImage();
		list[3] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\오른쪽1.png").getImage();

		btn_right3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_right3.setIcon(new ImageIcon(list[2]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_right3.setIcon(new ImageIcon(list[3]));

			}
		});
		panel.add(btn_right3);
		
		JLabel btn_goMain = new JLabel("");
		btn_goMain.setBounds(723, 19, 128, 29);
		list[4] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\메인으로2.png").getImage();
		list[5] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\메인으로1.png").getImage();

		btn_goMain.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_goMain.setIcon(new ImageIcon(list[4]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_goMain.setIcon(new ImageIcon(list[5]));

			}
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();  
				Main.main(null);
				
			}
		});
		panel.add(btn_goMain);
		

		
		JLabel lbl_1_1 = new JLabel("");
		lbl_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_1_1.setBounds(39, 118, 79, 35);
		panel.add(lbl_1_1);
		
		JLabel lbl_2_1 = new JLabel("");
		lbl_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_2_1.setBounds(39, 157, 79, 35);
		panel.add(lbl_2_1);
		
		JLabel lbl_1_2 = new JLabel("");
		lbl_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_1_2.setBounds(138, 118, 79, 35);
		panel.add(lbl_1_2);
		
		JLabel lbl_1_3 = new JLabel("");
		lbl_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_1_3.setBounds(241, 118, 79, 35);
		panel.add(lbl_1_3);
		
		JLabel lbl_1_4 = new JLabel("");
		lbl_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_1_4.setBounds(343, 118, 79, 35);
		panel.add(lbl_1_4);
		
		JLabel lbl_1_5 = new JLabel("");
		lbl_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_1_5.setBounds(442, 118, 79, 35);
		panel.add(lbl_1_5);
		
		JLabel lbl_1_6 = new JLabel("");
		lbl_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_1_6.setBounds(539, 118, 79, 35);
		panel.add(lbl_1_6);
		
		JLabel lbl_1_7 = new JLabel("");
		lbl_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_1_7.setBounds(642, 118, 79, 35);
		panel.add(lbl_1_7);
		
		JLabel lbl_1_8 = new JLabel("");
		lbl_1_8.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_1_8.setBounds(744, 118, 79, 35);
		panel.add(lbl_1_8);
		
		JLabel lbl_2_2 = new JLabel("");
		lbl_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_2_2.setBounds(138, 157, 79, 35);
		panel.add(lbl_2_2);
		
		JLabel lbl_2_3 = new JLabel("");
		lbl_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_2_3.setBounds(241, 157, 79, 35);
		panel.add(lbl_2_3);
		
		JLabel lbl_2_4 = new JLabel("");
		lbl_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_2_4.setBounds(343, 157, 79, 35);
		panel.add(lbl_2_4);
		
		JLabel lbl_2_5 = new JLabel("");
		lbl_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_2_5.setBounds(442, 157, 79, 35);
		panel.add(lbl_2_5);
		
		JLabel lbl_2_6 = new JLabel("");
		lbl_2_6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_2_6.setBounds(539, 157, 79, 35);
		panel.add(lbl_2_6);
		
		JLabel lbl_2_7 = new JLabel("");
		lbl_2_7.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_2_7.setBounds(642, 157, 79, 35);
		panel.add(lbl_2_7);
		
		JLabel lbl_2_8 = new JLabel("");
		lbl_2_8.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_2_8.setBounds(744, 157, 79, 35);
		panel.add(lbl_2_8);
		
		JLabel lbl_3_1 = new JLabel("");
		lbl_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_3_1.setBounds(39, 288, 107, 18);
		panel.add(lbl_3_1);
		
		JLabel lbl_3_2 = new JLabel("");
		lbl_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_3_2.setBounds(175, 288, 107, 18);
		panel.add(lbl_3_2);
		
		JLabel lbl_3_3 = new JLabel("");
		lbl_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_3_3.setBounds(315, 288, 107, 18);
		panel.add(lbl_3_3);
		
		JLabel lbl_3_4 = new JLabel("");
		lbl_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_3_4.setBounds(447, 288, 107, 18);
		panel.add(lbl_3_4);
		
		JLabel lbl_3_5 = new JLabel("");
		lbl_3_5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_3_5.setBounds(585, 288, 107, 18);
		panel.add(lbl_3_5);
		
		JLabel lbl_3_6 = new JLabel("");
		lbl_3_6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_3_6.setBounds(716, 288, 107, 18);
		panel.add(lbl_3_6);
		
		JLabel lbl_4_1 = new JLabel("");
		lbl_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_4_1.setBounds(39, 318, 107, 18);
		panel.add(lbl_4_1);
		
		JLabel lbl_4_2 = new JLabel("");
		lbl_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_4_2.setBounds(175, 320, 107, 18);
		panel.add(lbl_4_2);
		
		JLabel lbl_4_3 = new JLabel("");
		lbl_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_4_3.setBounds(315, 316, 107, 18);
		panel.add(lbl_4_3);
		
		JLabel lbl_4_4 = new JLabel("");
		lbl_4_4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_4_4.setBounds(447, 316, 107, 18);
		panel.add(lbl_4_4);
		
		JLabel lbl_4_5 = new JLabel("");
		lbl_4_5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_4_5.setBounds(585, 316, 107, 18);
		panel.add(lbl_4_5);
		
		JLabel lbl_4_6 = new JLabel("");
		lbl_4_6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_4_6.setBounds(716, 316, 107, 18);
		panel.add(lbl_4_6);
		
		JLabel lbl_5_1 = new JLabel("");
		lbl_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_5_1.setBounds(42, 427, 240, 18);
		panel.add(lbl_5_1);
		
		JLabel lbl_6_1 = new JLabel("");
		lbl_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_6_1.setBounds(42, 451, 240, 18);
		panel.add(lbl_6_1);
		
		JLabel lbl_5_2 = new JLabel("");
		lbl_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_5_2.setBounds(314, 429, 240, 18);
		panel.add(lbl_5_2);
		
		JLabel lbl_6_2 = new JLabel("");
		lbl_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_6_2.setBounds(314, 451, 240, 18);
		panel.add(lbl_6_2);
		
		JLabel lbl_5_3 = new JLabel("");
		lbl_5_3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_5_3.setBounds(585, 429, 240, 18);
		panel.add(lbl_5_3);
		

		JLabel lbl_6_3 = new JLabel("");
		lbl_6_3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_6_3.setBounds(585, 451, 240, 18);
		panel.add(lbl_6_3);
		
		String path = "C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\09 예약내역.png";
		Image image = new ImageIcon(path).getImage();
		panel.setLayout(null);

		JLabel lbl = new JLabel(new ImageIcon(image.getScaledInstance(881, 512, Image.SCALE_SMOOTH)));
		lbl.setBounds(0, 0, 875, 513);
		panel.add(lbl);
	}

}

package 리자;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.Icon;

public class M_FacilityList {

	private JFrame frame;
	Image[] list = new Image[4];

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					M_FacilityList window = new M_FacilityList();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public M_FacilityList() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 886, 594);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.WHITE);
		frame.getContentPane().add(tabbedPane, "name_1057296950119900");
		
		// 첫 번째 탭
		JPanel panel = new JPanel();
		panel.setLayout(null);

		JLabel lbl_facilityName = new JLabel("");
		lbl_facilityName.setBounds(281, 74, 551, 24);
		panel.add(lbl_facilityName);

		JLabel lbl_facilityType = new JLabel("");
		lbl_facilityType.setBounds(281, 101, 551, 24);
		panel.add(lbl_facilityType);

		JLabel lbl_facilityCode = new JLabel("");
		lbl_facilityCode.setBounds(281, 126, 551, 24);
		panel.add(lbl_facilityCode);

		JLabel lbl_facilitySpot = new JLabel("");
		lbl_facilitySpot.setBounds(281, 152, 551, 24);
		panel.add(lbl_facilitySpot);

		JLabel lbl_MainDepartment = new JLabel("");
		lbl_MainDepartment.setBounds(281, 182, 551, 24);
		panel.add(lbl_MainDepartment);

		JLabel lbl_department = new JLabel("");
		lbl_department.setBounds(281, 208, 551, 24);
		panel.add(lbl_department);

		JLabel lbl_homepage = new JLabel("");
		lbl_homepage.setBounds(281, 233, 551, 24);
		panel.add(lbl_homepage);

		JLabel lbl_phoneNumber = new JLabel("");
		lbl_phoneNumber.setBounds(281, 261, 551, 24);
		panel.add(lbl_phoneNumber);

		JLabel lbl_facilitySize = new JLabel("");
		lbl_facilitySize.setBounds(281, 289, 551, 24);
		panel.add(lbl_facilitySize);

		JLabel lbl_enableUserSize = new JLabel("");
		lbl_enableUserSize.setBounds(281, 316, 551, 24);
		panel.add(lbl_enableUserSize);

		JLabel lbl_lastFacility = new JLabel("");
		lbl_lastFacility.setBounds(281, 344, 551, 24);
		panel.add(lbl_lastFacility);

		JLabel lbl_Charge = new JLabel("");
		lbl_Charge.setBounds(281, 372, 551, 24);
		panel.add(lbl_Charge);

		JLabel lbl_StartTime = new JLabel("");
		lbl_StartTime.setBounds(281, 399, 551, 24);
		panel.add(lbl_StartTime);

		JLabel lbl_EndTime = new JLabel("");
		lbl_EndTime.setBounds(281, 427, 551, 24);
		panel.add(lbl_EndTime);

		JLabel lbl_holyday = new JLabel("");
		lbl_holyday.setBounds(281, 453, 551, 24);
		panel.add(lbl_holyday);

		JLabel lbl_photoURL = new JLabel("");
		lbl_photoURL.setBounds(281, 480, 551, 24);
		panel.add(lbl_photoURL);

		String path = "C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\04 관리자시설상세.png";
		Image image = new ImageIcon(path).getImage();
		panel.setLayout(null);

		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(881, 542, Image.SCALE_SMOOTH)));
		lbl_image.setBounds(0, 0, 875, 523);
		panel.add(lbl_image);

		tabbedPane.addTab("New tab", null, panel, null);
		
		
		// 2번째 탭
		JPanel panel_1 = new JPanel();

		JLabel btn_left = new JLabel("");
		list[0] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\왼쪽2.png")
				.getImage();
		list[1] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\왼쪽1.png")
				.getImage();

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
		list[2] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\오른쪽2.png")
				.getImage();
		list[3] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\오른쪽1.png")
				.getImage();

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

		String path2 = "C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\05 관리자 사용자평가.png";
		Image image2 = new ImageIcon(path2).getImage();
		panel_1.setLayout(null);

		JLabel lbl_image2 = new JLabel(new ImageIcon(image2.getScaledInstance(881, 542, Image.SCALE_SMOOTH)));
		lbl_image2.setBounds(0, 0, 875, 523);
		panel_1.add(lbl_image2);
		
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

		tabbedPane.addTab("New tab", null, panel_1, null);
		
		// 3번째 탭
		JPanel panel_2 = new JPanel();
		
		JLabel lbl_graph = new JLabel("");
		lbl_graph.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_graph.setBounds(34, 82, 813, 329);
		panel_2.add(lbl_graph);
		
		String path3 = "C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\06 관리자 평가점수그래프.png";
		Image image3 = new ImageIcon(path3).getImage();
		panel_2.setLayout(null);
		
		JLabel lbl_image3 = new JLabel(new ImageIcon(image3.getScaledInstance(881, 542, Image.SCALE_SMOOTH)));
		lbl_image3.setBounds(0, 0, 875, 523);
		panel_2.add(lbl_image3);
		
		tabbedPane.addTab("New tab", null, panel_2, null);
		
		
		// 4번째 탭
		JPanel panel_3 = new JPanel();

		JLabel lbl_graph2 = new JLabel("");
		lbl_graph2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_graph2.setBounds(32, 87, 813, 329);
		panel_3.add(lbl_graph2);
		
		String path4 = "C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\07 관리자 사용현황그래프.png";
		Image image4 = new ImageIcon(path4).getImage();
		panel_3.setLayout(null);
		
		JLabel lbl_image4 = new JLabel(new ImageIcon(image4.getScaledInstance(881, 542, Image.SCALE_SMOOTH)));
		lbl_image4.setBounds(0, 0, 875, 523);
		panel_3.add(lbl_image4);
		
		tabbedPane.addTab("New tab", null, panel_3, null);

	}
}

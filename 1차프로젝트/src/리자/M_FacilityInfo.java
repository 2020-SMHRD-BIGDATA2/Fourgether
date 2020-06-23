package 리자;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class M_FacilityInfo {

	private JFrame frame;
	private JLabel lbl_enableUserSize;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					M_FacilityInfo window = new M_FacilityInfo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public M_FacilityInfo() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 892, 563);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 892, 563);
		frame.getContentPane().add(panel);
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
		
		lbl_enableUserSize = new JLabel("");
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
	}

}

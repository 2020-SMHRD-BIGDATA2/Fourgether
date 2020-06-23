import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class MemberInformation {

	private JFrame frame;
	private JTextField txt_id;
	private JTextField txt_pw;
	private JTextField txt_name;
	private JTextField txt_idNumber;
	private JTextField txt_phoneNumber;
	private JTextField txt_address;
	private JLabel lbl_Level;
	Image[] list = new Image[5];
	ResisterDAO dao = new ResisterDAO();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberInformation window = new MemberInformation();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public MemberInformation() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 891, 552);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();

		panel.setBounds(0, 0, 875, 513);
		frame.getContentPane().add(panel);

		JLabel btn_login = new JLabel("");
		list[0] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\수정확인2.png").getImage();
		list[1] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\수정확인1.png").getImage();

		btn_login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_login.setIcon(new ImageIcon(list[0]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_login.setIcon(new ImageIcon(list[1]));

			}
		});
		btn_login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();  
				Login.main(null);
			}
		});
		btn_login.setBounds(393, 449, 138, 45);
		panel.add(btn_login);
			
		txt_id = new JTextField();
		txt_id.setOpaque(false);
		txt_id.setColumns(10);
		txt_id.setBorder(null);
		txt_id.setBounds(347, 128, 222, 33);
		panel.add(txt_id);
		
		txt_pw = new JTextField();
		txt_pw.setOpaque(false);
		txt_pw.setColumns(10);
		txt_pw.setBorder(null);
		txt_pw.setBounds(347, 181, 222, 33);
		panel.add(txt_pw);
		
		txt_name = new JTextField();
		txt_name.setOpaque(false);
		txt_name.setColumns(10);
		txt_name.setBorder(null);
		txt_name.setBounds(347, 235, 222, 33);
		panel.add(txt_name);
		
		txt_idNumber = new JTextField();
		txt_idNumber.setOpaque(false);
		txt_idNumber.setColumns(10);
		txt_idNumber.setBorder(null);
		txt_idNumber.setBounds(347, 290, 222, 33);
		panel.add(txt_idNumber);
		
		txt_phoneNumber = new JTextField();
		txt_phoneNumber.setOpaque(false);
		txt_phoneNumber.setColumns(10);
		txt_phoneNumber.setBorder(null);
		txt_phoneNumber.setBounds(347, 348, 222, 33);
		panel.add(txt_phoneNumber);
		
		txt_address = new JTextField();
		txt_address.setOpaque(false);
		txt_address.setColumns(10);
		txt_address.setBorder(null);
		txt_address.setBounds(347, 404, 222, 33);
		panel.add(txt_address);
		
		
		
		lbl_Level = new JLabel("");
		// 등급 라벨 3 - 브론즈 / 2 - 실버 / 1 - 골드  횟수에따라 보여주는 이미지 다름
		Image list1 = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\medal3.png").getImage();
		Image list2 = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\medal2.png").getImage();
		Image list3 = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\medal1.png").getImage();
		Image image1 = list3;   // 회원 등급에 따라 list 번호 상이
		lbl_Level = new JLabel(new ImageIcon(image1.getScaledInstance(45, 45, Image.SCALE_SMOOTH)));
		
	
		lbl_Level.setForeground(Color.WHITE);
		lbl_Level.setFont(new Font("굴림", Font.BOLD, 13));
		lbl_Level.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_Level.setBounds(507, 79, 57, 45);
		panel.add(lbl_Level);
		
		String path = "C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\04 회원정보.png";
		Image image = new ImageIcon(path).getImage();
		panel.setLayout(null);

		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(881, 542, Image.SCALE_SMOOTH)));
		lbl_image.setBounds(0, 0, 875, 513);
		panel.add(lbl_image);
		
		
	}

}

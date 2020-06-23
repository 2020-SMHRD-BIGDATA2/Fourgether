import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
	static String path = System.getProperty("user.dir") +"\\src\\image\\";
	private JFrame frame;
	Image[] list = new Image[8];

	
	public static void main(String[] args) {
		System.out.println(path);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Main() {
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
		
		JLabel btn_MemberInfo_modify = new JLabel("");
		btn_MemberInfo_modify.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();  
				MemberInformation.main(null);
			}
		});
		btn_MemberInfo_modify.setBounds(129, 156, 123, 143);
		list[0] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\회원정보확인및수정아이콘2.png").getImage();
		list[1] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\회원정보확인및수정아이콘1.png").getImage();

		btn_MemberInfo_modify.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_MemberInfo_modify.setIcon(new ImageIcon(list[0]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_MemberInfo_modify.setIcon(new ImageIcon(list[1]));

			}
		});
		panel.add(btn_MemberInfo_modify);
		
		JLabel btn_ReservationCheck = new JLabel("");
		btn_ReservationCheck.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();  
				ReservationHistory.main(null);
			}
		});
		btn_ReservationCheck.setBounds(381, 156, 154, 143);
		list[2] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\달력2.png").getImage();
		list[3] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\달력1.png").getImage();

		btn_ReservationCheck.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_ReservationCheck.setIcon(new ImageIcon(list[2]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_ReservationCheck.setIcon(new ImageIcon(list[3]));

			}
		});
		panel.add(btn_ReservationCheck);
		
		
		JLabel btn_Search = new JLabel("");
		list[4] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\검색2.png").getImage();
		list[5] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\검색1.png").getImage();

		btn_Search.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_Search.setIcon(new ImageIcon(list[4]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_Search.setIcon(new ImageIcon(list[5]));

			}
		});
		btn_Search.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();  
				Search.main(null);
			}
		});
		btn_Search.setBounds(644, 147, 205, 175);
		panel.add(btn_Search);
		
		JLabel btn_logOut = new JLabel("");
		list[6] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\로그아웃2.png").getImage();
		list[7] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\로그아웃1.png").getImage();

		btn_logOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_logOut.setIcon(new ImageIcon(list[6]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_logOut.setIcon(new ImageIcon(list[7]));

			}
		});
		btn_logOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();  
				Login.main(null);
			}
		});
		btn_logOut.setBounds(748, 0, 101, 26);
		panel.add(btn_logOut);
		
		String path = "C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\03 메인페이지.png";
		Image image = new ImageIcon(path).getImage();
		panel.setLayout(null);

		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(881, 542, Image.SCALE_SMOOTH)));
		lbl_image.setBounds(0, 0, 875, 513);
		panel.add(lbl_image);
	}

}

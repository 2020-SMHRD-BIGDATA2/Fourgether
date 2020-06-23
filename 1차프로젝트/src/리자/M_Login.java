package 리자;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

public class M_Login {

	private JFrame frame;
	private JTextField txt_id;
	private JPasswordField txt_pw;
	Image[] list = new Image[4];

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					M_Login window = new M_Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public M_Login() {
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

		String path = "C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\01 관리자 로그인.png";
		Image image = new ImageIcon(path).getImage();
		panel.setLayout(null);

		txt_id = new JTextField();
		txt_id.setFont(new Font("굴림", Font.PLAIN, 15));
		txt_id.setBounds(318, 163, 252, 45);
		panel.add(txt_id);
		txt_id.setColumns(10);
		txt_id.setOpaque(false);
		txt_id.setBorder(null);

		txt_pw = new JPasswordField();
		txt_pw.setFont(new Font("굴림", Font.PLAIN, 15));
		txt_pw.setBounds(319, 263, 252, 45);
		panel.add(txt_pw);
		txt_pw.setOpaque(false);
		txt_pw.setBorder(null);

		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(881, 542, Image.SCALE_SMOOTH)));
		lbl_image.setBounds(0, 0, 875, 513);
		lbl_image.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

			}

		});

		JLabel btn_login = new JLabel(" ");
		list[0] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\btn_Entered.png").getImage();
		list[1] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\btn_Exited.png").getImage();

		btn_login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_login.setIcon(new ImageIcon(list[0]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_login.setIcon(new ImageIcon(list[1]));

			}
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();  
				M_FacilityList.main(null);
			}
		});
			
		
		JLabel btn_Join = new JLabel(" ");
		btn_Join.setHorizontalAlignment(SwingConstants.CENTER);
		list[2] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\관회2.png").getImage();
		list[3] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\관회1.png").getImage();

		btn_Join.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_Join.setIcon(new ImageIcon(list[2]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_Join.setIcon(new ImageIcon(list[3]));

			}
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();  
				M_Join.main(null);
			}
		});
		btn_Join.setBounds(388, 408, 110, 23);
		panel.add(btn_Join);

		btn_login.setBounds(410, 318, 85, 84);
		panel.add(btn_login);
		panel.add(lbl_image);

	}
}

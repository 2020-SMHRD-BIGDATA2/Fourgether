package FourUI;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import javax.swing.Icon;

public class Login {

	private JFrame frame;
	private JTextField txt_id;
	private JPasswordField txt_pw;
	DAO dao2 = new DAO();
	LoginDAO dao = new LoginDAO();
	Image[] list = new Image[6];
	static String path = System.getProperty("user.dir") + "\\src\\image\\";
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
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

		Image image = new ImageIcon(path+"01-1 로그인.png").getImage();
		panel.setLayout(null);

		txt_id = new JTextField();
		txt_id.setFont(new Font("굴림", Font.PLAIN, 15));
		txt_id.setBounds(298, 139, 292, 55);
		panel.add(txt_id);
		txt_id.setColumns(10);
		txt_id.setOpaque(false);
		txt_id.setBorder(null);

		txt_pw = new JPasswordField();
		txt_pw.setFont(new Font("굴림", Font.PLAIN, 15));
		txt_pw.setBounds(298, 228, 292, 55);
		panel.add(txt_pw);
		txt_pw.setOpaque(false);
		txt_pw.setBorder(null);

		JLabel btn_Join = new JLabel(" ");
		btn_Join.setHorizontalAlignment(SwingConstants.CENTER);
		list[2] = new ImageIcon(path+"회원가입2.png").getImage();
		list[3] = new ImageIcon(path+"회원가입.png").getImage();

		btn_Join.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_Join.setIcon(new ImageIcon(list[2]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_Join.setIcon(new ImageIcon(list[3]));

			}
		});
		btn_Join.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Join.main(null);
			}
		});
		btn_Join.setBounds(235, 444, 166, 59);
		panel.add(btn_Join);
		

		JLabel btn_nonMember = new JLabel(" ");
		btn_nonMember.setHorizontalAlignment(SwingConstants.CENTER);
		list[4] = new ImageIcon(path+"비회원로그인버튼2.png").getImage();
		list[5] = new ImageIcon(path+"비회원로그인버튼.png").getImage();

		btn_nonMember.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_nonMember.setIcon(new ImageIcon(list[4]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_nonMember.setIcon(new ImageIcon(list[5]));

			}
		});
		btn_nonMember.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Search.main(null);
			}
		});
		btn_nonMember.setBounds(477, 453, 159, 45);
		panel.add(btn_nonMember);
		
		JLabel lbl_image = new JLabel("");
		
		lbl_image.setBounds(0, 0, 875, 513);
		lbl_image.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

			}

		});

		JLabel btn_login = new JLabel(" ");
		
		list[0] = new ImageIcon(path+"btn_Entered.png").getImage();
		list[1] = new ImageIcon(path+"btn_Exited.png").getImage();

		btn_login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_login.setIcon(new ImageIcon(list[0]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_login.setIcon(new ImageIcon(list[1]));

			}
	
			public void mouseClicked(MouseEvent e) {
				
				String id = txt_id.getText();
				String pw = txt_pw.getText();
				LoginVO vo = new LoginVO(id, pw);
				
				int cnt = dao.logCheck(vo);
				if (cnt >0) {
					JOptionPane.showMessageDialog(null, "환영해요!", "로그인성공", JOptionPane.INFORMATION_MESSAGE);
					frame.dispose();
					Main.main(null);
				}else {
					JOptionPane.showMessageDialog(null, "아이디,비밀번호를 확인하세요.", "로그인실패", JOptionPane.INFORMATION_MESSAGE);
				}
			}

			

			

		});
		
		btn_login.setBounds(409, 328, 85, 84);
		panel.add(btn_login);
		panel.add(lbl_image);

	}
}

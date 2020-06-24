package FourUI;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Join {

	private JFrame frame;
	private JTextField txt_id;
	private JTextField txt_pw;
	private JTextField txt_name;
	private JTextField txt_idNumber;
	private JTextField txt_phonenumber;
	private JTextField txt_address;
	private JLabel btn_apply;
	private JLabel btn_DoubleCheck;
	Image[] list = new Image[4];
	static String path = System.getProperty("user.dir") + "\\src\\image\\";
	private JoinDAO dao = new JoinDAO();

	public static void main(String[] args) {
		System.out.println(path);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Join window = new Join();

					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Join() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 843, 552);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();

		panel.setBounds(0, 0, 875, 513);
		frame.getContentPane().add(panel);

		txt_id = new JTextField();
		txt_id.setBounds(330, 126, 174, 33);
		panel.add(txt_id);
		txt_id.setColumns(10);
		txt_id.setOpaque(false);
		txt_id.setBorder(null);

		txt_pw = new JTextField();
		txt_pw.setColumns(10);
		txt_pw.setBounds(330, 180, 209, 33);
		panel.add(txt_pw);
		txt_pw.setOpaque(false);
		txt_pw.setBorder(null);

		txt_name = new JTextField();
		txt_name.setColumns(10);
		txt_name.setBounds(330, 237, 209, 33);
		panel.add(txt_name);
		txt_name.setOpaque(false);
		txt_name.setBorder(null);

		txt_idNumber = new JTextField();
		txt_idNumber.setColumns(10);
		txt_idNumber.setBounds(330, 292, 209, 33);
		panel.add(txt_idNumber);
		txt_idNumber.setOpaque(false);
		txt_idNumber.setBorder(null);

		txt_phonenumber = new JTextField();
		txt_phonenumber.setColumns(10);
		txt_phonenumber.setBounds(330, 347, 222, 33);
		panel.add(txt_phonenumber);
		txt_phonenumber.setOpaque(false);
		txt_phonenumber.setBorder(null);

		txt_address = new JTextField();
		txt_address.setColumns(10);
		txt_address.setBounds(330, 401, 233, 33);
		panel.add(txt_address);
		txt_address.setOpaque(false);
		txt_address.setBorder(null);

		btn_apply = new JLabel("");
		list[2] = new ImageIcon(path + "회원등록2.png").getImage();
		list[3] = new ImageIcon(path + "회원등록1.png").getImage();

		btn_apply.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_apply.setIcon(new ImageIcon(list[2]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_apply.setIcon(new ImageIcon(list[3]));

			}

			@Override
			public void mouseClicked(MouseEvent e) {

				String id = txt_id.getText();
				String pw = txt_pw.getText();
				String name = txt_name.getText();
				int pv_num = Integer.parseInt(txt_idNumber.getText());
				String ph_num = txt_phonenumber.getText();
				String addr = txt_address.getText();

				ResisterVO vo = new ResisterVO(id, pw, name, pv_num, ph_num, addr);
				int cnt = dao.join(vo);
				if (cnt > 0) {
					JOptionPane.showMessageDialog(null, "가입축하드려요!", "회원가입", JOptionPane.INFORMATION_MESSAGE);
					frame.dispose();
					Login.main(null);
				} else {
					JOptionPane.showMessageDialog(null, "가입실패!", "회원가입", JOptionPane.INFORMATION_MESSAGE);
				}

			}
		});

		btn_apply.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Login.main(null);
			}
		});

		btn_apply.setBounds(404, 448, 47, 44);
		panel.add(btn_apply);

		btn_DoubleCheck = new JLabel("");
		list[0] = new ImageIcon(path + "중복확인1.png").getImage();
		list[1] = new ImageIcon(path + "중복확인2.png").getImage();

		btn_DoubleCheck.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_DoubleCheck.setIcon(new ImageIcon(list[0]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_DoubleCheck.setIcon(new ImageIcon(list[1]));

			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String id = txt_id.getText();
				UserVO vo = new UserVO(id);
				int cnt = dao.idCheck(vo);
				if (cnt > 0) {
					JOptionPane.showMessageDialog(null, "다행이에요! 중복된 아이디가없어요!", "중복확인", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "중복된 아이디가 있어요 ㅠㅠ", "중복확인", JOptionPane.INFORMATION_MESSAGE);
				}

			}
		});
				
		btn_DoubleCheck.setBounds(516, 126, 57, 35);
		panel.add(btn_DoubleCheck);

		Image image = new ImageIcon(path + "02 회원가입.png").getImage();
		panel.setLayout(null);

		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(881, 542, Image.SCALE_SMOOTH)));
		lbl_image.setBounds(0, 0, 875, 513);
		panel.add(lbl_image);
	}

}

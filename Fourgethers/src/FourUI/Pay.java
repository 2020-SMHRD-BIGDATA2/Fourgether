package FourUI;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

public class Pay {

	private JFrame frame;
	private JTextField txt_cardNumber;
	private JPasswordField txt_pw;
	Image[] list = new Image[2];
	private JLabel lbl_level_1;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pay window = new Pay();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Pay() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 537 , 535);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();

		panel.setBounds(0, 0, 537 , 535);
		frame.getContentPane().add(panel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("굴림", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uCE74\uB4DC\uC0AC", "\uAD6D\uBBFC", "\uC2E0\uD55C", "\uD558\uB098", "\uC0BC\uC131", "\uAE30\uC5C5", "\uAD11\uC8FC", "\uC2E0\uD611", "\uB18D\uD611"}));
		comboBox.setBounds(58, 167, 144, 35);
		panel.add(comboBox);
		
		txt_cardNumber = new JTextField();
		txt_cardNumber.setOpaque(false);
		txt_cardNumber.setBorder(null);
		txt_cardNumber.setBounds(298, 170, 173, 32);
		panel.add(txt_cardNumber);
		txt_cardNumber.setColumns(10);
		
		JLabel lbl_level = new JLabel(new ImageIcon(""));
		Image list1 = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\medal3.png").getImage();
		Image list2 = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\medal2.png").getImage();
		Image list3 = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\medal1.png").getImage();
		Image image1 = list3;   // 회원 등급에 따라 list 번호 상이
		lbl_level_1 = new JLabel(new ImageIcon(image1.getScaledInstance(45, 45, Image.SCALE_SMOOTH)));
		lbl_level_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lbl_level_1.setBounds(287, 272, 57, 48);
		panel.add(lbl_level_1);
		
		JLabel lbl_levelDiscount = new JLabel("");
		lbl_levelDiscount.setBounds(297, 330, 78, 29);
		panel.add(lbl_levelDiscount);
		
		JLabel lbl_resultCharge = new JLabel("");
		lbl_resultCharge.setBounds(295, 374, 185, 29);
		panel.add(lbl_resultCharge);
		
		txt_pw = new JPasswordField();
		txt_pw.setBounds(298, 227, 173, 35);
		panel.add(txt_pw);
		txt_pw.setOpaque(false);
		txt_pw.setBorder(null);
		
		JLabel btn_pay = new JLabel("");
		btn_pay.setBounds(188, 433, 156, 46);
		panel.add(btn_pay);
		list[0] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\결제하기2.png").getImage();
		list[1] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\결제하기1.png").getImage();

		btn_pay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_pay.setIcon(new ImageIcon(list[0]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_pay.setIcon(new ImageIcon(list[1]));

			}
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "결제가 완료 되었습니다.","결제완료", JOptionPane.INFORMATION_MESSAGE);
				
				frame.dispose();  
				ReservationHistory.main(null);
			}
		});
		
		
		String path = "C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\08 결제.png";
		Image image = new ImageIcon(path).getImage();
		panel.setLayout(null);

		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(537 , 535, Image.SCALE_SMOOTH)));
		lbl_image.setBounds(0, 0, 537, 535);
		panel.add(lbl_image);
	}


	

}

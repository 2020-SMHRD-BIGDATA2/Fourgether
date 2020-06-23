package FourUI;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Search {

	private JFrame frame;
	private JTextField txt_Search;
	Image[] list = new Image[6];

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search window = new Search();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Search() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 899, 552);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();

		panel.setBounds(0, 0, 875, 513);
		frame.getContentPane().add(panel);
		
		txt_Search = new JTextField();
		txt_Search.setFont(new Font("굴림", Font.BOLD, 15));
		txt_Search.setBounds(163, 163, 540, 47);
		panel.add(txt_Search);
		txt_Search.setColumns(10);
		txt_Search.setOpaque(false);
		txt_Search.setBorder(null);
		
		JLabel btn_Search = new JLabel("");
		list[2] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\시설명검색1.png").getImage();
		list[3] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\시설명검색2.png").getImage();

		btn_Search.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_Search.setIcon(new ImageIcon(list[2]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_Search.setIcon(new ImageIcon(list[3]));

			}
		});
		btn_Search.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();  
				SearchResult.main(null);
			}
		});
		btn_Search.setBounds(721, 163, 90, 49);
		panel.add(btn_Search);
		
		JLabel btn_goMain = new JLabel("");
		list[0] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\메인으로2.png").getImage();
		list[1] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\메인으로1.png").getImage();

		btn_goMain.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_goMain.setIcon(new ImageIcon(list[0]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_goMain.setIcon(new ImageIcon(list[1]));

			}
		});
		btn_goMain.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();  
				Main.main(null);
			}
		});
		btn_goMain.setBounds(733, 0, 142, 32);
		panel.add(btn_goMain);
		
		JLabel btn_CategoriSearch = new JLabel("");
		list[4] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\카테고리검색2.png").getImage();
		list[5] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\카테고리검색1.png").getImage();

		btn_CategoriSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_CategoriSearch.setIcon(new ImageIcon(list[4]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_CategoriSearch.setIcon(new ImageIcon(list[5]));

			}
		});
		btn_CategoriSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();  
				SearchResult.main(null);
			}
		});
		btn_CategoriSearch.setBounds(403, 465, 90, 38);
		panel.add(btn_CategoriSearch);
		
		
		
		JComboBox cbx_sido = new JComboBox();
		cbx_sido.setFont(new Font("굴림", Font.PLAIN, 15));
		cbx_sido.setModel(new DefaultComboBoxModel(new String[] {"\uC2DC, \uB3C4 \uC120\uD0DD", "\uC11C\uC6B8\uD2B9\uBCC4\uC2DC"}));
		cbx_sido.setToolTipText("");
		cbx_sido.setBounds(93, 296, 120, 38);
		panel.add(cbx_sido);
		cbx_sido.setBorder(null);
		cbx_sido.setOpaque(false);
		
		JComboBox cbx_sigungu = new JComboBox();
		cbx_sigungu.setModel(new DefaultComboBoxModel(new String[] {"\uC2DC,\uAD70,\uAD6C \uC120\uD0DD"}));
		cbx_sigungu.setFont(new Font("굴림", Font.PLAIN, 15));
		cbx_sigungu.setToolTipText("");
		cbx_sigungu.setBounds(243, 296, 120, 38);
		panel.add(cbx_sigungu);
		
		JComboBox cbx_facility = new JComboBox();
		cbx_facility.setFont(new Font("굴림", Font.PLAIN, 15));
		cbx_facility.setModel(new DefaultComboBoxModel(new String[] {"\uC2DC\uC124\uC720\uD615 \uC120\uD0DD"}));
		cbx_facility.setToolTipText("");
		cbx_facility.setBounds(391, 296, 120, 38);
		panel.add(cbx_facility);
		
		JComboBox cbx_fee = new JComboBox();
		cbx_fee.setFont(new Font("굴림", Font.PLAIN, 15));
		cbx_fee.setModel(new DefaultComboBoxModel(new String[] {"\uC720/\uBB34\uB8CC \uC120\uD0DD"}));
		cbx_fee.setToolTipText("");
		cbx_fee.setBounds(540, 296, 120, 38);
		panel.add(cbx_fee);
		
		JComboBox cbx_useSize = new JComboBox();
		cbx_useSize.setFont(new Font("굴림", Font.PLAIN, 15));
		cbx_useSize.setModel(new DefaultComboBoxModel(new String[] {"\uC774\uC6A9\uC815\uC6D0 \uC120\uD0DD"}));
		cbx_useSize.setToolTipText("");
		cbx_useSize.setBounds(691, 296, 120, 38);
		panel.add(cbx_useSize);
		
		String path = "C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\05 검색.png";
		Image image = new ImageIcon(path).getImage();
		panel.setLayout(null);

		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(881, 542, Image.SCALE_SMOOTH)));
		lbl_image.setBounds(0, 0, 886, 513);
		panel.add(lbl_image);
	}
}

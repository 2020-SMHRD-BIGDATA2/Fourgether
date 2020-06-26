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
import java.nio.channels.SelectionKey;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Search {
	JComboBox cbx_sigungu;
	JComboBox cbx_sido;
	JComboBox cbx_facility;
	JComboBox cbx_fee;
	ArrayList<FCVO> result;
	private JFrame frame;
	private JTextField txt_Search;
	Image[] list = new Image[6];
	SearchDAO search_dao = new SearchDAO();
	static String path = System.getProperty("user.dir") + "\\src\\image\\";
	static String sido;
	static String sigungu;
	static String fctype;
	static String fee;

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
		list[2] = new ImageIcon(path + "시설명검색1.png").getImage();
		list[3] = new ImageIcon(path + "시설명검색2.png").getImage();

		btn_Search.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_Search.setIcon(new ImageIcon(list[2]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_Search.setIcon(new ImageIcon(list[3]));

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				if (txt_Search.getText().equals("")) {
					System.out.println("");
				} else {
					result = search_dao.key_search(txt_Search.getText());
					search_dao.print(result);
					frame.dispose();
					SearchResult.main(null);
				}
			}

		});

		btn_Search.setBounds(721, 163, 90, 49);
		panel.add(btn_Search);

		JLabel btn_goMain = new JLabel("");
		list[0] = new ImageIcon(path + "메인으로2.png").getImage();
		list[1] = new ImageIcon(path + "메인으로1.png").getImage();

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
		list[4] = new ImageIcon(path + "카테고리검색2.png").getImage();
		list[5] = new ImageIcon(path + "카테고리검색1.png").getImage();

		btn_CategoriSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_CategoriSearch.setIcon(new ImageIcon(list[4]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_CategoriSearch.setIcon(new ImageIcon(list[5]));

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				search_dao.key_search(sido, sigungu, fctype, fee);
				// 카테고리 검색 후

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

		cbx_sido = new JComboBox();
		cbx_sido.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				sido = (String) cbx_sido.getSelectedItem();
				System.out.println("Selected: " + sido);
				cbx_sigungu.removeAllItems();
				search_dao.create_gu(sido);
				for (int i = 0; i < search_dao.gu.size(); i++) {
					cbx_sigungu.addItem(search_dao.gu.get(i));
				}

			}
		});
		cbx_sido.setFont(new Font("굴림", Font.PLAIN, 15));
		cbx_sido.setModel(new DefaultComboBoxModel(
				new String[] { "\uC2DC, \uB3C4 \uC120\uD0DD", "\uC11C\uC6B8\uD2B9\uBCC4\uC2DC" }));
		cbx_sido.setToolTipText("");
		cbx_sido.setBounds(90, 296, 142, 38);
		panel.add(cbx_sido);
		cbx_sido.setBorder(null);
		cbx_sido.setOpaque(false);
		cbx_sido.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				sido = (String) cbx_sido.getSelectedItem();
				System.out.println("Selected: " + sido);
			}
		});

		search_dao.create_sido();
		for (int i = 0; i < search_dao.sido.size(); i++) {
			cbx_sido.addItem(search_dao.sido.get(i));
		}

		cbx_sigungu = new JComboBox();
		cbx_sigungu.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				sigungu = (String) cbx_sigungu.getSelectedItem();
				System.out.println("Selected: " + sigungu);
			}
		});

		cbx_sigungu.setModel(new DefaultComboBoxModel(new String[] { "\uC2DC,\uAD70,\uAD6C \uC120\uD0DD" }));
		cbx_sigungu.setFont(new Font("굴림", Font.PLAIN, 15));
		cbx_sigungu.setToolTipText("");
		cbx_sigungu.setBounds(284, 296, 142, 38);
		panel.add(cbx_sigungu);

		cbx_facility = new JComboBox();

		cbx_facility.setFont(new Font("굴림", Font.PLAIN, 15));
		cbx_facility.setModel(new DefaultComboBoxModel(new String[] { "\uC2DC\uC124\uC720\uD615 \uC120\uD0DD" }));
		cbx_facility.setToolTipText("");
		cbx_facility.setBounds(478, 296, 142, 38);
		panel.add(cbx_facility);
		search_dao.create_type();
		for (int i = 0; i < search_dao.FcType.size(); i++) {
			cbx_facility.addItem(search_dao.FcType.get(i));
		}

		cbx_facility.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				fctype = (String) cbx_facility.getSelectedItem();
				System.out.println("Selected: " + fctype);
			}
		});

		cbx_fee = new JComboBox();

		cbx_fee.setFont(new Font("굴림", Font.PLAIN, 15));
		cbx_fee.setModel(new DefaultComboBoxModel(new String[] { "\uC720/\uBB34\uB8CC \uC120\uD0DD", "Y", "N" }));
		cbx_fee.setToolTipText("");
		cbx_fee.setBounds(669, 296, 142, 38);
		panel.add(cbx_fee);
		cbx_fee.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				fee = (String) cbx_fee.getSelectedItem();
				System.out.println("Selected: " + fee);
			}
		});

		Image image = new ImageIcon(path + "05 검색.png").getImage();
		panel.setLayout(null);

		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(881, 542, Image.SCALE_SMOOTH)));
		lbl_image.setBounds(0, 0, 886, 513);
		panel.add(lbl_image);
	}
}

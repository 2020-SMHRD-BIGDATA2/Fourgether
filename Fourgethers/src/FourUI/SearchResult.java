package FourUI;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.sql.rowset.serial.SerialArray;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.border.TitledBorder;

public class SearchResult {

	private JFrame frame;
	private SearchDAO search_dao = new SearchDAO();
	Image[] list = new Image[6];
	static String path = System.getProperty("user.dir") + "\\src\\image\\";
	private String name;
	static SearchDAO s_dao = new SearchDAO();
	static int i = 1;
	

	public static void main(String[] argv) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchResult window = new SearchResult();
					window.frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SearchResult() {
		initialize();
	}

	private void initialize() {
		try {
			frame = new JFrame();
			frame.getContentPane().setBackground(Color.WHITE);
			frame.setBounds(100, 100, 900, 620);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);

			JPanel panel = new JPanel();
			panel.setBackground(Color.WHITE);
			panel.setForeground(Color.WHITE);

			panel.setBounds(0, 0, 875, 581);
			frame.getContentPane().add(panel);

			JLabel btn_goSearch = new JLabel("");
			list[0] = new ImageIcon(path + "°Ë»öÆäÀÌÁö·Î2.png").getImage();
			list[1] = new ImageIcon(path + "°Ë»öÆäÀÌÁö·Î1.png").getImage();

			btn_goSearch.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					btn_goSearch.setIcon(new ImageIcon(list[0]));

				}

				@Override
				public void mouseExited(MouseEvent e) {
					btn_goSearch.setIcon(new ImageIcon(list[1]));

				}
			});

			btn_goSearch.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					frame.dispose();
					Search.main(null);
				}
			});
			btn_goSearch.setBounds(721, 39, 160, 49);
			panel.add(btn_goSearch);
			list[4] = new ImageIcon(path + "¿ÞÂÊ2.png").getImage();
			list[5] = new ImageIcon(path + "¿ÞÂÊ1.png").getImage();
			list[2] = new ImageIcon(path + "¿À¸¥ÂÊ2.png").getImage();
			list[3] = new ImageIcon(path + "¿À¸¥ÂÊ1.png").getImage();
			ArrayList<FCVO> arr = s_dao.fc_arr;
			JLabel txt_list_1_1 = new JLabel(arr.get(i).getName());
			txt_list_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));

			txt_list_1_1.setBounds(82, 243, 294, 54);
			panel.add(txt_list_1_1);

			JLabel txt_list_1_2 = new JLabel(arr.get(i).getType());
			txt_list_1_2.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_1_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
			txt_list_1_2.setBounds(375, 243, 142, 54);
			panel.add(txt_list_1_2);

			JLabel txt_list_1_3 = new JLabel(arr.get(i).getFee_yn());
			txt_list_1_3.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_1_3.setFont(new Font("±¼¸²", Font.PLAIN, 15));
			txt_list_1_3.setBounds(528, 243, 142, 54);
			panel.add(txt_list_1_3);

			JLabel txt_list_1_4 = new JLabel("Æò°¡º¸±â");
			txt_list_1_4.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_1_4.setFont(new Font("±¼¸²", Font.PLAIN, 15));
			txt_list_1_4.setBounds(685, 243, 130, 54);
			panel.add(txt_list_1_4);

			JLabel txt_list_2_1 = new JLabel(arr.get(i+1).getName());
			txt_list_2_1.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_2_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
			txt_list_2_1.setBounds(82, 387, 294, 54);
			panel.add(txt_list_2_1);

			JLabel txt_list_2_2 = new JLabel(arr.get(i+1).getType());
			txt_list_2_2.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_2_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
			txt_list_2_2.setBounds(375, 314, 142, 54);
			panel.add(txt_list_2_2);

			JLabel txt_list_2_3 = new JLabel(arr.get(i+1).getFee_yn());
			txt_list_2_3.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_2_3.setFont(new Font("±¼¸²", Font.PLAIN, 15));
			txt_list_2_3.setBounds(528, 314, 142, 54);
			panel.add(txt_list_2_3);

			JLabel txt_list_2_4 = new JLabel("Æò°¡º¸±â");
			txt_list_2_4.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_2_4.setFont(new Font("±¼¸²", Font.PLAIN, 15));
			txt_list_2_4.setBounds(685, 314, 130, 54);
			panel.add(txt_list_2_4);

			JLabel txt_list_3_1 = new JLabel(arr.get(i+1).getName());
			txt_list_3_1.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_3_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
			txt_list_3_1.setBounds(82, 314, 294, 54);
			panel.add(txt_list_3_1);

			JLabel txt_list_3_2 = new JLabel(arr.get(i+1).getType());
			txt_list_3_2.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_3_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
			txt_list_3_2.setBounds(375, 387, 142, 54);
			panel.add(txt_list_3_2);

			JLabel txt_list_3_3 = new JLabel(arr.get(i+1).getFee_yn());
			txt_list_3_3.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_3_3.setFont(new Font("±¼¸²", Font.PLAIN, 15));
			txt_list_3_3.setBounds(528, 387, 142, 54);
			panel.add(txt_list_3_3);

			JLabel txt_list_3_4 = new JLabel("Æò°¡º¸±â");
			txt_list_3_4.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_3_4.setFont(new Font("±¼¸²", Font.PLAIN, 15));
			txt_list_3_4.setBounds(688, 387, 125, 54);
			panel.add(txt_list_3_4);

			JLabel txt_list_4_1 = new JLabel(arr.get(i+2).getName());
			txt_list_4_1.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_4_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
			txt_list_4_1.setBounds(82, 467, 294, 54);
			panel.add(txt_list_4_1);

			JLabel txt_list_4_2 = new JLabel(arr.get(i+2).getType());
			txt_list_4_2.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_4_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
			txt_list_4_2.setBounds(375, 467, 142, 54);
			panel.add(txt_list_4_2);

			JLabel txt_list_4_3 = new JLabel(arr.get(i+2).getFee_yn());
			txt_list_4_3.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_4_3.setFont(new Font("±¼¸²", Font.PLAIN, 15));
			txt_list_4_3.setBounds(528, 467, 142, 54);
			panel.add(txt_list_4_3);

			JLabel txt_list_4_4 = new JLabel("Æò°¡º¸±â");
			txt_list_4_4.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_4_4.setFont(new Font("±¼¸²", Font.PLAIN, 15));
			txt_list_4_4.setBounds(685, 467, 130, 54);
			panel.add(txt_list_4_4);

			
			JLabel lbl_left = new JLabel("");
			lbl_left.setBounds(395, 537, 30, 31);
			panel.add(lbl_left);
			
			lbl_left.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					lbl_left.setIcon(new ImageIcon(list[4]));

				}

				@Override
				public void mouseExited(MouseEvent e) {
					lbl_left.setIcon(new ImageIcon(list[5]));

				}
			});
			
			JLabel lbl_right = new JLabel("");
			lbl_right.setBounds(457, 537, 30, 31);
			panel.add(lbl_right);
			
			lbl_right.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					lbl_right.setIcon(new ImageIcon(list[2]));

				}

				@Override
				public void mouseExited(MouseEvent e) {
					lbl_right.setIcon(new ImageIcon(list[3]));

				}
			});
			
		
			
			Image image = new ImageIcon(path + "06 °Ë»ö°á°ú.png").getImage();
			panel.setLayout(null);

			JLabel lbl_image = new JLabel(new ImageIcon(SearchResult.class.getResource("/image/06 \uAC80\uC0C9\uACB0\uACFC.PNG")));
			lbl_image.setBounds(0, 10, 875, 581);
			panel.add(lbl_image);
									

						


		} catch (NullPointerException e) {
			System.out.println("¿À·ù");
			e.printStackTrace();
		} finally {

		}

	}
}

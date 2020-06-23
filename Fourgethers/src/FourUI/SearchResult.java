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
import java.awt.Font;


public class SearchResult {

	private JFrame frame;
	Image[] list = new Image[6];
	
	public static void main(String[] args) {
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
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 900, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();

		panel.setBounds(0, 0, 875, 513);
		frame.getContentPane().add(panel);
		
		JLabel label = new JLabel("New label");
		label.setBounds(-10008, -10031, 875, 513);
		panel.add(label);
		
		JLabel btn_goSearch = new JLabel("");
		list[0] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1Â÷ÇÁ·ÎÁ§Æ®\\src\\image\\°Ë»öÆäÀÌÁö·Î2.png").getImage();
		list[1] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1Â÷ÇÁ·ÎÁ§Æ®\\src\\image\\°Ë»öÆäÀÌÁö·Î1.png").getImage();

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
		btn_goSearch.setBounds(725, 10, 148, 44);
		panel.add(btn_goSearch);
		
		JLabel txt_list_1 = new JLabel("");
		txt_list_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		txt_list_1.setBounds(73, 207, 142, 54);
		panel.add(txt_list_1);
		
		JLabel btn_before = new JLabel("");
		list[4] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1Â÷ÇÁ·ÎÁ§Æ®\\src\\image\\¿ÞÂÊ2.png").getImage();
		list[5] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1Â÷ÇÁ·ÎÁ§Æ®\\src\\image\\¿ÞÂÊ1.png").getImage();

		btn_before.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_before.setIcon(new ImageIcon(list[4]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_before.setIcon(new ImageIcon(list[5]));

			}
		});
		btn_before.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btn_before.setBounds(395, 477, 29, 36);
		panel.add(btn_before);
		
		JLabel btn_next = new JLabel("");
		list[2] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1Â÷ÇÁ·ÎÁ§Æ®\\src\\image\\¿À¸¥ÂÊ2.png").getImage();
		list[3] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1Â÷ÇÁ·ÎÁ§Æ®\\src\\image\\¿À¸¥ÂÊ1.png").getImage();

		btn_next.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_next.setIcon(new ImageIcon(list[2]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_next.setIcon(new ImageIcon(list[3]));

			}
		});
		
		btn_next.setBounds(458, 477, 29, 36);
		panel.add(btn_next);
		
		
		
		JLabel txt_list_1_1 = new JLabel("");
		txt_list_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		txt_list_1_1.setBounds(224, 207, 142, 54);
		panel.add(txt_list_1_1);
		
		JLabel txt_list_1_2 = new JLabel("");
		txt_list_1_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		txt_list_1_2.setBounds(375, 207, 142, 54);
		panel.add(txt_list_1_2);
		
		JLabel txt_list_1_3 = new JLabel("");
		txt_list_1_3.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		txt_list_1_3.setBounds(528, 207, 142, 54);
		panel.add(txt_list_1_3);
		
		JLabel txt_list_1_4 = new JLabel("");
		txt_list_1_4.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		txt_list_1_4.setBounds(685, 207, 130, 54);
		panel.add(txt_list_1_4);
		
		JLabel txt_list_2 = new JLabel("");
		txt_list_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		txt_list_2.setBounds(73, 280, 142, 54);
		panel.add(txt_list_2);
		
		JLabel txt_list_2_1 = new JLabel("");
		txt_list_2_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		txt_list_2_1.setBounds(234, 280, 142, 54);
		panel.add(txt_list_2_1);
		
		JLabel txt_list_2_2 = new JLabel("");
		txt_list_2_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		txt_list_2_2.setBounds(385, 280, 142, 54);
		panel.add(txt_list_2_2);
		
		JLabel txt_list_2_3 = new JLabel("");
		txt_list_2_3.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		txt_list_2_3.setBounds(538, 280, 142, 54);
		panel.add(txt_list_2_3);
		
		JLabel txt_list_2_4 = new JLabel("");
		txt_list_2_4.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		txt_list_2_4.setBounds(689, 280, 130, 54);
		panel.add(txt_list_2_4);
		
		JLabel txt_list_3 = new JLabel("");
		txt_list_3.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		txt_list_3.setBounds(73, 344, 142, 54);
		panel.add(txt_list_3);
		
		JLabel txt_list_3_1 = new JLabel("");
		txt_list_3_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		txt_list_3_1.setBounds(224, 344, 142, 54);
		panel.add(txt_list_3_1);
		
		JLabel txt_list_3_2 = new JLabel("");
		txt_list_3_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		txt_list_3_2.setBounds(375, 344, 142, 54);
		panel.add(txt_list_3_2);
		
		JLabel txt_list_3_3 = new JLabel("");
		txt_list_3_3.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		txt_list_3_3.setBounds(528, 344, 142, 54);
		panel.add(txt_list_3_3);
		
		JLabel txt_list_3_4 = new JLabel("");
		txt_list_3_4.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		txt_list_3_4.setBounds(690, 344, 125, 54);
		panel.add(txt_list_3_4);
		
		JLabel txt_list_4 = new JLabel("");
		txt_list_4.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		txt_list_4.setBounds(73, 418, 142, 54);
		panel.add(txt_list_4);
		
		JLabel txt_list_4_1 = new JLabel("");
		txt_list_4_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		txt_list_4_1.setBounds(224, 418, 142, 54);
		panel.add(txt_list_4_1);
		
		JLabel txt_list_4_2 = new JLabel("");
		txt_list_4_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		txt_list_4_2.setBounds(375, 418, 142, 54);
		panel.add(txt_list_4_2);
		
		JLabel txt_list_4_3 = new JLabel("");
		txt_list_4_3.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		txt_list_4_3.setBounds(528, 418, 142, 54);
		panel.add(txt_list_4_3);
		
		JLabel txt_list_4_4 = new JLabel("");
		txt_list_4_4.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		txt_list_4_4.setBounds(685, 418, 130, 54);
		panel.add(txt_list_4_4);
		
		String path = "C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1Â÷ÇÁ·ÎÁ§Æ®\\src\\image\\06 °Ë»ö°á°ú.png";
		Image image = new ImageIcon(path).getImage();
		panel.setLayout(null);

		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(881, 510, Image.SCALE_SMOOTH)));
		lbl_image.setBounds(0, 0, 875, 513);
		panel.add(lbl_image);
	}

}

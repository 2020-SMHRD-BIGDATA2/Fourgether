package FourUI;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class ReservationHistory {
	static int i=0;
	private JFrame frame;
	Image[] list = new Image[14];
	EndResVO[] arr_t = new EndResVO[2];
	EndResVO endresvo = new EndResVO();
	static String path = System.getProperty("user.dir") + "\\src\\image\\";
	ReservationDAO dao = new ReservationDAO();
	
	


	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReservationHistory window = new ReservationHistory();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ReservationHistory() {
		initialize();
	}

	
	private void initialize() {
		java.util.Iterator<EndResVO> iter;
		
		dao.getEndResAll();
		ArrayList<EndResVO> arr = dao.arr;
		iter = arr.iterator();
		EndResVO empty = new EndResVO();
		dao.print();
		dao.get_fc();
		System.out.println(FCVO.fc_name);
		
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 886, 552);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();

		panel.setBounds(0, 0, 875, 513);
		frame.getContentPane().add(panel);

	
		
		JLabel btn_left1 = new JLabel("");
		btn_left1.setBounds(397, 204, 25, 26);

		list[0] = new ImageIcon(path+"����2.png").getImage();
		list[1] = new ImageIcon(path+"����1.png").getImage();


		btn_left1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_left1.setIcon(new ImageIcon(list[0]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_left1.setIcon(new ImageIcon(list[1]));

			}
		});
		panel.add(btn_left1);
		
		JLabel btn_right1 = new JLabel("");
		btn_right1.setBounds(453, 203, 25, 26);

		list[2] = new ImageIcon(path + "������2.png").getImage();
		list[3] = new ImageIcon(path + "������1.png").getImage();


		btn_right1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_right1.setIcon(new ImageIcon(list[2]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_right1.setIcon(new ImageIcon(list[3]));

			}
		});
		panel.add(btn_right1);
		
		JLabel btn_left2 = new JLabel("");
		btn_left2.setBounds(397, 354, 25, 26);

		list[0] = new ImageIcon(path+"����2.png").getImage();

		list[1] = new ImageIcon(path+"����1.png").getImage();

		btn_left2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_left2.setIcon(new ImageIcon(list[0]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_left2.setIcon(new ImageIcon(list[1]));

			}
		});
		panel.add(btn_left2);
		
		JLabel btn_right2 = new JLabel("");
		btn_right2.setBounds(452, 351, 25, 29);
		list[2] = new ImageIcon(path+"������2.png").getImage();
		list[3] = new ImageIcon(path+"������1.png").getImage();

		btn_right2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_right2.setIcon(new ImageIcon(list[2]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_right2.setIcon(new ImageIcon(list[3]));

			}
		});
		panel.add(btn_right2);
		
		JLabel btn_left3 = new JLabel("");
		btn_left3.setBounds(397, 483, 25, 29);
		list[0] = new ImageIcon(path+"����2.png").getImage();
		list[1] = new ImageIcon(path+"����1.png").getImage();

		btn_left3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_left3.setIcon(new ImageIcon(list[0]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_left3.setIcon(new ImageIcon(list[1]));

			}
		});
		panel.add(btn_left3);
		
		JLabel btn_right3 = new JLabel("");
		btn_right3.setBounds(451, 481, 25, 29);
		list[2] = new ImageIcon(path+"������2.png").getImage();
		list[3] = new ImageIcon(path+"������1.png").getImage();

		btn_right3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_right3.setIcon(new ImageIcon(list[2]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_right3.setIcon(new ImageIcon(list[3]));

			}
		});
		panel.add(btn_right3);
		
		JLabel btn_goMain = new JLabel("");

		btn_goMain.setBounds(717, 10, 134, 40);

		list[4] = new ImageIcon(path+"��������2.png").getImage();
		list[5] = new ImageIcon(path+"��������1.png").getImage();

		btn_goMain.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_goMain.setIcon(new ImageIcon(list[4]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_goMain.setIcon(new ImageIcon(list[5]));

			}
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();  
				Main.main(null);
				
			}
		});
		panel.add(btn_goMain);
		

		
		JLabel lbl_1_1 = new JLabel("");
		lbl_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_1_1.setBounds(39, 118, 79, 35);
		panel.add(lbl_1_1);
		
		JLabel lbl_2_1 = new JLabel("");
		lbl_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_2_1.setBounds(39, 157, 79, 35);
		panel.add(lbl_2_1);
		
		JLabel lbl_1_2 = new JLabel("");
		lbl_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_1_2.setBounds(138, 118, 79, 35);
		panel.add(lbl_1_2);
		
		JLabel lbl_1_3 = new JLabel("");
		lbl_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_1_3.setBounds(241, 118, 79, 35);
		panel.add(lbl_1_3);
		
		JLabel lbl_1_4 = new JLabel("");
		lbl_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_1_4.setBounds(343, 118, 79, 35);
		panel.add(lbl_1_4);
		
		JLabel lbl_1_5 = new JLabel("");
		lbl_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_1_5.setBounds(442, 118, 79, 35);
		panel.add(lbl_1_5);
		
		JLabel lbl_1_6 = new JLabel("");
		lbl_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_1_6.setBounds(539, 118, 79, 35);
		panel.add(lbl_1_6);
		
		JLabel btn_1_cancel = new JLabel("\uC608\uC57D\uCDE8\uC18C\r\n");
		btn_1_cancel.setForeground(Color.GRAY);
		btn_1_cancel.setHorizontalAlignment(SwingConstants.CENTER);
		btn_1_cancel.setBounds(640, 118, 79, 35);
		panel.add(btn_1_cancel);
		
		JLabel btn_1_useDone = new JLabel("\uC0AC\uC6A9\uC644\uB8CC");
		btn_1_useDone.setForeground(Color.GRAY);
		btn_1_useDone.setHorizontalAlignment(SwingConstants.CENTER);
		btn_1_useDone.setBounds(744, 118, 79, 35);
		panel.add(btn_1_useDone);
		
		JLabel lbl_2_2 = new JLabel("");
		lbl_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_2_2.setBounds(138, 157, 79, 35);
		panel.add(lbl_2_2);
		
		JLabel lbl_2_3 = new JLabel("");
		lbl_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_2_3.setBounds(241, 157, 79, 35);
		panel.add(lbl_2_3);
		
		JLabel lbl_2_4 = new JLabel("");
		lbl_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_2_4.setBounds(343, 157, 79, 35);
		panel.add(lbl_2_4);
		
		JLabel lbl_2_5 = new JLabel("");
		lbl_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_2_5.setBounds(442, 157, 79, 35);
		panel.add(lbl_2_5);
		
		JLabel lbl_2_6 = new JLabel("");
		lbl_2_6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_2_6.setBounds(539, 157, 79, 35);
		panel.add(lbl_2_6);
		
		JLabel btn_2_cancel = new JLabel("\uC608\uC57D\uCDE8\uC18C");
		btn_2_cancel.setForeground(Color.GRAY);
		btn_2_cancel.setHorizontalAlignment(SwingConstants.CENTER);
		btn_2_cancel.setBounds(640, 157, 79, 35);
		panel.add(btn_2_cancel);
		
		JLabel btn_2_useDone = new JLabel("\uC0AC\uC6A9\uC644\uB8CC");
		btn_2_useDone.setForeground(Color.GRAY);
		btn_2_useDone.setHorizontalAlignment(SwingConstants.CENTER);
		btn_2_useDone.setBounds(744, 157, 79, 35);
		panel.add(btn_2_useDone);
		
		
		
		if (iter.hasNext() == true) {
			endresvo = iter.next();
			arr_t[0] = endresvo;
		} else {
			endresvo = empty;
			arr_t[0] = endresvo;
		}
		
		
		
		JLabel lbl_3_1 = new JLabel(i++ +"");
		lbl_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_3_1.setBounds(39, 288, 124, 18);
		panel.add(lbl_3_1);
		
		
		
		
		JLabel lbl_3_2 = new JLabel(endresvo.fc_name);
		lbl_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_3_2.setBounds(192, 288, 128, 18);
		panel.add(lbl_3_2);
		
		JLabel lbl_3_3 = new JLabel(endresvo.month);
		lbl_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_3_3.setBounds(371, 288, 107, 18);
		panel.add(lbl_3_3);
		
		JLabel lbl_3_4 = new JLabel(endresvo.day_num);
		lbl_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_3_4.setBounds(539, 288, 107, 18);
		panel.add(lbl_3_4);
		
		JLabel btn_�� = new JLabel("\uD3C9\uAC00\uD558\uAE30");
		btn_��.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();  
				MemberOpinion.main(null);
			}
		});
		btn_��.setForeground(Color.GRAY);
		btn_��.setHorizontalAlignment(SwingConstants.CENTER);
		btn_��.setBounds(698, 288, 107, 18);
		panel.add(btn_��);
		
		

		if (iter.hasNext() == true) {
			endresvo = iter.next();
			arr_t[0] = endresvo;
		} else {
			endresvo = empty;
			arr_t[0] = endresvo;
		}
		
		

		
		
		
		JLabel lbl_4_1 = new JLabel(i++ + "");
		lbl_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_4_1.setBounds(39, 320, 124, 18);
		panel.add(lbl_4_1);
		
		
		JLabel lbl_4_2 = new JLabel(endresvo.fc_name);
		lbl_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_4_2.setBounds(192, 316, 128, 22);
		panel.add(lbl_4_2);
		
		JLabel lbl_4_3 = new JLabel(endresvo.month);
		lbl_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_4_3.setBounds(371, 316, 107, 18);
		panel.add(lbl_4_3);
		
		JLabel lbl_4_4 = new JLabel(endresvo.day_num);
		lbl_4_4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_4_4.setBounds(539, 316, 107, 18);
		panel.add(lbl_4_4);
		
		JLabel lbl_4_5 = new JLabel("\uD3C9\uAC00\uD558\uAE30");
		lbl_4_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();  
				MemberOpinion.main(null);
			}
		});
		lbl_4_5.setForeground(Color.GRAY);
		lbl_4_5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_4_5.setBounds(698, 316, 107, 18);
		panel.add(lbl_4_5);
		
		JLabel lbl_5_1 = new JLabel("");
		lbl_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_5_1.setBounds(42, 427, 240, 18);
		panel.add(lbl_5_1);
		
		JLabel lbl_6_1 = new JLabel("");
		lbl_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_6_1.setBounds(42, 451, 240, 18);
		panel.add(lbl_6_1);
		
		JLabel lbl_5_2 = new JLabel("");
		lbl_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_5_2.setBounds(314, 429, 240, 18);
		panel.add(lbl_5_2);
		
		JLabel lbl_6_2 = new JLabel("");
		lbl_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_6_2.setBounds(314, 451, 240, 18);
		panel.add(lbl_6_2);
		
		JLabel lbl_5_3 = new JLabel("");
		lbl_5_3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_5_3.setBounds(585, 429, 240, 18);
		panel.add(lbl_5_3);
		

		JLabel lbl_6_3 = new JLabel("");
		lbl_6_3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_6_3.setBounds(585, 451, 240, 18);
		panel.add(lbl_6_3);
		

		Image image = new ImageIcon(path + "09 ���೻��.PNG").getImage();

		
		panel.setLayout(null);

		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(881, 512, Image.SCALE_SMOOTH)));
		lbl_image.setBounds(0, 0, 875, 513);
		panel.add(lbl_image);
	}

}

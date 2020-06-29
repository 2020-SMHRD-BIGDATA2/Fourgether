package FourUI;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import java.awt.Toolkit;

public class ReservationHistory {
	static ReservationVO[] fcvo = new ReservationVO[2];
	static ReservationVO[] fcvo_x = new ReservationVO[2];
	static ReservationVO fcvo2;
	static ReservationVO fcvox;
	private JFrame frame;
	Image[] list = new Image[14];
	static String path = System.getProperty("user.dir") + "\\src\\image\\";
	static ReservationDAO dao = new ReservationDAO();
	private JTable table;
	static int i = 0;
	static int j = 0;
	static int k = 0;
	static int i_size = 0;
	static int j_size = 0;
	static int k_size = 0;
	static JLabel label_1;
	static JLabel label_2;
	
	
	static JLabel lbl_5_1, lbl_5_2, lbl_5_3, lbl_5_4, lbl_6_1, lbl_6_2, lbl_6_3, lbl_6_4,lbl_3_1,
	lbl_3_2, lbl_3_3, lbl_3_4, lbl_3_5, lbl_3_6, lbl_4_1, lbl_4_2, lbl_4_3, lbl_4_4, lbl_4_5, lbl_4_6,
	lbl_1_1, lbl_1_2, lbl_1_3, lbl_1_4, lbl_1_5, lbl_2_1, lbl_2_2, lbl_2_3, lbl_2_4, lbl_2_5;

	
	
	
	

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
		dao = null;
		dao = new ReservationDAO();
		dao.get_reservation();
		dao.get_used();
		dao.get_complete();
		//dao.print_reservation();
		//dao.print_used();
		dao.print_complete();
		i_size = dao.reservation.size();
		j_size = dao.used.size();
		k_size = dao.complete.size();
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
		list[0] = new ImageIcon(path + "왼쪽2.png").getImage();
		list[1] = new ImageIcon(path + "왼쪽1.png").getImage();

		btn_left1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_left1.setIcon(new ImageIcon(list[0]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_left1.setIcon(new ImageIcon(list[1]));

			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				minus_x(lbl_1_1, lbl_1_2, lbl_1_3, lbl_1_4, lbl_1_5, lbl_2_1, lbl_2_2, lbl_2_3, lbl_2_4, lbl_2_5);
			}
		});
		panel.add(btn_left1);

		JLabel btn_right1 = new JLabel("");
		btn_right1.setBounds(453, 203, 25, 26);
		list[2] = new ImageIcon(path + "오른쪽2.png").getImage();
		list[3] = new ImageIcon(path + "오른쪽1.png").getImage();

		btn_right1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_right1.setIcon(new ImageIcon(list[2]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_right1.setIcon(new ImageIcon(list[3]));

			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
			
				plus_x(lbl_1_1, lbl_1_2, lbl_1_3, lbl_1_4, lbl_1_5, lbl_2_1, lbl_2_2, lbl_2_3, lbl_2_4, lbl_2_5);

				
			}
		});
		panel.add(btn_right1);

		JLabel btn_left2 = new JLabel("");
		btn_left2.setBounds(397, 354, 25, 26);
		list[0] = new ImageIcon(path + "왼쪽2.png").getImage();
		list[1] = new ImageIcon(path + "왼쪽1.png").getImage();

		btn_left2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_left2.setIcon(new ImageIcon(list[0]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_left2.setIcon(new ImageIcon(list[1]));
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				minus_y(lbl_3_1, lbl_3_2, lbl_3_3, lbl_3_4, lbl_3_5, lbl_4_1, lbl_4_2, lbl_4_3, lbl_4_4, lbl_4_5);
			}
		});
		panel.add(btn_left2);

		JLabel btn_right2 = new JLabel("");
		btn_right2.setBounds(452, 351, 25, 29);
		list[2] = new ImageIcon(path + "오른쪽2.png").getImage();
		list[3] = new ImageIcon(path + "오른쪽1.png").getImage();

		btn_right2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_right2.setIcon(new ImageIcon(list[2]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_right2.setIcon(new ImageIcon(list[3]));

			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				plus_y(lbl_3_1, lbl_3_2, lbl_3_3, lbl_3_4, lbl_3_5, lbl_4_1, lbl_4_2, lbl_4_3, lbl_4_4, lbl_4_5);
				


				
			}
		});
		panel.add(btn_right2);
		list[0] = new ImageIcon(path + "왼쪽2.png").getImage();
		list[1] = new ImageIcon(path + "왼쪽1.png").getImage();
		list[2] = new ImageIcon(path + "오른쪽2.png").getImage();
		list[3] = new ImageIcon(path + "오른쪽1.png").getImage();

		JLabel btn_goMain = new JLabel("");
		btn_goMain.setBounds(711, 10, 134, 40);
		list[4] = new ImageIcon(path + "메인으로2.png").getImage();
		list[5] = new ImageIcon(path + "메인으로1.png").getImage();

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

		plus_x(panel);
		plus_y(panel);
		plux_z(panel);
		Image image = new ImageIcon(path + "09 예약내역.png").getImage();
		panel.setLayout(null);

		JLabel lbl = new JLabel(new ImageIcon(image.getScaledInstance(881, 512, Image.SCALE_SMOOTH)));
		lbl.setBounds(0, 0, 875, 513);
		panel.add(lbl);

	}

	private void plux_z(JPanel panel) {
		if (k_size > 0) {
			 lbl_5_1 = new JLabel("");
			lbl_5_1.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_5_1.setBounds(42, 427, 240, 18);
			panel.add(lbl_5_1);

			 lbl_5_2 = new JLabel("");
			lbl_5_2.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_5_2.setBounds(314, 429, 240, 18);
			panel.add(lbl_5_2);

			 lbl_5_3 = new JLabel("");
			lbl_5_3.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_5_3.setBounds(585, 429, 240, 18);
			panel.add(lbl_5_3);
			
			
			 lbl_5_4 = new JLabel("");
			lbl_5_4.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_5_4.setBounds(585, 429, 240, 18);
			panel.add(lbl_5_4);
			lbl_5_4.setText(1 +"");

			 lbl_6_1 = new JLabel("");
			lbl_6_1.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_6_1.setBounds(42, 451, 240, 18);
			panel.add(lbl_6_1);
			
			
			 lbl_6_2 = new JLabel("");
			lbl_6_2.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_6_2.setBounds(314, 451, 240, 18);

			 lbl_6_3 = new JLabel("");
			lbl_6_3.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_6_3.setBounds(585, 451, 240, 18);
			panel.add(lbl_6_3);
			
			
			 lbl_6_4 = new JLabel("");
			lbl_6_4.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_6_4.setBounds(700, 451, 240, 18);
			panel.add(lbl_6_4);

			
			plus_z(lbl_5_1, lbl_5_2, lbl_5_3, lbl_5_4, lbl_6_1, lbl_6_2, lbl_6_3, lbl_6_4);
			

		}
	}

	private void plus_y(JPanel panel) {
		if (j_size > 0) {
			 lbl_3_1 = new JLabel("");
			lbl_3_1.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_3_1.setBounds(28, 287, 124, 18);
			panel.add(lbl_3_1);

			 lbl_3_2 = new JLabel("");
			lbl_3_2.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_3_2.setBounds(158, 287, 128, 18);
			panel.add(lbl_3_2);
			fcvo[0] = dao.used != null ? dao.used.get(0) : null;
			 lbl_3_3 = new JLabel("");
			lbl_3_3.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_3_3.setBounds(306, 287, 107, 18);
			panel.add(lbl_3_3);
			
			 lbl_3_4 = new JLabel("");
			lbl_3_4.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_3_4.setBounds(439, 287, 107, 18);
			panel.add(lbl_3_4);
			fcvo[1] = dao.used != null ? dao.used.get(1) : null;
			 lbl_3_5 = new JLabel("");
			lbl_3_5.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_3_5.setBounds(571, 287, 107, 18);
			panel.add(lbl_3_5);
			

			 lbl_3_6 = new JLabel("평가하기");
				lbl_3_6.setHorizontalAlignment(SwingConstants.CENTER);
				lbl_3_6.setBounds(715, 287, 107, 18);
				panel.add(lbl_3_6);
				
				lbl_3_6.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					System.out.println("sadjfklsdajfklshajfkshajfklshajfklshajfklshdafklshdafklshdafkl");
					
					System.out.println("sadjfklsdajfklshajfkshajfklshajfklshajfklshdafklshdafklshdafkl");
					System.out.println();
					dao.setRes1(fcvo[0]);
					fcvo2=fcvo[0];
					System.out.println(fcvo2.getId());
					frame.dispose();
					MemberOpinion.main(null);
				}
			});

			 lbl_4_1 = new JLabel("");
			lbl_4_1.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_4_1.setBounds(28, 320, 124, 18);
			panel.add(lbl_4_1);
			lbl_4_1.setText(Math.abs(j + 1) + "");

			 lbl_4_2 = new JLabel("");
			lbl_4_2.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_4_2.setBounds(158, 320, 128, 22);
			panel.add(lbl_4_2);

			 lbl_4_3 = new JLabel("");
			lbl_4_3.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_4_3.setBounds(306, 320, 107, 18);
			panel.add(lbl_4_3);

			 lbl_4_4 = new JLabel("");
			lbl_4_4.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_4_4.setBounds(439, 320, 107, 18);
			panel.add(lbl_4_4);

			 lbl_4_5 = new JLabel("");
			lbl_4_5.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_4_5.setBounds(571, 320, 107, 18);
			panel.add(lbl_4_5);

				
			plus_y(lbl_3_1, lbl_3_2, lbl_3_3, lbl_3_4, lbl_3_5, lbl_4_1, lbl_4_2, lbl_4_3, lbl_4_4, lbl_4_5);
			
			 lbl_4_6 = new JLabel("평가하기");
				lbl_4_6.setHorizontalAlignment(SwingConstants.CENTER);
				lbl_4_6.setBounds(716, 320, 107, 18);
				panel.add(lbl_4_6);
				
				lbl_4_6.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						dao.setRes1(fcvo[0]);
						fcvo2 = fcvo[0];
						System.out.println(fcvo2.fc_name+"awefweafweafweaffweafweafwaef");
						frame.dispose();
						MemberOpinion.main(null);
					}
				});
			
			
		}
	}

	private void plus_x(JPanel panel) {
		if (i_size > 0) {
			label_1 = new JLabel();
			label_1.setHorizontalAlignment(SwingConstants.CENTER);
			label_1.setBounds(65, 122, 500, 35);
			label_1.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseClicked(MouseEvent e) {
					fcvox = fcvo_x[0];

				}
			});
			
			label_2 = new JLabel();
			label_2.setHorizontalAlignment(SwingConstants.CENTER);
			label_2.setBounds(65, 157, 500, 35);
			label_2.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseClicked(MouseEvent e) {
					fcvox = fcvo_x[1];
				}
			});
			
			
			
			
			lbl_1_1 = new JLabel();
			lbl_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_1_1.setBounds(65, 122, 79, 35);
			panel.add(lbl_1_1);
			
			 lbl_1_2 = new JLabel(dao.reservation.get(Math.abs(i % i_size)).fc_name);
			lbl_1_2.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_1_2.setBounds(220, 122, 79, 35);
			panel.add(lbl_1_2);
			
			lbl_1_2.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e) {
					dao.clear();
					JOptionPane.showMessageDialog(null, "사용완료하시겠습니까?", "사용완료", JOptionPane.INFORMATION_MESSAGE);
				
				}
			});

			 lbl_1_3 = new JLabel(dao.reservation.get(i % i_size).month);
			lbl_1_3.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_1_3.setBounds(385, 122, 79, 35);
			panel.add(lbl_1_3);
			
			 lbl_1_4 = new JLabel(dao.reservation.get(i % i_size).day_num);
			lbl_1_4.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_1_4.setBounds(545, 122, 79, 35);
			panel.add(lbl_1_4);


			 lbl_1_5 = new JLabel(1 + "");
			lbl_1_5.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_1_5.setBounds(705, 122, 79, 35);
			panel.add(lbl_1_5);
			
			

			 lbl_2_1 = new JLabel();
			lbl_2_1.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_2_1.setBounds(65, 157, 79, 35);
			panel.add(lbl_2_1);
			

			 lbl_2_2 = new JLabel("");
			lbl_2_2.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_2_2.setBounds(220, 157, 79, 35);
			panel.add(lbl_2_2);
			
			lbl_2_2.addMouseListener(new MouseAdapter() {
				
				public void mouseClicked(MouseEvent e) {
					
					JOptionPane.showMessageDialog(null, "사용완료하시겠습니까?", "사용완료", JOptionPane.INFORMATION_MESSAGE);
				
				}
			});
			

			 lbl_2_3 = new JLabel("");
			lbl_2_3.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_2_3.setBounds(385, 157, 79, 35);
			panel.add(lbl_2_3);
			

			 lbl_2_4 = new JLabel("");
			lbl_2_4.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_2_4.setBounds(545, 157, 79, 35);
			panel.add(lbl_2_4);
			

			 lbl_2_5 = new JLabel("");
			lbl_2_5.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_2_5.setBounds(705, 157, 79, 35);
			panel.add(lbl_2_5);
			
			
			plus_x(lbl_1_1, lbl_1_2, lbl_1_3, lbl_1_4, lbl_1_5, lbl_2_1, lbl_2_2, lbl_2_3, lbl_2_4, lbl_2_5);
		}
	}

	private void plus_x(JLabel lbl_1_1, JLabel lbl_1_2, JLabel lbl_1_3, JLabel lbl_1_4, JLabel lbl_1_5, JLabel lbl_2_1,
			JLabel lbl_2_2, JLabel lbl_2_3, JLabel lbl_2_4, JLabel lbl_2_5) {
		int m = i;
		boolean bol = true;
		lbl_1_1.setText(i + 1 + "");
		
		lbl_1_2.setText(dao.reservation.get(Math.abs(i % i_size)).fc_name);
		lbl_1_3.setText(dao.reservation.get(Math.abs(i % i_size)).month);
		lbl_1_4.setText(dao.reservation.get(Math.abs(i % i_size)).day_num);
		lbl_1_5.setText(1 + "");
		
	
		
		
		i++;
		if(i==dao.reservation.size()) i=0;
		if(m==i) bol = false;
		if(bol) {
		lbl_2_1.setText(i + 1 + "");
		lbl_2_2.setText(dao.reservation.get(Math.abs(i % i_size)).fc_name);
		lbl_2_3.setText(dao.reservation.get(Math.abs(i % i_size)).month);
		lbl_2_4.setText(dao.reservation.get(Math.abs(i % i_size)).day_num);
		lbl_2_5.setText(1 + "");
		if(i==dao.reservation.size()) i=0;
		}else {
			lbl_2_1.setText("");
			lbl_2_2.setText("");
			lbl_2_3.setText("");
			lbl_2_4.setText("");
			lbl_2_5.setText("");
		}
		}
	
	private void plus_y(JLabel lbl_3_1, JLabel lbl_3_2, JLabel lbl_3_3, JLabel lbl_3_4, JLabel lbl_3_5, JLabel lbl_4_1,
			JLabel lbl_4_2, JLabel lbl_4_3, JLabel lbl_4_4, JLabel lbl_4_5) {
		int m = j;
		boolean bol = true;
		lbl_3_1.setText(j + 1 + "");
		lbl_3_2.setText(dao.used.get(Math.abs(j % j_size)).fc_name);
		if(lbl_3_2.setText().equals(""))
		lbl_3_3.setText(dao.used.get(Math.abs(j % j_size)).month);
		lbl_3_4.setText(dao.used.get(Math.abs(j % j_size)).day_num);
		lbl_3_5.setText(1 + "");
		fcvo[0] = dao.used.get(Math.abs(j % j_size));
		j++;
		if(j==dao.used.size()) j=0;
		if(m==j) bol = false;
		if(bol) {
		lbl_4_1.setText(j + 1 + "");
		lbl_4_2.setText(dao.used.get(Math.abs(j % j_size)).fc_name);
		lbl_4_3.setText(dao.used.get(Math.abs(j % j_size)).month);
		lbl_4_4.setText(dao.used.get(Math.abs(j % j_size)).day_num);
		lbl_4_5.setText(1 + "");
		fcvo[1] = dao.used.get(Math.abs(j % j_size));
		j++;}
		else {
			lbl_4_1.setText("");
			lbl_4_2.setText("");
			lbl_4_3.setText("");
			lbl_4_4.setText("");
			lbl_4_5.setText("");
		}
		if(j==dao.used.size()) j=0;
	}
	
	private void plus_z(JLabel lbl_5_1, JLabel lbl_5_2, JLabel lbl_5_3, JLabel lbl_5_4, JLabel lbl_6_1,
			JLabel lbl_6_2, JLabel lbl_6_3, JLabel lbl_6_4) {
		lbl_5_1.setText(dao.complete.get(Math.abs(k % k_size)).fc_name);
		lbl_5_2.setText(dao.complete.get(Math.abs(k % k_size)).month);
		lbl_5_3.setText(dao.complete.get(Math.abs(k % k_size)).day_num);
		lbl_5_4.setText(1 + "");
		if(k==dao.reservation.size()) k=0;
		lbl_6_1.setText(dao.complete.get(Math.abs(k % k_size)).fc_name);
		lbl_6_2.setText(dao.complete.get(Math.abs(k % k_size)).month);
		lbl_6_3.setText(dao.complete.get(Math.abs(k % k_size)).day_num);
		lbl_6_4.setText(1 + "");
		if(k==dao.reservation.size()) k=0;
	}
	
	
	private void minus_x(JLabel lbl_1_1, JLabel lbl_1_2, JLabel lbl_1_3, JLabel lbl_1_4, JLabel lbl_1_5, JLabel lbl_2_1,
			JLabel lbl_2_2, JLabel lbl_2_3, JLabel lbl_2_4, JLabel lbl_2_5) {
		int m = i;
		boolean bol = true;
		i--;
		if(i<0) i=dao.reservation.size()-1;
		fcvo_x[0]=dao.used.get(i%i_size);
		lbl_1_1.setText(Math.abs(i+1) + "");
		lbl_1_2.setText(dao.reservation.get(Math.abs(i % i_size)).fc_name);
		lbl_1_3.setText(dao.reservation.get(Math.abs(i % i_size)).month);
		lbl_1_4.setText(dao.reservation.get(Math.abs(i % i_size)).day_num);
		lbl_1_5.setText(1 + "");
		i--;
		if(i<0) i=dao.reservation.size()-1;
		fcvo[1]=dao.used.get(j%j_size);
		if(i == m) bol = false;
		if(bol) {
		lbl_2_1.setText(Math.abs(i+1) + "");
		lbl_2_2.setText(dao.reservation.get(Math.abs(i % i_size)).fc_name);
		lbl_2_3.setText(dao.reservation.get(Math.abs(i % i_size)).month);
		lbl_2_4.setText(dao.reservation.get(Math.abs(i % i_size)).day_num);
		lbl_2_5.setText(1 + "");
		}else {
			lbl_2_1.setText("");
			lbl_2_2.setText("");
			lbl_2_3.setText("");
			lbl_2_4.setText("");
			lbl_2_5.setText("");
		}
	}
	
	private void minus_y(JLabel lbl_3_1, JLabel lbl_3_2, JLabel lbl_3_3, JLabel lbl_3_4, JLabel lbl_3_5, JLabel lbl_4_1,
			JLabel lbl_4_2, JLabel lbl_4_3, JLabel lbl_4_4, JLabel lbl_4_5) {
		int m = j;
		boolean bol = true;
		j--;
		if(j<0) j=dao.used.size()-1;
		fcvo[0]=dao.used.get(j%j_size);
		lbl_3_1.setText(Math.abs(j + 1) + "");
		lbl_3_2.setText(dao.used.get(Math.abs(j % j_size)).fc_name);
		lbl_3_3.setText(dao.used.get(Math.abs(j % j_size)).month);
		lbl_3_4.setText(dao.used.get(Math.abs(j % j_size)).day_num);
		lbl_3_5.setText(1 + "");
		j--;
		if(j<0) j=dao.used.size()-1;
		if(j==m) bol = false;
		if(bol) {
		fcvo[1]=dao.used.get(j%j_size);
		lbl_4_1.setText(Math.abs(j + 1) + "");
		lbl_4_2.setText(dao.used.get(Math.abs(j % j_size)).fc_name);
		lbl_4_3.setText(dao.used.get(Math.abs(j % j_size)).month);
		lbl_4_4.setText(dao.used.get(Math.abs(j % j_size)).day_num);
		lbl_4_5.setText(1 + "");
		}else {
			lbl_4_1.setText("");
			lbl_4_2.setText("");
			lbl_4_3.setText("");
			lbl_4_4.setText("");
			lbl_4_5.setText("");
		}
	}
	
	
	
	
	
	
	
	
	

}

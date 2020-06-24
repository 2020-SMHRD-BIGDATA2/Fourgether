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
import javax.swing.text.html.HTMLDocument.Iterator;

public class SearchResult {
	static FCVO arr2;
	private JFrame frame;
	private SearchDAO search_dao = new SearchDAO();
	Image[] list = new Image[6];
	static String path = System.getProperty("user.dir") + "\\src\\image\\";
	private String name;
	static SearchDAO s_dao = new SearchDAO();
	static int i = 1;
	static int size = 0;
	static FCVO vv = new FCVO("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
	java.util.Iterator<FCVO> iter;
	static FacilityInformationDAO FIDAO = new FacilityInformationDAO();
	static JLabel txt_list_1_1;
	static JLabel txt_list_1_2;
	static JLabel txt_list_1_3;
	static JLabel txt_list_1_4;
	static JLabel txt_list_2_1;
	static JLabel txt_list_2_2;
	static JLabel txt_list_2_3;
	static JLabel txt_list_2_4;
	static JLabel txt_list_3_1;
	static JLabel txt_list_3_2;
	static JLabel txt_list_3_3;
	static JLabel txt_list_3_4;
	static JLabel txt_list_4_1;
	static JLabel txt_list_4_2;
	static JLabel txt_list_4_3;
	static JLabel txt_list_4_4;
	static FCVO[] w = new FCVO[4];

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
			size = s_dao.fc_arr.size();
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
///
			JLabel btn_goSearch = new JLabel("");
			list[0] = new ImageIcon(path + "검색페이지로2.png").getImage();
			list[1] = new ImageIcon(path + "검색페이지로1.png").getImage();

			btn_goSearch.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					btn_goSearch.setIcon(new ImageIcon(list[0]));

				}

				@Override
				public void mouseExited(MouseEvent e) {
					btn_goSearch.setIcon(new ImageIcon(list[1]));

				}

				@Override
				public void mouseClicked(MouseEvent e) {

					frame.dispose();
					search_dao.ListReset();
					Search.main(null);

				}
			});

			btn_goSearch.setBounds(721, 39, 160, 49);
			panel.add(btn_goSearch);
////			
			list[4] = new ImageIcon(path + "왼쪽2.png").getImage();
			list[5] = new ImageIcon(path + "왼쪽1.png").getImage();
			list[2] = new ImageIcon(path + "오른쪽2.png").getImage();
			list[3] = new ImageIcon(path + "오른쪽1.png").getImage();
			ArrayList<FCVO> arr = s_dao.fc_arr;
			iter = arr.iterator();
			arr2 = null;
			if (iter.hasNext() == true) {
				arr2 = iter.next();
				w[0] = arr2;
			} else {
				arr2 = vv;
				w[0] = arr2;
			}
			txt_list_1_1 = new JLabel(arr2.getName());
			txt_list_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_1_1.setFont(new Font("굴림", Font.PLAIN, 15));

			txt_list_1_1.setBounds(82, 243, 294, 54);
			panel.add(txt_list_1_1);

			txt_list_1_2 = new JLabel(arr2.getType());
			txt_list_1_2.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_1_2.setFont(new Font("굴림", Font.PLAIN, 15));
			txt_list_1_2.setBounds(375, 243, 142, 54);
			panel.add(txt_list_1_2);

			txt_list_1_3 = new JLabel(arr2.getFee_yn());
			txt_list_1_3.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_1_3.setFont(new Font("굴림", Font.PLAIN, 15));
			txt_list_1_3.setBounds(528, 243, 142, 54);
			panel.add(txt_list_1_3);

			txt_list_1_4 = new JLabel("평가보기");
			txt_list_1_4.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_1_4.setFont(new Font("굴림", Font.PLAIN, 15));
			txt_list_1_4.setBounds(685, 243, 130, 54);
			panel.add(txt_list_1_4);
			
			txt_list_1_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					frame.dispose();
					FIDAO.fcvo = w[0];
					FacilityInformation.main(null);
					
				}
			});
			
			

			if (iter.hasNext() == true) {
				arr2 = iter.next();
				w[1] = arr2;
			} else {
				arr2 = vv;
				w[1] = arr2;
			}

			txt_list_2_1 = new JLabel(arr2.getName());
			txt_list_2_1.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_2_1.setFont(new Font("굴림", Font.PLAIN, 15));
			txt_list_2_1.setBounds(82, 387, 294, 54);
			panel.add(txt_list_2_1);

			

			txt_list_2_2 = new JLabel(arr2.getType());
			txt_list_2_2.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_2_2.setFont(new Font("굴림", Font.PLAIN, 15));
			txt_list_2_2.setBounds(375, 314, 142, 54);
			panel.add(txt_list_2_2);

			
			
			
			
			
			txt_list_2_3 = new JLabel(arr2.getFee_yn());
			txt_list_2_3.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_2_3.setFont(new Font("굴림", Font.PLAIN, 15));
			txt_list_2_3.setBounds(528, 314, 142, 54);
			panel.add(txt_list_2_3);

			txt_list_2_4 = new JLabel("평가보기");
			txt_list_2_4.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_2_4.setFont(new Font("굴림", Font.PLAIN, 15));
			txt_list_2_4.setBounds(685, 314, 130, 54);
			panel.add(txt_list_2_4);
			
			txt_list_2_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					frame.dispose();
					FIDAO.fcvo = w[1];
					FacilityInformation.main(null);
					
				}
			});
			
			
			
			
			if (iter.hasNext() == true) {
				arr2 = iter.next();
				w[2] = arr2;
			} else {
				arr2 = vv;
				w[2] = arr2;
			}
			txt_list_3_1 = new JLabel(arr2.getName());
			txt_list_3_1.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_3_1.setFont(new Font("굴림", Font.PLAIN, 15));
			txt_list_3_1.setBounds(82, 314, 294, 54);
			panel.add(txt_list_3_1);

			txt_list_3_2 = new JLabel(arr2.getType());
			txt_list_3_2.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_3_2.setFont(new Font("굴림", Font.PLAIN, 15));
			txt_list_3_2.setBounds(375, 387, 142, 54);
			panel.add(txt_list_3_2);

			txt_list_3_3 = new JLabel(arr2.getFee_yn());
			txt_list_3_3.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_3_3.setFont(new Font("굴림", Font.PLAIN, 15));
			txt_list_3_3.setBounds(528, 387, 142, 54);
			panel.add(txt_list_3_3);

			txt_list_3_4 = new JLabel("평가보기");
			txt_list_3_4.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_3_4.setFont(new Font("굴림", Font.PLAIN, 15));
			txt_list_3_4.setBounds(688, 387, 125, 54);
			panel.add(txt_list_3_4);

			txt_list_3_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					frame.dispose();
					FIDAO.fcvo = w[2];
					FacilityInformation.main(null);
					
				}
			});
			
			
			if (iter.hasNext() == true) {
				arr2 = iter.next();
				w[3] = arr2;
			} else {
				arr2 = vv;
				w[3] = arr2;
			}
			txt_list_4_1 = new JLabel(arr2.getName());
			txt_list_4_1.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_4_1.setFont(new Font("굴림", Font.PLAIN, 15));
			txt_list_4_1.setBounds(82, 467, 294, 54);
			panel.add(txt_list_4_1);

			txt_list_4_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					frame.dispose();
					FacilityInformation.main(null);
				}
			});

			txt_list_4_2 = new JLabel(arr2.getType());
			txt_list_4_2.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_4_2.setFont(new Font("굴림", Font.PLAIN, 15));
			txt_list_4_2.setBounds(375, 467, 142, 54);
			panel.add(txt_list_4_2);

			txt_list_4_3 = new JLabel(arr2.getFee_yn());
			txt_list_4_3.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_4_3.setFont(new Font("굴림", Font.PLAIN, 15));
			txt_list_4_3.setBounds(528, 467, 142, 54);
			panel.add(txt_list_4_3);

			txt_list_4_4 = new JLabel("평가보기");
			txt_list_4_4.setHorizontalAlignment(SwingConstants.CENTER);
			txt_list_4_4.setFont(new Font("굴림", Font.PLAIN, 15));
			txt_list_4_4.setBounds(685, 467, 130, 54);
			panel.add(txt_list_4_4);

			
			txt_list_4_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					frame.dispose();
					FIDAO.fcvo = w[3];
					FacilityInformation.main(null);
				}
			});
			
			
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

				@Override
				public void mouseClicked(MouseEvent e) {

					ArrayList<FCVO> arr = s_dao.fc_arr;
					iter = arr.iterator();

					if (iter.hasNext() == true) {
						arr2 = iter.next();
						w[0] = arr2;
					} else {
						arr2 = vv;
						w[0] = arr2;
					}

					txt_list_1_1.setText(arr2.getName());
					txt_list_1_2.setText(arr2.getType());
					txt_list_1_3.setText(arr2.getFee_yn());
					txt_list_1_4.setText("평가보기");
					if (iter.hasNext() == true) {
						arr2 = iter.next();
						w[1] = arr2;
					} else {
						arr2 = vv;
						w[1] = arr2;
					}
					txt_list_2_1.setText(arr2.getName());
					txt_list_2_2.setText(arr2.getType());
					txt_list_2_3.setText(arr2.getFee_yn());
					txt_list_2_4.setText("평가보기");
					if (iter.hasNext() == true) {
						arr2 = iter.next();
						w[2] = arr2;
					} else {
						arr2 = vv;
						w[2] = arr2;
					}
					txt_list_3_1.setText(arr2.getName());
					txt_list_3_2.setText(arr2.getType());
					txt_list_3_3.setText(arr2.getFee_yn());
					txt_list_3_4.setText("평가보기");
					if (iter.hasNext() == true) {
						arr2 = iter.next();
						w[3] = arr2;
					} else {
						arr2 = vv;
						w[3] = arr2;
					}
					txt_list_4_1.setText(arr2.getName());
					txt_list_4_2.setText(arr2.getType());
					txt_list_4_3.setText(arr2.getFee_yn());
					txt_list_4_4.setText("평가보기");

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

				@Override
				public void mouseClicked(MouseEvent e) {

					if (iter.hasNext() == true) {
						arr2 = iter.next();
						w[0] = arr2;
					} else {
						arr2 = vv;
						w[0] = arr2;
					}
					txt_list_1_1.setText(arr2.getName());
					txt_list_1_2.setText(arr2.getType());
					txt_list_1_3.setText(arr2.getFee_yn());
					txt_list_1_4.setText("평가보기");
					if (iter.hasNext() == true) {
						arr2 = iter.next();
						w[1] = arr2;
					} else {
						arr2 = vv;
						w[1] = arr2;
					}
					txt_list_2_1.setText(arr2.getName());
					txt_list_2_2.setText(arr2.getType());
					txt_list_2_3.setText(arr2.getFee_yn());
					txt_list_2_4.setText("평가보기");
					if (iter.hasNext() == true) {
						arr2 = iter.next();
						w[2] = arr2;
					} else {
						arr2 = vv;
						w[2] = arr2;
					}
					txt_list_3_1.setText(arr2.getName());
					txt_list_3_2.setText(arr2.getType());
					txt_list_3_3.setText(arr2.getFee_yn());
					txt_list_3_4.setText("평가보기");
					if (iter.hasNext() == true) {
						arr2 = iter.next();
						w[3] = arr2;
					} else {
						arr2 = vv;
						w[3] = arr2;
					}
					txt_list_4_1.setText(arr2.getName());
					txt_list_4_2.setText(arr2.getType());
					txt_list_4_3.setText(arr2.getFee_yn());
					txt_list_4_4.setText("평가보기");

					if (arr2.getName().equals("")) {
						ArrayList<FCVO> arr = s_dao.fc_arr;
						iter = arr.iterator();
					}
				}
			});

			Image image = new ImageIcon(path + "06 검색결과.png").getImage();
			panel.setLayout(null);

			JLabel lbl_image = new JLabel(
					new ImageIcon(SearchResult.class.getResource("/image/06 \uAC80\uC0C9\uACB0\uACFC.PNG")));
			lbl_image.setBounds(0, 10, 875, 581);
			panel.add(lbl_image);

		} catch (NullPointerException e) {
			System.out.println("오류");
			e.printStackTrace();
		} finally {

		}

	}
}

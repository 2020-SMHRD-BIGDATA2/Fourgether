package FourUI;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class FacilityInformation {

	private JFrame frame;
	private JTextField txt_Count;
	private JTextField txt_Id;
	private JTextField txt_PhoneNumber;
	Image[] list = new Image[8];
	static FacilityInformationDAO ww = new FacilityInformationDAO();
	static LoginDAO lg = new LoginDAO();
	static UserVO uv = new UserVO();
	static String path = System.getProperty("user.dir") + "\\src\\image\\";
	static JTextField txt_Email;
	static String month;
	static String day;
	static String time;
	
	
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FacilityInformation window = new FacilityInformation();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public FacilityInformation() {
		initialize();
	}
	
	
	
	
	
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 893, 570);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();

		panel.setBounds(0, 0, 875, 513);
		frame.getContentPane().add(panel);
		
		txt_Count = new JTextField();
		txt_Count.setHorizontalAlignment(SwingConstants.CENTER);
		txt_Count.setColumns(10);
		txt_Count.setBounds(453, 181, 48, 21);
		panel.add(txt_Count);
		txt_Count.setOpaque(false);
		txt_Count.setBorder(null);
		txt_Count.setText(0+"");
		txt_Id = new JTextField();
		txt_Id.setColumns(10);
		txt_Id.setBounds(699, 301, 153, 21);
		panel.add(txt_Id);
		txt_Id.setOpaque(false);
		txt_Id.setBorder(null);
		boolean a = true;
		if(uv.id == null ) {
			txt_Id.setText("");
		}else {
			txt_Id.setText(uv.getId());
		}
		
		txt_PhoneNumber = new JTextField();
		txt_PhoneNumber.setColumns(10);
		txt_PhoneNumber.setBounds(699, 349, 153, 24);
		panel.add(txt_PhoneNumber);
		
		txt_PhoneNumber.setOpaque(false);
		txt_PhoneNumber.setBorder(null);
		if(uv.ph_num == null ) {
			txt_PhoneNumber.setText("");
		}else {
			txt_PhoneNumber.setText(uv.ph_num);
		}
		
		txt_Email = new JTextField();
		txt_Email.setColumns(10);
		txt_Email.setBounds(699, 360, 153, 24);
		panel.add(txt_Email);
		txt_Email.setOpaque(false);
		txt_Email.setBorder(null);
		
		
		
		
		JLabel lbl_FacilityName = new JLabel("");
		lbl_FacilityName.setBounds(130, 90, 224, 30);
		
		lbl_FacilityName.setText(ww.fcvo !=null ?ww.fcvo.getName():"");
		
		panel.add(lbl_FacilityName);
		
		JLabel btn_goFacilityInfo = new JLabel("");
		list[0] = new ImageIcon(path+"시설목록으로가기2.png").getImage();
		list[1] = new ImageIcon(path+"시설목록으로가기1.png").getImage();

		btn_goFacilityInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_goFacilityInfo.setIcon(new ImageIcon(list[0]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_goFacilityInfo.setIcon(new ImageIcon(list[1]));

			}
		});
		
		btn_goFacilityInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();  
				SearchResult.main(null);
			}
		});
		btn_goFacilityInfo.setBounds(700, 0, 154, 39);
		panel.add(btn_goFacilityInfo);
		
		JLabel btn_goPay = new JLabel("");
		list[6] = new ImageIcon(path+"결제창이동2.png").getImage();
		list[7] = new ImageIcon(path+"결제창이동1.png").getImage();

		btn_goPay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_goPay.setIcon(new ImageIcon(list[6]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_goPay.setIcon(new ImageIcon(list[7]));

			}
			
			
			
		});
		
		btn_goPay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					frame.dispose();  
					
					Pay.main(null);
				}
			}
		);
		btn_goPay.setBounds(676, 447, 208, 62);
		panel.add(btn_goPay);
		
		
		JLabel lbl_graph = new JLabel("");
		lbl_graph.setBounds(368, 266, 263, 247);
		panel.add(lbl_graph);
		
		
		JLabel lbl_FacilityType = new JLabel("");
		lbl_FacilityType.setBounds(129, 131, 224, 30);
		panel.add(lbl_FacilityType);
		lbl_FacilityType.setText(ww.fcvo !=null ? ww.fcvo.getType() : "");
		
		
		
		
		JLabel lbl_Address = new JLabel("");
		lbl_Address.setBounds(130, 172, 224, 30);
		panel.add(lbl_Address);
		lbl_Address.setText(ww.fcvo !=null ? ww.fcvo.getAddr_new() : "");
		
		JLabel lbl_Managing = new JLabel("");
		lbl_Managing.setBounds(130, 215, 224, 30);
		panel.add(lbl_Managing);
		lbl_Managing.setText(ww.fcvo !=null ?  ww.fcvo.getAr_name(): "");
		
		JLabel lbl_Department = new JLabel("");
		lbl_Department.setBounds(130, 256, 224, 30);
		panel.add(lbl_Department);
		lbl_Department.setText(ww.fcvo !=null ? ww.fcvo.getDp_name(): "");
		
		JLabel lbl_Homepage = new JLabel("");
		lbl_Homepage.setBounds(130, 304, 224, 30);
		panel.add(lbl_Homepage);
		lbl_Homepage.setText(ww.fcvo !=null ? ww.fcvo.getHome_url(): "");
		
		JLabel lbl_PhoneNumber = new JLabel("");
		lbl_PhoneNumber.setBounds(130, 343, 224, 30);
		panel.add(lbl_PhoneNumber);
		lbl_PhoneNumber.setText(ww.fcvo !=null ? ww.fcvo.getPh_num(): "");
		
		JLabel lbl_AvaliableCount = new JLabel("");
		lbl_AvaliableCount.setBounds(130, 391, 224, 24);
		panel.add(lbl_AvaliableCount);
		lbl_AvaliableCount.setText(ww.fcvo !=null ? ww.fcvo.getSum_people(): "");
		
		JLabel lbl_SubFacility = new JLabel("");
		lbl_SubFacility.setBounds(130, 435, 224, 24);
		panel.add(lbl_SubFacility);
		
		
		JLabel lbl_Fee = new JLabel("");
		lbl_Fee.setBounds(130, 480, 224, 24);
		panel.add(lbl_Fee);
		lbl_Fee.setText(ww.fcvo !=null ? ww.fcvo.getFee_yn(): "");
		
		JLabel btn_Plus = new JLabel("");
		list[2] = new ImageIcon(path+"플러스1.png").getImage();
		list[3] = new ImageIcon(path+"플러스2.png").getImage();

		btn_Plus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_Plus.setIcon(new ImageIcon(list[2]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_Plus.setIcon(new ImageIcon(list[3]));

			}
			@Override
			public void mouseClicked(MouseEvent e) {
				txt_Count.setText(Integer.parseInt(txt_Count.getText())+1 + "");
				
				
			}
		});
		
		btn_Plus.setBounds(408, 172, 37, 39);
		panel.add(btn_Plus);
		
		JLabel btn_Minus = new JLabel("");
		list[4] = new ImageIcon(path+"마이너스1.png").getImage();
		list[5] = new ImageIcon(path+"마이너스2.png").getImage();

		btn_Minus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_Minus.setIcon(new ImageIcon(list[4]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_Minus.setIcon(new ImageIcon(list[5]));

			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				////
				txt_Count.setText((Integer.parseInt(txt_Count.getText())-1) + "");
			}
		});
		btn_Minus.setBounds(522, 174, 27, 33);
		panel.add(btn_Minus);
		lbl_PhoneNumber.setText(ww.fcvo !=null ?ww.fcvo.getSum_people(): "");
		
		
		JLabel lbl_max = new JLabel("New label");
		lbl_max.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_max.setBounds(670, 184, 57, 18);
		panel.add(lbl_max);
		lbl_max.setText(ww.fcvo !=null ?ww.fcvo.getSum_people(): "");
		
		
		
		
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String selection = (String) comboBox_1.getSelectedItem();
				System.out.println("Selected: " + selection);
				month = selection;
			}
		});
		
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\uC6D4 \uC120\uD0DD", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_1.setBounds(0, 0, 100, 21);
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"\uC77C \uC120\uD0DD", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		
		comboBox_2.setBounds(100, 0, 100, 21);
		comboBox_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String selection = (String) comboBox_1.getSelectedItem();
				System.out.println("Selected: " + selection);
				day = selection;
				
			}
		});
		
		
		
		
		panel.add(comboBox_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19"}));
		comboBox.setBounds(200, 0, 100, 21);
		
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String selection = (String) comboBox_1.getSelectedItem();
				System.out.println("Selected: " + selection);
				time = selection;
				
			}
		});
		
		panel.add(comboBox);
		
		
		
		
		
		
		
		
		
		
		
		Image image = new ImageIcon(path+"07 시설상세정보.png").getImage();
		panel.setLayout(null);

		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(881, 542, Image.SCALE_SMOOTH)));
		lbl_image.setBounds(0, 0, 875, 513);
		panel.add(lbl_image);
		
		
		lbl_image.setBounds(0, 0, 875, 513);
		panel.add(lbl_image);
		
		
		
		
		
		
		
		
		
		
	}
}

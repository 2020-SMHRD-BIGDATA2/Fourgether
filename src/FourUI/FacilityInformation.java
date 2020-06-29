package FourUI;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class FacilityInformation {
	static JLabel lbl_FacilityType;
	static JLabel lbl_FacilityName;
	static JLabel btn_goFacilityInfo;
	static FCVO fcvo;
	static ResFcVO resvo;
	
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
	static String email;
	

	
	
	
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
		txt_Count.setText(0 + "");
		txt_Id = new JTextField();
		txt_Id.setColumns(10);
		txt_Id.setBounds(699, 301, 153, 21);
		panel.add(txt_Id);
		txt_Id.setOpaque(false);
		txt_Id.setBorder(null);


		txt_Id.setText(uv.getId());

		txt_PhoneNumber = new JTextField();
		txt_PhoneNumber.setColumns(10);
		txt_PhoneNumber.setBounds(699, 349, 153, 24);
		panel.add(txt_PhoneNumber);

		txt_PhoneNumber.setOpaque(false);
		txt_PhoneNumber.setBorder(null);

		txt_PhoneNumber.setText(uv.ph_num);

		txt_Email = new JTextField();

		txt_Email.setText("email �ۼ���");
		txt_Email.setColumns(10);
		txt_Email.setBounds(699, 400, 153, 24);
		panel.add(txt_Email);
		txt_Email.setOpaque(false);
		txt_Email.setBorder(null);

		lbl_FacilityName = new JLabel("");
		lbl_FacilityName.setBounds(129, 100, 224, 28);
		lbl_FacilityName.setText(ww.fcvo.name);

		panel.add(lbl_FacilityName);

		btn_goFacilityInfo = new JLabel("");
		list[0] = new ImageIcon(path + "�ü�������ΰ���2.png").getImage();
		list[1] = new ImageIcon(path + "�ü�������ΰ���1.png").getImage();

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
		list[6] = new ImageIcon(path + "����â�̵�2.png").getImage();
		list[7] = new ImageIcon(path + "����â�̵�1.png").getImage();

		btn_goPay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_goPay.setIcon(new ImageIcon(list[6]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_goPay.setIcon(new ImageIcon(list[7]));

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				
				resvo = new ResFcVO("1", "1", day, time, month, ww.fcvo.code,uv.id); 
			}
		});

		btn_goPay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String selection = txt_Email.getText();
				System.out.println("Selected: " + selection);
				email = selection;
				frame.dispose();
				Pay.main(null);
			}
		});
		btn_goPay.setBounds(676, 447, 208, 62);
		panel.add(btn_goPay);

		//////
		JPanel lbl_graph = new JPanel();
		lbl_graph.setBounds(368, 266, 263, 247);
		
		

		ww.get();
		
		
		

	      //�׷����� ���� ������ ����ϰ� �ִ� ��ü�� ����
	      //����Ʈ
	      DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();
	      //������Ʈ
	      DefaultPieDataset dataset2 = new DefaultPieDataset();
	      
	      
//	      for(int i = 0; i<list.size(); i++) {
//	         arr.add(new VO(Integer.parseInt(list.get(i).getDivision()), list.get(i).getUsage(), Integer.parseInt(list.get(i).getMonth())));
//	      }
	      int[] page = {ww.energyvo.ac_value,ww.energyvo.cl_value , ww.energyvo.ct_value};
	      
//	      int[] page = {Integer.parseInt(list.get(2).getDivision()), list.get(2).getUsage(), Integer.parseInt(list.get(2).getMonth())};
	      
	      String[] a = {"���ټ�","û�ᵵ","�ü�����"};
	      String[] b = {"1","3","5"};
	      
	      //�׷��� ������ ����
	      //1.ũ�� 2.���� 3.x��
	      for(int i = 0; i < 3; i++) {
//	         dataset1.addValue(list.get(i).getUsage(),list.get(i).getMonth(), list.get(i).getDivision());
	         dataset1.addValue( page[i] ,a[i], a[i]);
//	         ,list.get(i).getMonth(), list.get(i).getDivision()
//	         dataset2.setValue(list.get(i).getDivision(), list.get(i).getUsage());
	      }
	      
	      //�׷����� �׸��� ��ü ����
	      //1.�׷����� ����, 2.x������, 3.y������, 4.�׷����� ������, 5.�׷����� ����(���Ʒ��޿�), 6.���ʻ�뿩��, 7.������뿩��, 8.Ȯ���뿩��
	      JFreeChart barChart = ChartFactory.createAreaChart("�ü� �������", "  ", "����", dataset1, PlotOrientation.VERTICAL, false, true, true );
//	      
	      JFreeChart piechart = ChartFactory.createPieChart("�Ⱓ�� ��뷮", dataset2, true, true, true);
	      //�ѱ� ���ڵ�
	      //�ѱ� �۾�ü�� ������ ��ü ����
	      //1. ��Ʈ����, 2.��Ʈ��Ÿ��, 3.ũ��
	      Font f = new Font("���ʷչ���", Font.PLAIN, 14);
	      //�׷��� ���� �ѱ� ����
	      barChart.getTitle().setFont(f);
//	      piechart.getTitle().setFont(f);
	      //x�� y�� �ѱ�����
	      CategoryPlot plot1 = barChart.getCategoryPlot();
	      plot1.getRangeAxis().setRange(0.0,5.0);
//	      PiePlot plot2 = (PiePlot)piechart.getPlot();
//	      plot2.setLabelFont(f);
//	      
	      //x��
	      plot1.getDomainAxis().setLabelFont(f);
	      plot1.getDomainAxis().setTickLabelFont(f);
	      //y��
	      plot1.getRangeAxis().setLabelFont(f);
	      plot1.getRangeAxis().setTickLabelFont(f);
	      
	      
	      SpringLayout sl_panel = new SpringLayout();
	      lbl_graph.setLayout(sl_panel);
	      
	      //�׷��� �׷����� ��Ʈ�гο� �ø���
	      ChartPanel chartpanel = new ChartPanel(barChart);

	      sl_panel.putConstraint(SpringLayout.NORTH, chartpanel, 0, SpringLayout.NORTH, lbl_graph);
	      sl_panel.putConstraint(SpringLayout.WEST, chartpanel, 0, SpringLayout.WEST, lbl_graph);
	      sl_panel.putConstraint(SpringLayout.SOUTH, chartpanel, 200, SpringLayout.NORTH, lbl_graph);
	      sl_panel.putConstraint(SpringLayout.EAST, chartpanel, 200, SpringLayout.WEST, lbl_graph);
	      lbl_graph.add(chartpanel);
		

		
		panel.add(lbl_graph);
		
		
		
		


		lbl_FacilityType = new JLabel("");
		lbl_FacilityType.setBounds(129, 132, 224, 30);
		panel.add(lbl_FacilityType);
		lbl_FacilityType.setText(ww.fcvo.type);

		JLabel lbl_Address = new JLabel("");
		lbl_Address.setBounds(130, 172, 224, 30);
		panel.add(lbl_Address);
		lbl_Address.setText(ww.fcvo.addr_new);

		JLabel lbl_Managing = new JLabel("");
		lbl_Managing.setBounds(129, 203, 224, 30);
		panel.add(lbl_Managing);
		lbl_Managing.setText(ww.fcvo.ar_name);

		JLabel lbl_Department = new JLabel("");
		lbl_Department.setBounds(129, 240, 224, 30);
		panel.add(lbl_Department);
		lbl_Department.setText(ww.fcvo.dp_name);

		JLabel lbl_Homepage = new JLabel("");
		lbl_Homepage.setBounds(129, 276, 224, 30);
		panel.add(lbl_Homepage);
		lbl_Homepage.setText(ww.fcvo.home_url);

		JLabel lbl_PhoneNumber = new JLabel("");
		lbl_PhoneNumber.setBounds(130, 314, 224, 30);
		panel.add(lbl_PhoneNumber);
		lbl_PhoneNumber.setText(ww.fcvo.ph_num);

		JLabel lbl_Ms_sq = new JLabel("");
		lbl_Ms_sq.setBounds(130, 348, 224, 30);
		panel.add(lbl_Ms_sq);
		lbl_Ms_sq.setText(ww.fcvo.ms_sq);

		JLabel lbl_AvaliableCount = new JLabel("");
		lbl_AvaliableCount.setBounds(129, 383, 224, 24);
		panel.add(lbl_AvaliableCount);
		lbl_AvaliableCount.setText(ww.fcvo.sum_people);

		JLabel lbl_Fee = new JLabel("");
		lbl_Fee.setBounds(129, 421, 224, 24);
		panel.add(lbl_Fee);
		lbl_Fee.setText(ww.fcvo.fee_yn);

		JLabel btn_Plus = new JLabel("");
		list[2] = new ImageIcon(path + "�÷���1.png").getImage();
		list[3] = new ImageIcon(path + "�÷���2.png").getImage();

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

				txt_Count.setText(Integer.parseInt(txt_Count.getText()) + 1 + "");

			}
		});

		btn_Plus.setBounds(408, 172, 37, 39);
		panel.add(btn_Plus);

		JLabel btn_Minus = new JLabel("");
		list[4] = new ImageIcon(path + "���̳ʽ�1.png").getImage();
		list[5] = new ImageIcon(path + "���̳ʽ�2.png").getImage();

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
				int i = Integer.parseInt(txt_Count.getText()) - 1;
				if (i < 0) {
					i = 0;
				}
				txt_Count.setText(i + "");
			}
		});
		btn_Minus.setBounds(522, 174, 27, 33);
		panel.add(btn_Minus);

		JLabel lbl_max = new JLabel("New label");
		lbl_max.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_max.setBounds(601, 188, 57, 18);
		panel.add(lbl_max);
		lbl_max.setText(ww.fcvo != null ? ww.fcvo.getSum_people() : "");

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String selection = (String) comboBox_1.getSelectedItem();
				System.out.println("Selected: " + selection);
				month = selection;
			}
		});

		comboBox_1.setModel(new DefaultComboBoxModel(
				new String[] { "\uC6D4 \uC120\uD0DD", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		comboBox_1.setBounds(431, 126, 100, 21);
		panel.add(comboBox_1);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "\uC77C \uC120\uD0DD", "1", "2", "3", "4", "5", "6",
				"7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24",
				"25", "26", "27", "28", "29", "30", "31" }));

		comboBox_2.setBounds(556, 126, 100, 21);
		comboBox_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String selection = (String) comboBox_1.getSelectedItem();
				System.out.println("Selected: " + selection);
				day = selection;

			}
		});

		panel.add(comboBox_2);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19" }));
		comboBox.setBounds(684, 126, 100, 21);

		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String selection = (String) comboBox_1.getSelectedItem();
				System.out.println("Selected: " + selection);
				time = selection;

			}
		});

		panel.add(comboBox);

		Image image = new ImageIcon(path + "07 �ü�������.png").getImage();
		panel.setLayout(null);

		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(881, 542, Image.SCALE_SMOOTH)));
		lbl_image.setBounds(0, 0, 875, 513);
		panel.add(lbl_image);

		lbl_image.setBounds(0, 0, 875, 513);
		panel.add(lbl_image);

	}
}
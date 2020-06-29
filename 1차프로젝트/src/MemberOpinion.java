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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class MemberOpinion {

	private JFrame frame;
	private JTextField txt_Opinoin;
	Image[] list = new Image[2];
	private int result = 1;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberOpinion window = new MemberOpinion();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public MemberOpinion() {
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
		
		txt_Opinoin = new JTextField();
		txt_Opinoin.setBounds(72, 337, 728, 86);
		panel.add(txt_Opinoin);
		txt_Opinoin.setColumns(10);
		txt_Opinoin.setOpaque(false);
		txt_Opinoin.setBorder(null);
		
		JLabel btn_OpinionSubmit = new JLabel("");
		list[0] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\평가완료2.png").getImage();
		list[1] = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\평가완료1.png").getImage();

		btn_OpinionSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_OpinionSubmit.setIcon(new ImageIcon(list[0]));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn_OpinionSubmit.setIcon(new ImageIcon(list[1]));

			}
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "평가해주셔서 감사합니다!","평가성공", JOptionPane.INFORMATION_MESSAGE);
				frame.dispose();  
				ReservationHistory.main(null);
				
			}
		});
		
		btn_OpinionSubmit.setBounds(371, 446, 162, 46);
		panel.add(btn_OpinionSubmit);
		
		
		JSlider slider_accessibility = new JSlider();
		slider_accessibility.addChangeListener(new ChangeListener() {
			
			public void stateChanged(ChangeEvent e) {
				System.out.println(result);
			}
		});
		slider_accessibility.setMinimum(1);
		slider_accessibility.setMajorTickSpacing(1);
		slider_accessibility.setMaximum(5);
		slider_accessibility.setValue(3);
		slider_accessibility.setPaintTicks(true);
		slider_accessibility.setPaintLabels(true);
		slider_accessibility.setForeground(Color.BLACK);
		slider_accessibility.setBackground(Color.WHITE);
		slider_accessibility.setBounds(246, 187, 437, 37);
		panel.add(slider_accessibility);
		
		
		
		JSlider slider_clean = new JSlider();
		slider_clean.setPaintLabels(true);
		result = slider_clean.getValue();
		slider_clean.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				System.out.println(result);
			}
		});
		slider_clean.setValue(3);
		slider_clean.setPaintTicks(true);
		slider_clean.setMinimum(1);
		slider_clean.setMaximum(5);
		slider_clean.setMajorTickSpacing(1);
		slider_clean.setForeground(Color.BLACK);
		slider_clean.setBackground(Color.WHITE);
		slider_clean.setBounds(246, 113, 437, 37);
		panel.add(slider_clean);
		
		JSlider slider_facilityCheck = new JSlider();
		slider_facilityCheck.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				System.out.println(result);
			}
		});
		slider_facilityCheck.setValue(3);
		slider_facilityCheck.setPaintTicks(true);
		slider_facilityCheck.setPaintLabels(true);
		slider_facilityCheck.setMinimum(1);
		slider_facilityCheck.setMaximum(5);
		slider_facilityCheck.setMajorTickSpacing(1);
		slider_facilityCheck.setForeground(Color.BLACK);
		slider_facilityCheck.setBackground(Color.WHITE);
		slider_facilityCheck.setBounds(246, 256, 437, 37);
		panel.add(slider_facilityCheck);
		
		String path = "C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\10 시설평가.png";
		Image image = new ImageIcon(path).getImage();
		panel.setLayout(null);

		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(881, 510, Image.SCALE_SMOOTH)));
		lbl_image.setBounds(0, 0, 875, 513);
		panel.add(lbl_image);
	}
}

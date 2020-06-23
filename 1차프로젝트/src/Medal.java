import java.awt.Container;
import java.awt.Image;
import java.util.ArrayList;

import javax.print.DocFlavor.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Medal {
	
	JLabel lbl_level = new JLabel(new ImageIcon(""));
	Image list1 = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\medal3.png").getImage();
	Image list2 = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\medal3.png").getImage();
	Image list3 = new ImageIcon("C:\\Users\\SMHRD\\Desktop\\JAVA eclipse\\JAVA_workspace\\1차프로젝트\\src\\image\\medal3.png").getImage();
	Image image1 = list1;
	lbl_level_1 = new JLabel(new ImageIcon(image1.getScaledInstance(45, 45, Image.SCALE_AREA_AVERAGING)));

}}
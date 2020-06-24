package FourUI;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginVO extends UserVO {
	
	LoginVO(String id, String pw){
		super(id,pw);
	}
	
	LoginVO(String id, String pw, String name, int pv_num, String ph_num, String addr) {
		super(id, pw, name, pv_num, ph_num, addr);
	}
	
	
}

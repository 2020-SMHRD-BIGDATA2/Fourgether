package FourUI;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginVO extends UserVO {
	LoginVO(String txt_id, String txt_pw){
		this.id = txt_id;
		this.pw = txt_pw;
	}
	
}

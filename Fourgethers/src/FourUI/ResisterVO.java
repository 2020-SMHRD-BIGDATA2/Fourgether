package FourUI;

public class ResisterVO extends UserVO{

	
	
	ResisterVO(String id, String pw) {
		super(id,pw);
	}
	

	ResisterVO(String id, String pw, String name, int pv_num, String ph_num, String addr) {
		super(id,pw,name,pv_num,ph_num,addr);
	}

}

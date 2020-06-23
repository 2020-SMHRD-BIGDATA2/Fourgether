package FourUI;

public class UserVO extends VO{
	private String id;
	private String pw;
	private String name;
	private int pv_num;
	private String ph_num;
	private String addr;

	public UserVO(String id, String pw, String name, int pv_num, String ph_num, String addr) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.pv_num = pv_num;
		this.ph_num = ph_num;
		this.addr = addr;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPv_num() {
		return pv_num;
	}

	public void setPv_num(int pv_num) {
		this.pv_num = pv_num;
	}

	public String getPh_num() {
		return ph_num;
	}

	public void setPh_num(String ph_num) {
		this.ph_num = ph_num;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}

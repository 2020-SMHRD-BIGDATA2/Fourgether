package FourUI;

public class energyVO {

	static int cl_value; // 구분
	static int ac_value; // 사용량
	static int ct_value; // 월

	public energyVO(int clean, int ac_value, int ct_value) {
		this.cl_value = clean;
		this.ac_value = ac_value;
		this.ct_value = ct_value;
	}

	public int getCl_value() {
		return cl_value;
	}

	public void setClean(int clean) {
		this.cl_value = clean;
	}

	public int getAc_value() {
		return ac_value;
	}

	public void setAc_value(int ac_value) {
		this.ac_value = ac_value;
	}

	public int getCt_value() {
		return ct_value;
	}

	public void setCt_value(int ct_value) {
		this.ct_value = ct_value;
	}

}
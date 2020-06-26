package FourUI;

public class ResFcVO extends UserVO {
	static String code;
	static String week_num="1";
	static String day_num;
	static String day_time;
	static String day_month;
	static String fc_code;
	static String user_id;
	public ResFcVO(String code, String week_num, String day_num, String day_time, String day_month, String fc_code,
			String user_id) {
		this.code = code;
		this.week_num = week_num;
		this.day_num = day_num;
		this.day_time = day_time;
		this.day_month = day_month;
		this.fc_code = fc_code;
		this.user_id = user_id;
	}

	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getWeek_num() {
		return week_num;
	}

	public void setWeek_num(String week_num) {
		this.week_num = week_num;
	}

	public String getDay_num() {
		return day_num;
	}

	public void setDay_num(String day_num) {
		this.day_num = day_num;
	}

	public String getDay_time() {
		return day_time;
	}

	public void setDay_time(String day_time) {
		this.day_time = day_time;
	}

	public String getDay_month() {
		return day_month;
	}

	public void setDay_month(String day_month) {
		this.day_month = day_month;
	}

	public String getFc_code() {
		return fc_code;
	}

	public void setFc_code(String fc_code) {
		this.fc_code = fc_code;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

}

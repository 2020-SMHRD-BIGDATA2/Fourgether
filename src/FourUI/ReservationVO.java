package FourUI;

public class ReservationVO extends UserVO {
	String code;
	String month;
	String week_num;
	String day_num;
	String day_time;
	String fc_name;
	String user_id;
	
	public ReservationVO(String code,String month,String week_num, String day_num,String day_time, String fc_name,String user_id) {
		this.code = code;
		this.month = month;
		this.week_num = week_num;
		this.day_num = day_num;
		this.day_time = day_time;
		this.fc_name = fc_name;
		this.user_id = user_id;
		
	}
	
	
	public ReservationVO(String id, String pw) {
		super(id, pw);
		// TODO Auto-generated constructor stub
	}
	
	

}

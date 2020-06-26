package FourUI;

import java.sql.SQLException;

public class OpinionDAO extends LoginDAO {
	static int Tcode;
	public int opinion(int clean, int acces, int control, String des, String fc_name, String user_id) {

		int cnt = 0;
		getConnection();

		try {
			
			String sql = "insert into ev_fc_inf values(ev_seq.nextval,?,?,?,?,(select code from fc where name = ?),?)";
			psmt = conn.prepareStatement(sql);
			// psmt.setInt(1, code);
			psmt.setInt(1, clean);
			psmt.setInt(2, acces);
			psmt.setInt(3, control);
			psmt.setString(4, des);
			psmt.setString(5, fc_name);
			psmt.setString(6, user_id);
			cnt = psmt.executeUpdate();
			delreservation(fc_name,user_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;
	}
	
	public int delreservation(String fc_name, String user_id) {

		int cnt = 0;
		getConnection();

		try {
			String sql = "delete from end_res_fc where fc_code = (select code from fc where name = ?) and user_id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, fc_name);
			psmt.setString(2, user_id);
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
			
		}

		return cnt;
	}
	
	
	


}
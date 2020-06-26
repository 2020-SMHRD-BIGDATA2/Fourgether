package FourUI;

import java.sql.SQLException;
import java.util.ArrayList;

public class FacilityInformationDAO extends DAO{
	static FCVO fcvo;
	static energyVO energyvo;
	static UserVO usvo;
	static ResFcVO resvo;
	int insert() {
		int cnt = 0;
		getConnection();
		String sql = "insert into res_fc values(seq.nextval,?,?,?,?,?,?,sysdate)";
		try {	
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,"21");
			psmt.setString(2, resvo.day_num);
			psmt.setString(3, resvo.day_time);
			psmt.setString(4, resvo.day_month);
			System.out.println(resvo.fc_code);
			psmt.setInt(5, Integer.parseInt(resvo.fc_code));
			psmt.setString(6, usvo.id);
			cnt = psmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return cnt;
	}
	void get() {

		getConnection();
		String sql = "select AVG(CL_VALUE), AVG(AC_VALUE), AVG(CT_VALUE) from EV_FC_INF WHERE FC_CODE = ? group by FC_CODE";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, Integer.parseInt(fcvo.code));
			rs= psmt.executeQuery();
			int a=0;
			int b=0;
			int c=0;
			System.out.println(a+" "+b+" "+c);
			while(rs.next()) {
				a = rs.getInt(1);
				b = rs.getInt(2);
				c = rs.getInt(3);
				energyvo = new energyVO(a,b,c);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			close();
		}
	}
	
	
	
	
}

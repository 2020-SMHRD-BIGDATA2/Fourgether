package FourUI;

import java.sql.SQLException;
import java.util.ArrayList;

public class ReservationDAO extends DAO {
	static ArrayList<ReservationVO> reservation = new ArrayList<ReservationVO>();
	static ArrayList<ReservationVO> used = new ArrayList<ReservationVO>();
	static ArrayList<ReservationVO> complete = new ArrayList<ReservationVO>();
	static ReservationVO res;

	
	
	public void setRes1(ReservationVO vo) {
		res = vo;
	}
	public void setRes2(ReservationVO vo) {
		res = vo;
	}
	
	
	public void clear() {
		
		
		
	}
	
	
	static UserVO usvo = new UserVO();
	public void print_reservation() {
		ArrayList<ReservationVO> a = reservation;
		for (int i = 0; i < reservation.size(); i++) {
			System.out.print(a.get(i).addr + " ");
			System.out.print(a.get(i).cnt + " ");
			System.out.print(a.get(i).code + " ");
			System.out.print(a.get(i).day_num + " ");
			System.out.print(a.get(i).day_time + " ");
			System.out.print(a.get(i).month + " ");
			System.out.print(a.get(i).user_id + " ");
			System.out.print(a.get(i).week_num + " ");
			System.out.print(a.get(i).fc_name + " ");
			System.out.println();
		}
	}

	public void print_used() {
		ArrayList<ReservationVO> a = used;
		for (int i = 0; i < used.size(); i++) {
			System.out.print(a.get(i).addr + " ");
			System.out.print(a.get(i).cnt + " ");
			System.out.print(a.get(i).code + " ");
			System.out.print(a.get(i).day_num + " ");
			System.out.print(a.get(i).day_time + " ");
			System.out.print(a.get(i).month + " ");
			System.out.print(a.get(i).user_id + " ");
			System.out.print(a.get(i).week_num + " ");
			System.out.print(a.get(i).fc_name + " ");
			System.out.println();
		}
	}

	public void print_complete() {
		ArrayList<ReservationVO> a = complete;
		for (int i = 0; i < complete.size(); i++) {
			System.out.print(a.get(i).addr + " ");
			System.out.print(a.get(i).cnt + " ");
			System.out.print(a.get(i).code + " ");
			System.out.print(a.get(i).day_num + " ");
			System.out.print(a.get(i).day_time + " ");
			System.out.print(a.get(i).month + " ");
			System.out.print(a.get(i).user_id + " ");
			System.out.print(a.get(i).week_num + " ");
			System.out.print(a.get(i).fc_name + " ");
			System.out.println();
		}
	}

	public int get_reservation() {
		int cnt = 0;

		getConnection();

		try {
			reservation = null;
			reservation = new ArrayList<ReservationVO>();
			String sql = "select code,month,week_num,day_num,day_time,(select name from fc where code = fc_code) as name,user_id from res_fc where user_id  = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, usvo.id);// userVO.id
			rs = psmt.executeQuery();
			while (rs.next()) {
				String code = rs.getString(1);
				String month = rs.getString(2);
				String week_num = rs.getString(3);
				String day_num = rs.getString(4);
				String day_time = rs.getString(5);
				String fc_name = rs.getString(6);
				String user_id = rs.getString(7);
				ReservationVO vo = new ReservationVO(code, month, week_num, day_num, day_time, fc_name, user_id);

				reservation.add(vo);
				cnt = 1;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;

	}

	public int get_used() {
		int cnt = 0;

		getConnection();

		try {
			used = null;
			used = new ArrayList<ReservationVO>();
			String sql = "select code,month,week_num,day_num,day_time,(select name from fc where code = fc_code) as name,user_id from end_res_fc where user_id  = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, usvo.id);// userVO.id
			rs = psmt.executeQuery();
			while (rs.next()) {
				String code = rs.getString(1);
				String month = rs.getString(2);
				String week_num = rs.getString(3);
				String day_num = rs.getString(4);
				String day_time = rs.getString(5);
				String fc_name = rs.getString(6);
				String user_id = rs.getString(7);
				ReservationVO vo = new ReservationVO(code, month, week_num, day_num, day_time, fc_name, user_id);

				used.add(vo);
				cnt = 1;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;

	}

	public int get_complete() {
		int cnt = 0;

		getConnection();

		try {
			complete = null;
			complete = new ArrayList<ReservationVO>();
			String sql = "select code,month,week_num,day_num,day_time,(select name from fc where code = fc_code) as name,user_id from com_res_fc where user_id  = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, usvo.id);// userVO.id
			rs = psmt.executeQuery();
			while (rs.next()) {
				String code = rs.getString(1);
				String month = rs.getString(2);
				String week_num = rs.getString(3);
				String day_num = rs.getString(4);
				String day_time = rs.getString(5);
				String fc_name = rs.getString(6);
				String user_id = rs.getString(7);
				ReservationVO vo = new ReservationVO(code, month, week_num, day_num, day_time, fc_name, user_id);

				complete.add(vo);
				cnt = 1;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;

	}


	
	public int opinion() {

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

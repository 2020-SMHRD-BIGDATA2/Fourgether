package FourUI;

import java.sql.SQLException;
import java.util.ArrayList;

public class ReservationDAO extends DAO {
	// ���ϱ� ���� ���õ� ��ü
	static EndResVO ervo = new EndResVO();
	// ���ϱ� ���� ���õ� ��ü�� �� �ü� ����
	static FCVO fcvo = new FCVO();
	// ��� �Ϸ�� ��� ��ü ����Ʈ
	static ArrayList<EndResVO> arr = new ArrayList<EndResVO>();
	
	
	public int get_fc() {
		getConnection();
		int cnt = 0;
		String sql = "select * from fc where code = ?";
		System.out.println("code�� "+ervo.code);
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, ervo.code);
			rs = psmt.executeQuery();
			cnt = 1;
			while (rs.next()) {
				String code = rs.getString(1);
				String name = rs.getString(2);
				String type1 = rs.getString(3);
				String max_time = rs.getString(4);
				String sum_people = rs.getString(5);
				String ms_sq = rs.getString(6);
				String img_url = rs.getString(7);
				String home_url = rs.getString(8);
				String fee_yn = rs.getString(9);
				String start = rs.getString(10);
				String end = rs.getString(11);
				String lat = rs.getString(12);
				String lon = rs.getString(13);
				String addr_new = rs.getString(14);
				String ph_num = rs.getString(15);
				String dp_name = rs.getString(16);
				String ar_name = rs.getString(17);
				FCVO fcvo = new FCVO(code, name, type1, max_time, sum_people, ms_sq, img_url, home_url, fee_yn,
						start, end, lat, lon, addr_new, ph_num, dp_name, ar_name);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return cnt;
		} finally {
			close();
		}
		return cnt;
	}
	
	//print arr
	public void print() {
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i).getName());
		}
	}
	
	
	// ERVO�� ���� ����� ��� select * from end_res_fc -> ArrayList<erVO> -> 1, 0 ����
	public int getEndResAll() {
		getConnection();
		int cnt = 0;
		String sql = "select * from end_res_fc where user_id = ?";
		System.out.println("getEndREsAALl");
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, fcvo.id);
			rs = psmt.executeQuery();
			cnt = 1;
			System.out.println("select ����");
			while (rs.next()) {
				System.out.println("select ����2");
				String code = rs.getString(1);
				String month = rs.getString(2);
				String week_num = rs.getString(3);
				String day_num = rs.getString(4);
				String day_time = rs.getString(5);
				String fc_code = rs.getString(6);
				String user_id = rs.getString(7);

				EndResVO w = new EndResVO(code, month, week_num, day_num, day_time, fc_code, user_id);
				arr.add(w);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return cnt;
		} finally {
			close();
		}
		return cnt;
	}

	// insert into tablename values ( ev_fc_inf_seq.nextval , clean, acce, control,
	// des, fc_code,user_id)

	public int opinion() {
		int cnt = 0;

		// dbconect
		getConnection();

		// insert

		try {
			String sql = "insert into COM_RES_FC values(?,?,?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, ervo.code);
			psmt.setString(2, ervo.month);
			psmt.setString(3, ervo.week_num);
			psmt.setString(4, ervo.day_num);
			psmt.setString(5, ervo.day_time);
			psmt.setString(6, fcvo.code);
			psmt.setString(7, fcvo.id);
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;

		// delete ���� ������ ���� (code�� user_id�� ������ delete���� �����.)

	}
}

package FourUI;

import java.sql.SQLException;
import java.util.ArrayList;

public class ReservationDAO extends DAO {
	// 평가하기 위해 선택된 객체
	static EndResVO erVO = new EndResVO();
	// 로그인된 정보 객체
	static UserVO userVO = new UserVO();
	// 평가하기 위해 선택된 객체의 상세 시설 정보
	static FCVO fcvo = new FCVO();
	// 사용 완료된 모든 객체 리스트
	static ArrayList<EndResVO> arr = new ArrayList<EndResVO>();

	// ERVO에 값을 만드는 기능 select * from end_res_fc -> ArrayList<erVO> -> 1, 0 도출
	public int getEndResAll() {
		getConnection();
		int cnt = 0;
		String sql = "select * from end_res_fc where user_id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, userVO.id);
			rs = psmt.executeQuery();
			cnt = 1;
			while (rs.next()) {
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
			psmt.setString(1, erVO.code);
			psmt.setString(2, erVO.month);
			psmt.setString(3, erVO.week_num);
			psmt.setString(4, erVO.day_num);
			psmt.setString(5, erVO.day_time);
			psmt.setString(6, fcvo.code);
			psmt.setString(7, userVO.id);
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;

		// delete 원본 데이터 삭제 (code와 user_id를 가지고 delete문을 만든다.)

	}
}

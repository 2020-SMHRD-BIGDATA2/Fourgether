package FourUI;

import java.sql.SQLException;

public class JoinDAO extends DAO{
	
	
	public int join(ResisterVO vo) {
		int cnt = 0;

		getConnection();

		try {
			String sql = "INSERT INTO USERS VALUES(?,?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			psmt.setString(3, vo.getName());
			psmt.setInt(4, vo.getPv_num());
			psmt.setString(5, vo.getPh_num());
			psmt.setString(6, vo.getAddr());
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;

	}

	// 아이디 중복 확인
	public int idCheck(UserVO vo) {
		int cnt = 0;
		getConnection();
		String userid = vo.getId();

		try {
			String sql = "SELECT id from users where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, userid);
			rs = psmt.executeQuery();
			if (rs.next()) {
				cnt = 0;

			} else {
				cnt = 1;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;

	}
	
	// 칸이 비어있으면 더 입력해달라고 출력
	
	


}

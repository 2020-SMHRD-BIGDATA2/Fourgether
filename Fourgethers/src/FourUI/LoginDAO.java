package FourUI;

import java.sql.SQLException;

public class LoginDAO extends DAO {

	int isLogin(UserVO vo) {
		String id = vo.getId();
		if (id.isEmpty()) {
			return 1;
		} else {
			return 0;
		}
	}

	public int logCheck(LoginVO vo) {
		int cnt = 0;

		getConnection();

		String id = vo.getId();
		String pw = vo.getPw();

		try {
			String sql = "SELECT ID,PW FROM USERS WHERE ID = ? AND PW = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			rs = psmt.executeQuery();

			if (rs.next()) {
				cnt = 1;
			} else {
				cnt = 0;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;

	}

}

package FourUI;

import java.sql.SQLException;

public class LoginDAO extends DAO {
	UserVO vow = new UserVO();
	
	int isLogin(UserVO vo) {
		String id = vo.getId();
		if (id.isEmpty()) {
			return 1;
		} else {
			return 0;
		}
	}
	//id�� pw�� ������ �α����� ��, ��� ������ UserVO�� �����Ű��
	void full_info() {
		String a = vow.id;
	}
	

	public int logCheck(LoginVO vo) {
		int cnt = 0;

		getConnection();

		String id = vo.getId();
		String pw = vo.getPw();

		try {
			String sql = "SELECT * FROM USERS WHERE ID = ? AND PW = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			rs = psmt.executeQuery();
			
			if (rs.next()) {
				vow.name = rs.getString(3);
				vow.pv_num  = rs.getInt(4);
				vow.ph_num  = rs.getString(5);
				vow.addr  = rs.getString(6);
				System.out.println(rs.getInt(4));
				System.out.println(rs.getString(5));
				System.out.println(rs.getString(6));
				
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

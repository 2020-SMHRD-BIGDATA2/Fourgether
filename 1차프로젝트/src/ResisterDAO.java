import java.io.Closeable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ResisterDAO {

	private ResultSet rs;
	private Connection conn;
	private PreparedStatement psmt;

	// DB ���� �޼ҵ�
	private void getConnection() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "temp";
			String db_pw = "temp";
			try {
				conn = DriverManager.getConnection(db_url, db_id, db_pw);
			} catch (SQLException e) {

				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

	}

	// �ݾ� �ִ� �޼ҵ�
	private void close() {

		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	// ȸ�� ���� �޼ҵ�
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

	// ���̵� �ߺ� Ȯ��
	public int idCheck(ResisterVO vo) {
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

	// �α��� ����/����
	public int logCheck(ResisterVO vo) {
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

	// ȸ������â�� ȸ������ ǥ��
	public int updateId(ResisterVO vo) {
		
		return 0;

		
	}

	// ȸ����������

	public int update(ResisterVO vo) {

		int cnt = 0;

		getConnection();

		try {
			String sql = "update users set  pw= ?, name= ?, pv_num = ?, ph_num = ? ,addr = ? where id = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, vo.getPw());
			psmt.setString(2, vo.getName());
			psmt.setInt(3, vo.getPv_num());
			psmt.setString(4, vo.getPh_num());
			psmt.setString(5, vo.getAddr());

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;
	}

}

package FourUI;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.io.IOException;
import java.sql.Connection;

public class Connect {
	static Connection conn;
	static PreparedStatement pst;
	static ArrayList<String> arr = new ArrayList<String>();
	
	public ArrayList<String> select(String sql, String id, String pw, int cnt) {
		try {
			pst = prepared(sql, id, pw);

			pst = conn.prepareStatement(sql);

			ResultSet rs = pst.executeQuery(); // insert, update, delete, create : executeUpdate()를 사용. 리턴 : 명령에 성공한 횟수.
			// select : executeQuery(). 리턴 : 검색된 데이터.

			while (rs.next()) { // .next : 데이터가 있으면 True, 없으면 False반환
				// arr.add(rs.get)
				for (int i = 1; i <= cnt; i++) {
					String a = rs.getString(i);
					System.out.println(a);
					arr.add(a);
				}
			}
			return arr;
		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {
				pst.close();
				conn.close();
			} catch (Exception e) {
				// TODO: handle exception
			} finally {

			}
		}
		return null;

	}

	public PreparedStatement prepared(String sql, String id, String pw) {
		try {
			conn = conn(id, pw);
			pst = conn.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pst;
	}

	public Connection conn(String id, String pw) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// db주소, id, pw // 내 자신의 아이피 주소는 127.0.0.1
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = id;
			String dbpw = pw;

			// 3. DB로 가서 실제 DBID와 DBPW를 인증받는 절차

			DriverManager.getConnection(url, dbid, dbpw);

			// 4. 성공적으로 인증을 받았으면 db를 핸들링할 수 있는 Connection 객체를 리턴
			conn = DriverManager.getConnection(url, dbid, dbpw);

			if (conn != null) {
				System.out.println("연결성공");
				return conn;
			} else {
				System.out.println("연결실패");
				return null;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

}

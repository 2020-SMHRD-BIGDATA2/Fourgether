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

			ResultSet rs = pst.executeQuery(); // insert, update, delete, create : executeUpdate()�� ���. ���� : ��ɿ� ������ Ƚ��.
			// select : executeQuery(). ���� : �˻��� ������.

			while (rs.next()) { // .next : �����Ͱ� ������ True, ������ False��ȯ
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

			// db�ּ�, id, pw // �� �ڽ��� ������ �ּҴ� 127.0.0.1
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = id;
			String dbpw = pw;

			// 3. DB�� ���� ���� DBID�� DBPW�� �����޴� ����

			DriverManager.getConnection(url, dbid, dbpw);

			// 4. ���������� ������ �޾����� db�� �ڵ鸵�� �� �ִ� Connection ��ü�� ����
			conn = DriverManager.getConnection(url, dbid, dbpw);

			if (conn != null) {
				System.out.println("���Ἲ��");
				return conn;
			} else {
				System.out.println("�������");
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

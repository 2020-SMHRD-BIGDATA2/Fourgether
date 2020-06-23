package exJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ex05OneSelect {
// ���ϴ� ID�� �˻��ϱ�!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� ID �Է� : ");
		String searchId = sc.next();

		Connection conn = null;
		PreparedStatement pst = null;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "system";
			String dbpw = "12345";

			DriverManager.getConnection(url, dbid, dbpw);

			conn = DriverManager.getConnection(url, dbid, dbpw);

			String sql = "select * from member where id=?"; // where id = ? �߰�. ���⼭ ? �� searchId�̴�.

			pst = conn.prepareStatement(sql);
			
			pst.setString(1, searchId); // �� �ڵ带 �� ��ġ�� �߰�
			
			ResultSet rs = pst.executeQuery(); 
			
			while (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String nick = rs.getString(3);

				System.out.println(id + "\t" + pw + "\t" + nick);

			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {
				pst.close();
				conn.close();

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
